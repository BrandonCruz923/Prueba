
package sesion5edpilas;

/**
 *
 * @author capri
 */
public class Libro { //Inicia Clase
      private String autor;
      private String titulo;
      private int ani;
      private String editorial;
      
      //Constructor Vacio
      public Libro(){
          
         this.autor = " ";
        this.titulo = " ";
        this.ani = 0;
        this.editorial = " ";
      }
    //Constructor que pasa parametros
    public Libro(String autor, String titulo, int ani, String editorial) {
        this.autor = autor;
        this.titulo = titulo;
        this.ani = ani;
        this.editorial = editorial;
    }
    
     //Encapsulamiento de metodos de getter y setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAni() {
        return ani;
    }

    public void setAni(int ani) {
        this.ani = ani;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
      
    
    
}//Termina Clase
