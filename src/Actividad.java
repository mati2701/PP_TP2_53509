import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Actividad {
    // atributos
    protected int Id;
    protected String Titulo;
    protected int cupoMaximo;
    public final int cupoMinimo = 5;
    private List<Inscripcion> inscripciones;

    public List<Inscripcion> getInscripciones(){
        return inscripciones;
    }
    public int GetId() {return Id;}
    public String GetTitulo(){return Titulo;}

    // metodos
    public Actividad (int Id, String Titulo, int cupoMaximo){
        this.Id = Id;
        this.Titulo = Titulo;
        this.cupoMaximo = cupoMaximo;
        this.inscripciones = new ArrayList<>();
    }
    public Inscripcion inscribir (Estudiante estudiante) {
        if (cupoMaximo > inscripciones.size()) {
            Inscripcion nuevaInscripcion = new Inscripcion(this, estudiante, LocalDate.now(), "Registrada");
            inscripciones.add(nuevaInscripcion);
            return nuevaInscripcion;
        } else {return null;
        }
    }
    public void mostrarIncripciones (){
        System.out.println("Inscripciones de la actividad: "+Titulo);
        if(inscripciones.isEmpty()){
            System.out.println("No hay estudiantes inscriptos a esta actividad");
        } else{
            for (Inscripcion inscripcion: inscripciones){
                System.out.println("Fecha de inscrpción: " + inscripcion.getFecha() +" - "+"Estado: "+ inscripcion.getEstado()+" - ");
                System.out.println("Estudiante: "+ inscripcion.getestudiante().getNombre() + " (Legajo: " + inscripcion.getestudiante().getLegajo() + ")");
            }
        }
    }
    public abstract double calcularCostoMateriales();
    public String GetTipo;
}
