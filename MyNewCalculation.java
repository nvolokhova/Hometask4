package inheritance;

public class MyNewCalculation extends MyCalculation {

	public void Division(int x, int y) {
	z = x/y;
	System.out.println("The division of the given numbers: " +z);
	} 
	
	public static void main(String[] args) {
			int a = 20, b = 0;
			MyNewCalculation demo = new MyNewCalculation();
			try{
				demo.Division(a, b);
			} catch (ArithmeticException e) {
				System.out.println("Cannot be divided by 0");
			}
			demo.Addition(a, b);
			demo.Multiplication(a, b);
			demo.Subtraction(a, b);
		}
	
}
