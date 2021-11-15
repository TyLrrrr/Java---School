import java.io.*;
import java.util.*;
import java.text.*;

public class ProjectSix
{

static Scanner console = new Scanner(System.in);

public static void main(String[] args) throws FileNotFoundException
{
double loan = 0.00;
double interest = 0.00;
double monthPay =0.00;
int monthBill = 0;
double interestPercent, interestMonth, interestPay, principle, loan2;

PrintWriter outFile = new PrintWriter("Project6.txt");
outFile.print("Left on Loan          Principle Paid          Interest Paid\n");


System.out.print("Enter the loan amount: ");
loan = console.nextDouble();

System.out.print("Enter the interest rate (ex 5.75): ");
interest = console.nextDouble();

System.out.print("Enter the monthly payment: ");
monthPay = console.nextDouble();

loan2 = loan;
interestPercent = interest / 100;
interestMonth = interestPercent /12;
interestPay = loan * interestMonth;

if(interestPay > monthPay){
   System.out.println("This will never be paid off");
}
else

do{
   if(loan > 0){
      monthBill++;
      interestPay = loan * interestMonth;
      principle = monthPay - interestPay;
      loan = loan - principle;
      
      if(loan > 0){
         System.out.printf("Amount left on loan after payment #%-2d is $%-12.2f Principle $%-11.2f Interest $%.2f\n",
                           monthBill, loan, principle, interestPay);
         
         outFile.printf("$%-20.2f $%-22.2f $%.2f\n",
                        loan, principle, interestPay);
         }
      }
   }
while(loan > 0);

if(loan <= 0){
   System.out.printf("\nOriginal loan amout is ............ $%.2f \n" +
                     "Interest rate is .................. $%.2f \n" +
                     "Monthly payment amount is ......... $%.2f \n" +
                     "Number of months to pay off loan .. %d",
                     loan2, interest, monthPay, monthBill);
}
outFile.close();
}}