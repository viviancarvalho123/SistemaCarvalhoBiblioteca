/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author u10154925179
 */
public class util {

    public static void habilitar(boolean valor, JComponent... vetComponent) {
        //Escolhemos o (objeto)jcomponent por que ele é como om pai de todos os component, como jtxt, jfmt...
        // jcomponent foi escolhido tambem por conta da arvore de derivação, pois de acordo com o site da oracle o jcomponent tem o setenabled em sua familia.
        // static significa que não preciso instancia para chamar o metodo.
        // os tres pontinhos se chama varargus, que significa que podemos passar varios componentes.

        for (int i = 0; i < vetComponent.length; i++) {
            vetComponent[i].setEnabled(valor);
            // ele esta fazendo um laço para percorrer tdos os componentes do vetor.
        }

    }

   public static void limparCampos(JComponent... vetComponent) {
        for (JComponent jComponent : vetComponent) {

            if (jComponent instanceof JTextField) {
                ((JTextField) jComponent).setText("");
                //O metodo começa a depender de cada objeto(jcomponent).
            }
            if (jComponent instanceof JComboBox) {
                ((JComboBox) jComponent).setSelectedIndex(-1);

            }

            if (jComponent instanceof JCheckBox) {
                ((JCheckBox) jComponent).setSelected(false);
            }

        }
    }
   
    public static void mensagem(String cadeia){
     JOptionPane.showMessageDialog(null, cadeia);
    
    }
     public static boolean perguntar(String cadeia){
  int resp = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro?",
               "Exclusão", JOptionPane.YES_NO_OPTION);
       
       JOptionPane.showConfirmDialog(null, cadeia, "Perguntar", JOptionPane.YES_NO_OPTION);
       return false;
     
     }
     public static int strInt(String cad){
     return Integer.valueOf(cad);
     }
      public static String intStr(int num){
     return null;
     }
      public static int strDouble(String cad){
     return 0;
     }
        public static String doubleStr(double num){
     return "";
     }
       public static Date strDate(String cad){
     return null;
     }
        public static String dateStr(Date num){
     return "";
     }
}
