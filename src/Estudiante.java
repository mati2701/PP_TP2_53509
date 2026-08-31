public class Estudiante {
    private String Legajo;
    private String Nombre;

    public String getNombre(){return Nombre;}
    public String getLegajo() {return Legajo;}

    public Estudiante (String Legajo, String Nombre) {
        this.Legajo = Legajo;
        this.Nombre = Nombre;
    }
}
