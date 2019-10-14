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

        //return matrix;
        final double confianza = (prueba);
        double alfa = 1 - confianza;

        ArrayList<Integer> bits = new ArrayList<>();
        int i, corridas, dato;
        double media, varianza, z;
        //Revisa si cada dato actual es menor al dato anterior. 
        //Si es así, se guarda un 0, de lo contrario, se guarda un 1
        for (i = 1; i < datos.length; i++) {
            if (datos[i] <= datos[i - 1]) {
                bits.add(0);
            } else {
                bits.add(1);
            }
        }

        //Contamos las corridas. 
        corridas = 1;
        //Comenzamos observando el primer dígito
        dato = bits.get(0);
        //Comparamos cada dígito con el observado, cuando cambia es 
        //una nueva corrida
        for (i = 1; i < bits.size(); i++) {
            if (bits.get(i) != dato) {
                corridas++;
                dato = bits.get(i);
            }
        }

        String corrd = String.valueOf(corridas);

        /*
      
      sergio
      
         */
    }

}
