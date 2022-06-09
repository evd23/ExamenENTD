/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase para gestionar listas de productos
 * @author loned
 *
 */
public class ListaProductos {

	/**
	 * nombre de la lista de productos
	 */
	private String nombreLista;
    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el número de productos contenidos en la lista
     */
    private static int n = 0;
    
    private int getNumProductos() {
        return n;
    }

    private void setNumProductos(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no está vacía)
     * 
     * @param campo cadena a analizar
     * @return True: Cadena vacía, False: Cadena correcta
     */
    private boolean parametro_vacio(String campo){
    
        if ((campo.replace(" ","").isEmpty()) || (campo == null))  return true; else return false;
    }
/**
 * El metodo recibe un String, y con un if llamamos al metodo parametro_vacio
 * en el caso de que el String nombre sea null el nombre del elemento se pone por defecto "noNamed"
 * mientras que en el caso de que no sea nulo se le aplica el nombre recibido
 * @param nombre nombre de la lista de productos
 * 
 */
    public ListaProductos(String nombre) {
    	if (parametro_vacio(nombre)) {
    		this.nombreLista = "noNamed";
    	}
    	else {
    	this.nombreLista = nombre;
    	}
    }
    
    
   /**
    * El metodo devuelve el numero de productos que hay
    * @return int 
    */
    public int totalProductos(){
            return this.getNumProductos();
    }
    
    
    /**
     * El metodo comprueba si en la lista ya esta ese producto, si esta devuelve null, 
     * si no a�ade a la lista el codigo del producto y su nombre.
     * @param prod nombre del producto
     * @return True: null, False: prod
     */
    public Producto registraProducto(Producto prod) {
        
        if (listaP.containsKey(prod.getcode())) {
           return null;
        }
        listaP.put(prod.getcode(), prod);
        n++;
        this.setNumProductos(n);
        return prod;
    }
    
	/**
	 * Este metodo sirve para eliminar productos por su codigo
	 * si el producto existe, este se borra y se descuenta de la lista.
	 * @param codigo es el codigo del producto
	 * @return prod
	 */
    public Producto descartaProducto(String codigo) { 
        
        Producto prod = encuentraProducto(codigo);
        if (prod != null) {
	        listaP.remove(codigo);
	        n--;
	        this.setNumProductos(n);
        }
        return prod;
    }
    
   /**
    * Sirve para encontrar productos por su codigo
    * @param codigo es el codigo del producto
    * @return hashmap 
    */

    public Producto encuentraProducto(String codigo) { 
        Producto prod = null;
        
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
    }
/**
 * Devuelve un array con los productos registrados en la lista
 * @return array de productos 
 */
    public ArrayList<Producto> recuperaProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    

}
