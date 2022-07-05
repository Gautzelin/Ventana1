import javax.swing.*;
import java.util.ArrayList;

public class Procesos {
    private static int cedula(int i) {
        int cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca su cedula: ", "Estudiante " + i, JOptionPane.QUESTION_MESSAGE));
        return cedula;
    }

    private static int edad(int i) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca su edad: ", "Estudiante " + i,JOptionPane.QUESTION_MESSAGE));
        return edad;
    }

    private static String nombre(int i) {
        String nombre = (JOptionPane.showInputDialog(null, "introduzca su nombre: ", "Estudiante " + i, JOptionPane.QUESTION_MESSAGE));
        return nombre;
    }

    private static String nacionalidad(int i) {
        String nacionalidad = (JOptionPane.showInputDialog(null, "introduzca su nacionalidad: ", "Estudiante " + i, JOptionPane.QUESTION_MESSAGE));
        return nacionalidad;
    }

    public ArrayList<Estudiantes> estudiantes() {
        ArrayList<Estudiantes> estudiantes = new ArrayList<Estudiantes>();
        for (int i = 0; i < 5; i++) {
            int temp = i + 1;
            Estudiantes estudiante1 = new Estudiantes(cedula(temp), edad(temp), nombre(temp), nacionalidad(temp ));
            estudiantes.add(estudiante1);
        }
        return estudiantes;
    }

    public void mostrar(ArrayList<Estudiantes> estudiante1) {
        int i = 1;
        // Estudiantes[] estudiante1 = new Estudiantes[0];
        for (Estudiantes est : estudiante1) {
            JOptionPane.showMessageDialog(null, est.toString(), "Estudiante " + (i), JOptionPane.INFORMATION_MESSAGE);
            i++;
        }
    }
}

