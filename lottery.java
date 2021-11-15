import java.util.*;

public class lottery
{
public static void main(String[] args)
{

Random lottery = new Random();

int l1;
int l2;
int l3;
int l4;
int run = 0;

do{
l1 = 1 + lottery.nextInt(9);
l2 = 1 + lottery.nextInt(9);
l3 = 1 + lottery.nextInt(9);
l4 = 1 + lottery.nextInt(9);

run++;
}
while(l1 == l2 || l1 == l3 || l1 == l4 || l2 == l3 || l2 == l4 || l3 == l4);

System.out.printf("Lottery #1 is %d \n" +
                  "Lottery #2 is %d \n" +
                  "Lottery #3 is %d  \n" +
                  "Lottery #4 is %d \n" +
                  "How many tries? %d",
                  l1, l2, l3, l4, run);
}}