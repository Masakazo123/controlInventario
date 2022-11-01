package main;
import interfaz.*;
import dominio.*;
import java.io.*;
/**
 *
 * @author culne
 */
public class Inicio {

    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException  {
        Sistema sistema;
        File f = new File("datos.sis");
        if(f.exists()){
            FileInputStream archivo2 = new FileInputStream("datos.sis");
            ObjectInputStream deserializador = new ObjectInputStream(archivo2);
            Sistema sistemaRecuperado = (Sistema) deserializador.readObject();
            sistema = sistemaRecuperado;
        }else{
            sistema = new Sistema();
            sistema.agregarNavesPredeterminadas();
            
        }
        
        VentanaPrincipal ventana = new VentanaPrincipal(sistema);
        ventana.setVisible(true);
        
    }

}
