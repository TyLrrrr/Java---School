import java.io.*;
import java.util.*;

public class ProjectFive
{

static Scanner console = new Scanner(System.in);

static final int normalHours = 40;
static final double ot = 1.5;

public static void main(String[] args)
{
int hours;
double pay, grossPay, normPay, otPay;

System.out.print("Enter the total hours worked: ");
hours = console.nextInt();
System.out.print("Enter the rate of pay: ");
pay = console.nextDouble();

normPay = hours * pay;
otPay = normalHours * pay;

//if(hours <= normalHours){
  // System.out.printf("The gross pay is: $%.2f", normPay);
  // }
//else{
   //grossPay = otPay + ((pay * ot) * (hours - normalHours));
  // System.out.printf("The gross pay is: $%.2f", Pay);
   //}

if(hours <= normalHours){
   System.out.printf("The gross pay is: $%.2f", normPay);
   }
if(hours > normalHours){
   grossPay = otPay + ((pay * ot) * (hours - normalHours));
   System.out.printf("The gross pay is: $%.2f", grossPay);
   }
}}