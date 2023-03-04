
package Hilos;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JTextArea;

public class Hilo2 extends Thread{
    
    public String letra = "";
    public JTextArea Jtext;
    
    @Override
    public void run (){
       System.out.println("inicia ejecucion de hilo 2");
       leerLetra();        
    }
    
    public void SetJpanel (javax.swing.JTextArea jTextArea1){
        System.out.println("se instancia localmente el text area ya inicializado en la ventana y recibido como parametro");
        Jtext = jTextArea1;
        
    }
    
    public void leerLetra(){
        
         System.out.println("inicia lectura de archivo de letra ");
        String nombreFichero = "letra.txt";
        
        // Declarar una variable BufferedReader
        BufferedReader br = null;
        try {
            
            String puntos=".";
            for(int i =0; i<= 10;i++){
                Jtext.setText(puntos);
                puntos += ".";
                Thread.sleep(1500);
            }          
            Jtext.append("\n");  
            // Crear un objeto BufferedReader al que se le pasa 
            //   un objeto FileReader con el nombre del fichero
            br = new BufferedReader(new FileReader(nombreFichero));
            // Leer la primera línea, guardando en un String
            String texto = br.readLine();
            // Repetir mientras no se llegue al final del fichero
            while(texto != null) {
                // Hacer lo que sea con la línea leída
                // En este ejemplo sólo se muestra por consola          
                
                Jtext.append(texto+"\n");                
                // Leer la siguiente línea
                texto = br.readLine();
                
                Thread.sleep(3000);
            }
        }
        // Captura de excepción por fichero no encontrado
        catch (FileNotFoundException ex) {
            System.out.println("Error: Fichero no encontrado");
            ex.printStackTrace();
        }
        // Captura de cualquier otra excepción
        catch(Exception ex) {
            System.out.println("Error de lectura del fichero");
            ex.printStackTrace();
        }
           
        
    }
    
}
