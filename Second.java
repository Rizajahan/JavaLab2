import java.util.*;
abstract class Flight{
   private String flightNumber;
   private String airline;
   private double fare;

   Flight(String flightNumber, String airline, double fare){
       this.flightNumber=flightNumber;
       this.airline=airline;
       this.fare=fare;
   }
    public double getFare() {
        return fare;
    }
   abstract double calculateFare();

   @Override
    public String toString(){
       return "FlightNumber: "+ flightNumber+"/n Airline: "+airline+"/nFare:"+calculateFare();
   }
}
class DomesticFlight extends Flight{
    DomesticFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }
    double calculateFare() {
        return getFare() * 1.10;
    }
}
class InternationalFlight extends Flight{
    InternationalFlight(String flightNumber, String airline, double fare){
        super(flightNumber, airline, fare);
    }
    double calculateFare(){
        return getFare()*1.25;
    }
}
public class Second{
 public static void main(String args[]){
     System.out.println("Enter flight type,number,airline,fare: ");
     Scanner sc= new Scanner(System.in);
     while(sc.hasNextLine()){
         String input = sc.nextLine();

     if(input.isEmpty())
         break;

     String[] data= input.split(",");
     String type = data[0];
     String number = data[1];
     String airline = data[2];
     double fare = Double.parseDouble(data[3]);
     Flight flight;
         if (type.equalsIgnoreCase("Domestic"))
             flight = new DomesticFlight(number, airline, fare);
         else
             flight = new InternationalFlight(number, airline, fare);

         System.out.println(flight);
     }
 }
}

