import java.util.ArrayList;
import java.util.List;

public class EventoUniversitario {
    // atributos
    private final String Id;
    private String Titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos = 0;
    private Sala sala;
    private List<Actividad> actividades;
    // constructor de un evento
    public EventoUniversitario(String Id, String Titulo, double costoBase, boolean gratuito){
        this.Id = Id;
        this.Titulo = Titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        this.actividades = new ArrayList<>();
        EventoUniversitario.cantidadEventos++;
    }
    // constructor para copiar un evento
    public EventoUniversitario(EventoUniversitario copia){
        this.Id = copia.Id;
        this.Titulo = copia.Titulo;
        this.costoBase = copia.costoBase;
        this.gratuito = copia.gratuito;
        this.sala = copia.sala;
        this.actividades = new ArrayList<>(copia.actividades);
        EventoUniversitario.cantidadEventos++;
    }
    //acceso a las actividades
    public List<Actividad> getActividades() {
        return actividades;
    }
    // asignar sala
    public void asignarSala(Sala sala){
        this.sala = sala;
    }
    public double calcularCostoEstimado(){
        if (gratuito){
            return 0;
        } else{
            double costoTotalActividades = 0.0;
            for (Actividad actividad:actividades){
                costoTotalActividades=+actividad.calcularCostoMateriales();
            }
            return (costoBase+costoTotalActividades)*1.21;
        }
    }
    // crear una actividad
    public void crearActividad(int Id, String titulo, int cupo, String tipo, String disertante, boolean requiereNotebook){
        if (tipo.equalsIgnoreCase("Charla")){
            actividades.add(new Charla(Id,Titulo,cupo,disertante));
        } else if (tipo.equalsIgnoreCase("Taller")) {
            actividades.add(new Taller(Id,Titulo,cupo,requiereNotebook));
        }
    }
    // mostrar datos
    public void mostrarDatos(){
        System.out.println("Título evento: "+Titulo+" (Id evento: "+Id+")");
        System.out.println("Costo base: "+this.calcularCostoEstimado());
        if (sala != null){
            System.out.println("Sala: "+this.sala.GetNombre()+" (Id: "+this.sala.GetId()+")");
        }
        System.out.println("actividades del Evento:");
        for (Actividad actividad: actividades){
            System.out.println("Nombre de actividad: "+actividad.GetTitulo()+" (Id: "+actividad.GetId()+")");
            actividad.mostrarIncripciones();
        }
        System.out.println("---------------------------------------------------------------------");
    }
    // metodo para devolver cantidad de eventos creados
    public static int getCantidadEventos(){
        return cantidadEventos;
    }


}
