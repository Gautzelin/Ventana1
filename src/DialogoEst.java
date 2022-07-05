import java.util.ArrayList;

public class DialogoEst {
    public static void main(String[] args) {
        ArrayList<Estudiantes> estudiante1;
        Procesos procesos = new Procesos();
        estudiante1=procesos.estudiantes();
        procesos.mostrar(estudiante1);

    }
}
