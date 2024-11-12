package logica_Programable;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
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
    private String [] recomendaciones ={ "Leche", "Pan", "Huevo", "Tortillas", "Arroz", "Frijol", "Azúcar"};
    
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
         //metodo para imprimir
    public void mostrarCarrito(){
        if (carrito.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Carrito vacio");
        } else {
            JOptionPane.showMessageDialog(null,"Productos en el carrito");
            for (String producto : carrito) {
                JOptionPane.showMessageDialog(null,"Productos en el carritos:\n"+producto);
            }
        }
    
    }
    
    //metodo para elminar un elemento de stack (pila)
    public void eliminarUltimoProducto(){
        if (!carrito.isEmpty()) {//si el carrito esta vacio !lo negamos para que no este vacio
            String producto= carrito.pop();//aqui estamos eliminando el ultimo elemento del carrito con el pop
            JOptionPane.showMessageDialog(null,"Producto Eliminado:\n"+producto);
        } else {
            JOptionPane.showMessageDialog(null,"Carrito vacio");
        }
    }
    
    // Método para recomendar productos en base a las compras anteriores
    public void recomendarProducto() {
        String sugerencia = obtenerSugerenciaBasadaEnHistorial();
        JOptionPane.showMessageDialog(null,"Basado en tus compras anteriores, te recomendamos: " + sugerencia);
    }

    // Obtiene una sugerencia en función del historial de compras o un producto aleatorio
    private String obtenerSugerenciaBasadaEnHistorial() {
        // Busca el producto más comprado
        String sugerencia = null;
        int maxCompras = 0;
        for (Map.Entry<String, Integer> entry : historialCompras.entrySet()) {
            if (entry.getValue() > maxCompras) {
                maxCompras = entry.getValue();
                sugerencia = entry.getKey();
            }
        }
        // Si no hay historial o quiere variar, sugiere uno aleatorio de la lista
        if (sugerencia == null || Math.random() < 0.3) {
            Random random = new Random();
            sugerencia = recomendaciones[random.nextInt(recomendaciones.length)];
        }
        return sugerencia;
    }
}
