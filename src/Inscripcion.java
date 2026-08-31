import java.time.LocalDate;

public class Inscripcion {
    private Actividad actividad;
    private Estudiante estudiante;
    private LocalDate Fecha;
    private String Estado;

    public LocalDate getFecha(){
        return Fecha;
    }
    public String getEstado(){
        return Estado;
    }
    public Estudiante getestudiante(){
        return estudiante;
    }

    public Inscripcion (Actividad actividad, Estudiante estudiante,LocalDate Fecha, String Estado){
        this.actividad = actividad;
        this.estudiante = estudiante;
        this.Fecha = Fecha;
        this.Estado = Estado;
    }
    public void confirmar(){
        this.Estado = "Confirmada";
    }
}
