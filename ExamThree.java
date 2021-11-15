import java.io.*;
import java.util.*;
import java.text.*;

public class ExamThree
{

static Scanner console = new Scanner(System.in);

public static void main(String[] args) throws FileNotFoundException
{

   File carInput = new File("ExamThreeIn.txt");

      Scanner myReader = new Scanner(carInput);
      while (myReader.hasNext()) {
         String car = myReader.next();
         double cost = myReader.nextDouble();

double tax;
double interest;
double months;
double carTax;
double carTotal;
double carInterest;
double payment;

System.out.print("Enter sales tax rate: ");
tax = console.nextDouble();
System.out.println("");

System.out.print("Enter simple interest rate: ");
interest = console.nextDouble();
System.out.println("");

System.out.print("Enter months for the loan: ");
months = console.nextDouble();
System.out.println("");

PrintWriter outFile = new PrintWriter("ExamThreeOut.txt");

carTax = cost * tax;
carTotal = cost + carTax;
carInterest = carTotal + (carTotal * interest);
payment = carInterest / months;


System.out.printf("Type of car: %s \n" +
                  "Price of the car:                   %.2f \n" +
                  "Sales tax:                           %.2f \n" +
                  "Total price of the car:             %.2f \n" +
                  "Number of months of the loan:             %.0f \n" +
                  "Your payment amount each month is:   %.2f",
                  car, cost, carTax, carTotal, months, payment);
                  
outFile.printf("Type of car: %s \n" +
               "Price of the car:                   %.2f \n" +
               "Sales tax:                           %.2f \n" +
               "Total price of the car:             %.2f \n" +
               "Number of months of the loan:             %.0f \n" +
               "Your payment amount each month is:   %.2f",
               car, cost, carTax, carTotal, months, payment);
               
outFile.close();
}
myReader.close();

}}