//Una clase para logica de negocio -Programacion contiene los metodos de operaciones de las colas
package sesion36martinezed_cola1;

import javax.swing.JOptionPane;

/**
 *
 * @author capri
 */
//Inicia Clase
public class OperacionesCola {
    //Atributos y Caracteristicas de las colas principales
    private int frente;
    private  int fin;
    protected Object[ ] listaCola;
    
    //Constructur que inicializa los componentes principales de las colas
 public OperacionesCola(int tamMax){
       this. frente = 0;
       this.fin = -1;
       listaCola = new Object[tamMax];
    
       }//Termina Constructor
    //Metodo para insertar los elementos de la estructura cola
    public void insertar(Object dato) throws Exception{
        if (!colaLlena()) {
            fin++;
            listaCola[fin] = dato;
        } else {
            JOptionPane.showMessageDialog(null, "Error al insertar : Cola LLena");
        }
     }
    public boolean colaLlena(){
        int tamMax = 0;
       return fin == tamMax -1;
      
    }
    public int tamMax(){
        return listaCola.length;
    }
    
    public void imprimir(){
        for (int i = 0; i < tamMax() ;i++) {
            Object datoNuevo = listaCola[ i ];
            if(datoNuevo != null){
                JOptionPane.showInternalMessageDialog(null,  datoNuevo+"       :    ");
            }
            
        }
        
    }
    
}//Termina clase
