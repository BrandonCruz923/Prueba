//Una clase para logica de negocio -Programacion contiene los metodos de operaciones de las colas
package sesion36martinezed_cola1;

import javax.swing.JOptionPane;

/**
 *
 * @author capri
 */
//Inicia Clase
public class OperacionesCola {
    //Estructuras inicial y final de ED cola
    private int frente;
    private int fin;
    protected Object[] listaCola;//Declaracion de cola
  
     //Constructor que pasa parametros inicio y final de la cola 
    public OperacionesCola(int tamMax) {
        frente = 0;
        fin = -1;
        listaCola = new Object[tamMax];
                JOptionPane.showMessageDialog(null, "Operaciones colas");
    }//Constructor inicia y autoriza quien va al frente y quien va al fin
       
      public void insertar(Object dato) throws Exception {//Inicia metodo para insertar nuevos elementos 
        if (!colaLlena()) {
            fin++;
            listaCola[fin] = dato;
                        JOptionPane.showMessageDialog(null, "Insertar ");
        } else {
            throw new Exception("Error en la cola: Cola LLena");
        }
    } //Termina para insertar 
        public int tamMax() {//Determina length  el tamaño de los elementos de la ED cola 
        return listaCola.length;
    }//Determina el metodo para el numero de elementos 

        //Metodo que inicia que la cola esta llena
        public boolean colaLlena() {
        return fin == tamMax() - 1;
    }//Metodo que termina para verificar que la cola esta llena
       //Metodo que indica que la cola esta vacia 
        public boolean colaVacia() { 
        return frente > fin;
    }//Termina metodo que indica que la cola esta vacia 
        
        //Metodo para imprimir 
        public void imprimir() {
        for (int i = 0; i < tamMax(); i++) {
            Object datoActual = listaCola[i];

            if (datoActual != null) {
                 JOptionPane.showMessageDialog(null, "Cola esta LLena de valores:  \n"+(datoActual)+ ", ");
            }
        }
    }//Termina metodo para imprimir 
       
       
        //Inicia metodo para contar datos
        public int contarDatos() {
        int contador = 0;

        for (int i = 0; i < tamMax(); i++) {
            if (listaCola[i] != null) {
                contador++;
            }
        }

        return contador;
    }//Termina el motodo contar datos 
    
    
}//Termina clase
