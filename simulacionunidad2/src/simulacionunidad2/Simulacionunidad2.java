package simulacionunidad2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author kauil
 */
public class Simulacionunidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  
      leerarchivos prueba = new leerarchivos();
      
      
      double entero;
      
      //entero = Integer.parseInt(JOptionPane.showInputDialog("Digite la prueba que desea"));
      entero = Double.parseDouble(JOptionPane.showInputDialog("Digite la prueba que desea en decimal ya sea .90, .95, o .99"));
      
      
      
      prueba.leerTxt("/home/kauil/Documentos/simulacionunidad2/ejemplos.mf", entero);
      //  System.out.println(prueba);
       
        
      //JOptionPane.showMessageDialog(null, prueba);
        //frmPrincipal frm = new frmPrincipal();
      
              
    }

  
    
}
