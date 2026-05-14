public class Visitante {
    private String nombre;
    private String cedula;
    private int edad;

    public Visitante() {
        setNombre(nombre);
        setCedula(cedula);
        setEdad(edad);
    }

    public Visitante(String nombre, String cedula, int edad) {
        setNombre(nombre);
        setCedula(cedula);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}