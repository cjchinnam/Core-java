import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class DynamicCalculator{

public static void main(String args[]) throws IOException {

		System.out.println("please enter the input values");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		String s1 = reader.readLine();
		String s2 = reader.readLine();
			System.out.println("please enter the operator");
		String s3 = reader.readLine();
		
		float a = Float.valueOf(s1);
		float b = Float.valueOf(s2);
	
		char c = s3.charAt(0);
		
		System.out.println("value of a is  " + a);
		System.out.println("value of b is  " + b);
		System.out.println("operator is  " + c);
		
		switch(c){
			
			case'+':
			System.out.println("addition of a and b is " + (a+b));
			break;
			
			case '-':
			System.out.println("subtraction of a and b is " + (a-b));
			break;
			
			case '*':
			System.out.println("multiplication of a and b is " + (a*b));
			break;
			
			case '/':
			System.out.println("division of a and b is " + (a/b));
			break;
			
		}

}

}