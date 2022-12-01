import com.skillbox.airport.Airport;


public class main {

    public static void main(String[] args) {
        int allAircraft = 0;
        Airport airport = Airport.getInstance();
        airport.getAllAircrafts().forEach(x-> System.out.println(x));
        System.out.println(airport.getAllAircrafts().size());
    }
}
