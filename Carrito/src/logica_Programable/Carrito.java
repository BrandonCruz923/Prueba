package logica_Programable;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author capri
 */
public class Carrito {//Inica clase 
     //Declaracion de datos dinamica 
    private Stack <String> carrito;
    private Map <String, Integer> historialCompras;
    
    //Base de conocimientos
    private String [] recomiendaciones ={ "Leche", "Pan", "Huevo", "Tortillas", "Arroz", "Frijol", "Azúcar"};
    
    //Constructor inicializa las estructuras de datos dinamicas
     public Carrito() {
       carrito = new Stack<>();
       historialCompras = new HashMap<>();
       
     }//Termina constructor 
     
     //Actividades de mantenimiento de informacion
     //Alta
     public void agregarProducto(String producto){
         carrito.push(producto);
         historialCompras.put(producto, historialCompras.getOrDefault(producto, 0)+1);
         JOptionPane.showMessageDialog(null, "Agregado El  Producto Con Exito");
         }//Nuevo registro en la pila 
          
}
