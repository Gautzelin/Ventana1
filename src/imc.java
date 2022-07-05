import javax.swing.*;

public class imc {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "bienvenidos");
        //JOptionPane.showInputDialog(null, "introduzca un dato: ")
        int altura=Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca su altura en centimetros: ", "Sumando", JOptionPane.QUESTION_MESSAGE));
        int peso=Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca su peso en kilogramos: ", "Sumando", JOptionPane.QUESTION_MESSAGE));
        float total= (float) (altura/Math.pow(peso,2));
        JOptionPane.showMessageDialog(null, "Si IMC es: "+total, "sumando", JOptionPane.INFORMATION_MESSAGE);
        //System.out.println(numero1+numero2);
    }

}
