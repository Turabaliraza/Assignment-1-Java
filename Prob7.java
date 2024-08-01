import java.util.Scanner;
public class Prob7 {
    public static void main(String[] args) {
		int sum=0;
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter 5 digit number: ");
        int number=myObj.nextInt();
        sum += number % 10; 
        number /= 10;       

        sum += number % 10; 
        number /= 10;       

        sum += number % 10;
        number /= 10;

        sum += number % 10;
        number /= 10;      

        sum += number % 10; 

        System.out.println("Sum of the digits is: " + sum);
    }
}