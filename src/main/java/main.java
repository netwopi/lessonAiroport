import com.skillbox.airport.Airport;

import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {

        Airport airport = Airport.getInstance();
        airport.getAllAircrafts().forEach(System.out::println);

    }
}
