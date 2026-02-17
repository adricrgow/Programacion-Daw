public class App {
    public static void main(String[] args){
        Vista.Diapositiva42view view = new Vista.Diapositiva42view();
        Controlador.Diapositiva42Controlador controlador = new Controlador.Diapositiva42Controlador(new Modelo.AlumnoDAO(), new Modelo.DiseñaExamenDAO(), new Modelo.ExamenTeoricoDAO(), new Modelo.HaceDAO(), new Modelo.PracticaDAO(), new Modelo.ProfesorDAO(), view);
        controlador.iniciar();
    }
}
