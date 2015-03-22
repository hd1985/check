import java.util.Scanner;
public class CalFunction {

	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);    
	    Scanner input1 = new Scanner (System.in);
	   
        int num1, num2;
        String sel;
        int sum;
        int sub;
        int mul;
        int div;    

        System.out.println("Enter first integer: ");
        num1 = input.nextInt();
        
        System.out.println("Enter second integer: ");    
        num2 = input.nextInt();
        
        System.out.println("add/sub/mul/div: ");
        sel = input1.nextLine();
        switch (sel){
        case "add":
        			sum = num1 + num2;
        			System.out.println("result" + sum);
        			break;
        case "sub":
        			sub = num1 - num2;
        			System.out.println("result" + sub);
        			break;
        case "mul":
        			mul = num1 * num2;
        			System.out.println("result" + mul);
        			break;
        case "div":
        			div = num1 / num2;
        			System.out.println("result" + div);
        			break;
        }
        
	}

}
