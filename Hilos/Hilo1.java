
package Hilos;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Hilo1 extends Thread{
    
    @Override
    public void run (){
        
        System.out.println("inicia ejecucion de hilo 1");
        try{
            File archivo = new File("Audio.mp3");
            System.out.println("Busca archivo de audio => "+archivo.getAbsolutePath());
            
            
            FileInputStream direccion = new FileInputStream(archivo.getAbsolutePath());
            
            Player player;
            BufferedInputStream bis = new BufferedInputStream(direccion);
            
            player = new Player(bis);
            player.play();
            
        }catch(Exception exe){
            System.out.println("existe un error en ejecucion de hilo 1 "+exe);
        }
        
    }
    
}


