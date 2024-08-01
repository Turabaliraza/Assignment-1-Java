import java.util.*;
public class Prob6{
 public static void main(String [] args)
{
  Scanner myobj=new Scanner(System.in);
  System.out.println("Enter a Positive Number: ");
  double num1=myobj.nextDouble();
  System.out.println("Enter a Positive Number: ");
  double num2=myobj.nextDouble();
  System.out.println("Result: "+(Math.pow(num1,num2)));
  
} 
}