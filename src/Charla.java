public class Charla extends Actividad {
    private String disertante;

    public Charla(int Id, String Titulo, int cupoMaximo, String disertante){
        super(Id, Titulo, cupoMaximo);
        this.disertante = disertante;
    }
    public String GetDisertante(){
        return disertante;
    }

    @Override
    public double calcularCostoMateriales() {
        return 0;
    }
    public String GetTipo(){
        return "Charla";
    }
}
