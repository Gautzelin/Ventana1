import javax.swing.*;

public class Estudiantes {
    private int cedula;
    private int edad;
    private String nombre;
    private String nacionalidad;

    public Estudiantes(int cedula, int edad, String nombre, String nacionalidad) {
        this.cedula = cedula;
        this.edad = edad;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "bienvenidos");
        //JOptionPane.showInputDialog(null, "introduzca un dato: ")

    }
    @Override
    public String toString(){
        return "numero de cedula: "+getCedula()+ " edad: "+getEdad()+" nombre: "+getNombre()+" nacionalidad: "+getNacionalidad();
    }


}