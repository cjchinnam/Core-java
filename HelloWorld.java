import java.util.Scanner;
class HelloWorld{
public static void main(String args[])
{
	
System.out.println("My first program");



int a=10,b=20;
		Scanner reader = new Scanner(System.in);
		System.out.println("enter a operator");

	    char operation = reader.next().charAt(0);
	    switch(operation) {
	    
	    case '+':
	    	System.out.println("sum of two numbers: " +(a+b));
	    	break;
	    case '-':
	    	System.out.println("subtraction of two numbers: " +(a-b));
	    	break;
	    case '/':
	    	System.out.println("divison of two numbers: " +(a/b));
	    	break;
	    case '*':
	    	System.out.println("product of two numbers: " +(a*b));
	    	break;

		}
//char ch=sca.next().charAt(0);


}
}