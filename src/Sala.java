public class Sala {
    private int Id;
    private String Nombre;

    public Sala (int Id, String Nombre){
        this.Id = Id;
        this.Nombre = Nombre;
    }
    public int GetId (){ return  Id; };
    public String GetNombre(){ return Nombre; };
}
