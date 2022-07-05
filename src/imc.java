import javax.swing.*;

public class imc {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "bienvenidos");
        //JOptionPane.showInputDialog(null, "introduzca un dato: ")
        //Pedimos los el peso y talla al usuario
        int altura1=Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca su altura en centimetros: ", "Sumando", JOptionPane.QUESTION_MESSAGE));
        int peso1=Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca su peso en kilogramos: ", "Sumando", JOptionPane.QUESTION_MESSAGE));
        float totalImc= (float) (altura1/Math.pow(peso1,2));//COn esta formula calculamos el IMC de una persona
        JOptionPane.showMessageDialog(null, "Si IMC es: "+totalImc, "sumando", JOptionPane.INFORMATION_MESSAGE);
        //System.out.println(numero1+numero2);
    }

}
