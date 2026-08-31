public class App{
    public static void main(String[] args) {
        EventoUniversitario FeriaLibros = new EventoUniversitario("01","Feria de libros",85000.0,true);
        EventoUniversitario TorneoCalculos = new EventoUniversitario("02","Torneo de cálculos",130000.0,false);
        Sala sala1 = new Sala(01, "galería");
        Sala sala2 = new Sala(02, "anfiteatro");
        FeriaLibros.asignarSala(sala1);
        TorneoCalculos.asignarSala(sala2);
        FeriaLibros.crearActividad(001,"Trivia",100,"Charla","Julio",false);
        TorneoCalculos.crearActividad(002, "competición de teoría",85, "Taller", "Graciela", true);
        Estudiante Joaco = new Estudiante("83016","Joaco López");
        Estudiante Lola = new Estudiante("86026","Lola Índigo");
        Estudiante Emanuel = new Estudiante("51309","Emanuel Mateo");
        FeriaLibros.getActividades().get(0).inscribir(Joaco);
        FeriaLibros.getActividades().get(0).inscribir(Emanuel);
        TorneoCalculos.getActividades().get(0).inscribir(Lola);
        TorneoCalculos.getActividades().get(0).inscribir(Emanuel);
        FeriaLibros.mostrarDatos();
        TorneoCalculos.mostrarDatos();
        EventoUniversitario Presentacion2 = new EventoUniversitario(FeriaLibros);
        System.out.println("Cantidad de eventos: "+EventoUniversitario.getCantidadEventos());
    }
}

