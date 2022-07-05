import javax.swing.*;

public class Dialogo {
    //Metodo main para ejecutar el programa
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "bienvenidos");
        //JOptionPane.showInputDialog(null, "introduzca un dato: ")
        int numero3=Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca un dato: ", "Sumando", JOptionPane.QUESTION_MESSAGE));
        int numero2=Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca un segundo numero: ", "Sumando", JOptionPane.QUESTION_MESSAGE));
        int total=numero3+numero2;
        JOptionPane.showMessageDialog(null, "El resultado es: "+total, "sumando", JOptionPane.INFORMATION_MESSAGE);
        //System.out.println(numero1+numero2);
    }

}
