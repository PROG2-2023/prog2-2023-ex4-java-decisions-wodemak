package prog2.exercise4.flight.booking.system;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String sdepart = "2023-03-04";
        LocalDate departingDate = LocalDate.parse(sdepart);

        String sreturn = "2023-03-06";
        LocalDate returnDate = LocalDate.parse(sreturn);

        FlightBooking fb = new FlightBooking("Null",departingDate, returnDate, 2, 3);

        System.out.println("Please enter the passenger name:");
        String name = input.nextLine();

        System.out.println("Please enter the depature date");
        String departingDate1 = input.nextLine();
        departingDate = LocalDate.parse(departingDate1 , DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println("Please enter the return date:");
        String returnDate1 = input.nextLine();
        returnDate = LocalDate.parse(returnDate1 , DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        
        System.out.println("Please enter the booking class:");
        String bookingclass = input.nextLine();

        System.out.println("Please enter the trip type:");
        String triptype = input.nextLine();

        System.out.println("Please enter the trip source:");
        String tripsource = input.nextLine();

        System.out.println("Please enter the trip destination:");
        String tripdestination = input.nextLine();

        System.out.println("Please enter the total number of adultpassenger:");
        int adultpassenger = input.nextInt();

        System.out.println("Please enter the total number of childpassenger:");
        int childpassenger = input.nextInt();

        fb.setPassengerFullName(name);
        fb.setDepartureDate(departingDate);
        fb.setReturnDate(returnDate);
        fb.setBookingClass(bookingclass);
        fb.setTripType(triptype);
        fb.setTripSource(tripsource);
        fb.setTripDestination(tripsource, tripdestination);
        fb.setDepartingTicketPrice(childpassenger, adultpassenger);
        fb.setReturnTicketPrice();

        fb.setTotalTicketPrice();
        
        fb.toString();

        input.close();
    }
}