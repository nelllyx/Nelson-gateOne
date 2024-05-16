import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hi,kindly enter your name: ");
        String userName = input.nextLine();

        System.out.print("Hi "+ userName + ",welcome to your Menstrual cycle Program: ");

        System.out.println("How long is your cycle(in days ): ");

        int cycle = input.nextInt();
        input.nextLine();

        System.out.println("Enter the start date of your last period in dd-mm-yyyy: ");
        String startDate = input.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate cycleStartDate = LocalDate.parse(startDate, formatter);

        LocalDate presentDate = LocalDate.now();

        LocalDate nextCycleDate = presentDate.plusDays(cycle);

        LocalDate ovulationDate = cycleStartDate.plusDays(14);

        LocalDate safePeriodStartDate = ovulationDate.plusDays(5);

        LocalDate safePeriodEndDate = nextCycleDate.minusDays(5);

        LocalDate fertilePeriodStartDate = cycleStartDate.plusDays(10);
        LocalDate fertilePeriodEndDate = ovulationDate;

        System.out.println("Hi "+ userName + " your next flow date is " + nextCycleDate );

        System.out.println("your next ovulation date is on the " + ovulationDate );

        System.out.println("your safe period is from " + safePeriodStartDate + " to " + safePeriodEndDate );

        System.out.println("You are most fertile within " + fertilePeriodStartDate + " to " + fertilePeriodEndDate );

        System.out.println("Kindly note that this is only a prediction based on the data you provided and could vsry based on some biological changes. Thank you!!!");









    }
}