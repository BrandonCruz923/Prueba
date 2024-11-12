package colachatboot;

/**
 *
 * @author capri
 */
public class ChatBot {//Inicia Clase
    public String generarRespuesta (String pregunta){
        pregunta = pregunta.toLowerCase();
        if (pregunta.contains("Hola") || pregunta.contains("Hi")) {//Para Saludar Al Usuario
            return " Ha sido Saludado Holaaaaaaaaa, Mi Creador  Es: Martinez: Te Puedo Ayudar En Algo";
        } 
        else if(pregunta.contains("¿como estas?")) {
            return " Estoy Aqui para ayudarte. ¿ En que Nesesitas Ayuda?";
           
        }else if(pregunta.contains("¿tu nombre es ?")){
            return "Soy Una Maquina Inteligente Especialista en programacion De Java";
        } else if(pregunta.contains("¿que puedes hacer?")){
            return "Puedo Programar En Formas De Estructuras, OO, Oe, OA, Rx y mas"
                     + "\nAdemas De Responder Preguntas Y Gestionar"
                    + "\nConsultar En Orden De Llegada";
                    
        }else if(pregunta.contains("¿que hora es?")){
            return "Aun No Tengo Esa Programacion, Puedes Preguntar Otra Cosa";
        }
         else {
            return "No Entiedo Tu Pregunta, Puedes Preguntar De Otra Forma";
        }
        
    }
    
    
}//Termina Clsase
