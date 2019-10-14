package simulacionunidad2;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class leerarchivos {

    leerarchivos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Integer prueba;

    public leerarchivos(Integer prueba) {
        this.prueba = prueba;

    }

    float datos[] = new float[35];

    public void leerTxt(String direccion, double prueba) { //direccion del archivo

        try {
            File archivo = new File(direccion);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            for (int i = 0; i <= 35; i++) {
                datos[i] = Float.parseFloat(br.readLine());
            }

            fr.close();

        } catch (Exception e) {
            System.err.println("");
        }
        
        
      /*geo
        
        
        */
        
       
      
      /*
      
      sergio
      
      */
      
    }

}
