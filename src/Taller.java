public class Taller extends Actividad {
    private boolean requiereNotebook;

    public Taller(int Id, String Titulo, int cupoMaximo, boolean requiereNotebook){
        super(Id, Titulo, cupoMaximo);
        this.requiereNotebook = requiereNotebook;
    }
    public boolean GetRequiereNotebook(){
        return requiereNotebook;
    }

    @Override
    public double calcularCostoMateriales() {
        return requiereNotebook? 5000:2000;
    }
    public String GetTipo(){
        return "Taller";
    }
}
