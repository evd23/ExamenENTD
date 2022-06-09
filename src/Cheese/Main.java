/*
*	grupo  : 1� GDAM
*	alumno : Elias Valiente
*	n.exp. : 7262
*	fecha  : 9/06/2022
 */
package Cheese;



/**
 * Clase main del examen
 * @author ___
 */
public class Main {
	/**
	 * Método main del examen
	 * @param args Argumentos para linea de comandos
	 * @author ___
	 */
     public static void main(String[] args) {
    
         System.out.println("1º Gdam: Entornos de desarrollo");
         
         ListaProductos lista = new ListaProductos("LISTACOMPRA");
         Producto producto1 = new Producto( "0001","Lacteo", 2, 10);
         Producto producto2 = new Producto( "0002","Congelado", 5, 5);
         lista.registraProducto(producto1);
         lista.registraProducto(producto2);
         producto1.imprime_etiqueta();
         producto2.imprime_etiqueta();
         

     }
}
