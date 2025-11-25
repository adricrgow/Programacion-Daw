
import viaje.Sucursal;
import viaje.Hotel;
import viaje.Reserva;
import viaje.Toma;
import viaje.Turista;
import viaje.Vuelo;

public class ActividadViaje {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Malaga", "Malaga3",234234,"Me gusta Malaga","40","234567819");
        Hotel hotel2 = new Hotel("Lugo", "Lugo3",234334,"Me gusta las patatas","35","124567890");
        Turista tu1 = new  Turista("Moreno","Calle13", 6256, "Pedro", "865442894");
        Turista tu2 = new  Turista("Carpio","Torre2", 5635, "Manolo", "888442894");
        Vuelo vuelo1 = new Vuelo("Galicia","20/11/2025","17:00" ,3289 ,"Valencia" ,"150" );
        Vuelo vuelo2 = new Vuelo("Andalucia","23/11/2025","18:00" ,3129 ,"Almería" ,"140" );
        Sucursal sucursal1 = new Sucursal("Almería", "perico2", 3829, "Almería", "238746244");
        Sucursal sucursal2 = new Sucursal("Malaga", "Patos3", 2349, "Malaga", "843748269");
        Reserva re1 = new Reserva("21/11/2025", "25/11/2025", "antesdeayer");
        Reserva re2 = new Reserva("24/11/2025", "28/11/2025", "Mañana");
        Toma t1 = new Toma("Primera");
        Toma t2 = new Toma("Pobre");
        re1.setNombre(tu2);
        re1.setNombreHotel(hotel2);
        re1.setSucursal(sucursal1);
        re2.setNombre(tu1);
        re2.setNombreHotel(hotel1);
        re2.setSucursal(sucursal2);
        t1.setnVuelo(vuelo2);
        t1.setTurista(tu2);
        t1.setSucursal(sucursal2);
        t2.setnVuelo(vuelo1);
        t2.setTurista(tu1);
        t2.setSucursal(sucursal1);
        
        System.out.println(t2);
    }
}
