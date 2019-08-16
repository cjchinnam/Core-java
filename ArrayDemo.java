class ArrayDemo{

	public static void main(String args[]){

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		char c=args[2].charAt(0);

			System.out.println("Value of a is  " + a);
			System.out.println("Value of b is  " + b);
			System.out.println("Type of operator is  " + c);



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
