public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int summ = first + second;
		int multiplication = first * second;
		int subtraction = first - second;
		int division = first / second;
		
		System.out.println("Sum  " + summ); 
		System.out.println("*  " + multiplication);
		System.out.println("-  " + subtraction);
		System.out.println("/  " + division);
		System.out.println("/  " + division);
		 
	}
}
