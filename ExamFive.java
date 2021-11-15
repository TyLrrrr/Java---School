import java.util.*;

public class ExamFive
{

static Scanner console = new Scanner(System.in);

public static void main(String[] args)
{

double invest;
double goal;
double interest;
double trueInterest;
double yearReturn;
double current = 0;
int year = 0;


System.out.print("Enter your investment goal amount ...................... ");
goal = console.nextDouble();

if(goal >= 5000000){
   System.out.printf("Your goal is outside the allowed 5,000,000 limit");
   }
   
else{

System.out.print("Enter the amount annually invested ..................... ");
invest = console.nextDouble();

System.out.print("Enter the expected annual return rate (ex 6.50) ........ ");
interest = console.nextDouble();
System.out.println("");

trueInterest = interest * .01;

do{
current += invest;
yearReturn = current * trueInterest;
current = current + yearReturn;
year++;

//System.out.printf("Yearend account balance %.2f"+"     Invested this year %.2f"+"     annual return %.2f\n",
                  //current, invest, yearReturn);
} while (current < goal);

System.out.printf("\n" +
                  "Your investment goal .................%15.2f \n" +
                  "Your annual investment amount ........%15.2f \n" +
                  "Your expected rate of return .........%15.2f \n" +
                  "Number of years to reach your goal ...%15d",
                  goal, invest, interest, year);
}}}