import java.util.*;

public class ExamFour
{

static Scanner console = new Scanner(System.in);

public static void main(String[] args)
{

double sales;
double cost;
double salesBonus;
double profit;
double profitBonus;
double extraBonus = 0;
double totalBonus;

System.out.print("Enter the sales: ");
sales = console.nextDouble();
System.out.println();

System.out.print("Enter the cost: ");
cost = console.nextDouble();
System.out.println();

if(sales > 1000000){
   salesBonus = sales * .03;}
else{
   salesBonus = sales * .01;}

profit = sales - cost;

if(profit > 250000){
   profitBonus = profit * .03;}
else{
   profitBonus = profit * .01;}
   
if(salesBonus > 10000 && profitBonus > 5000){
   extraBonus = 5000;}

totalBonus = salesBonus + profitBonus + extraBonus;

System.out.printf("Sales ...........%9.0f \n" +
                  "Cost ............%9.0f \n" +
                  "Profit ..........%9.0f \n" +
                  "Sales Bonus .....%9.0f \n" +
                  "Profit Bonus ....%9.0f \n" +
                  "Extra Bonus .....%9.0f \n" +
                  "Total Bonuses ...%9.0f \n",
                  sales, cost, profit, salesBonus, profitBonus, extraBonus, totalBonus);     

}}