
package Hilos;

import java.awt.Color;
import java.util.Random;
import javax.swing.JPanel;

public class Hilo3 extends Thread{
    
    JPanel jPanelG;
    
    @Override
    public void run (){
            
       System.out.println("inicia ejecucion de hilo 3");
       cambiarColor();
        
        
        
    }
    public void cambiarColor(){
        try{
            Random aleatorio = new Random(System.currentTimeMillis());
            int numero1 = aleatorio.nextInt(256);
            int numero2 = aleatorio.nextInt(256);
            int numero3 = aleatorio.nextInt(256);

            jPanelG.setBackground(new Color(numero1, numero2, numero3));

            Thread.sleep(3000);
            cambiarColor();
            
        }catch(Exception exe){
             System.out.println(" Ocurrio un error  "+exe);
        }
    
    }
    
     public void SetJpanel (javax.swing.JPanel jPanel1){
    
        System.out.println("se instancia localmente el jPanel ya inicializado en la ventana y recibido como parametro");
        jPanelG = jPanel1;
        
    }
}
