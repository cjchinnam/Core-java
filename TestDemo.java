import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.io.IOException;

class TestDemo{
		public static void main(String args[]) throws IOException{
	
	InputStreamReader inp = new InputStreamReader(System.in);
	BufferedReader reader = new BufferedReader(inp);
	
	System.out.println("enter the input message");
	
	String s1 = reader.readLine();
	
	System.out.println(s1);

	
		}
}