import java.util.Scanner;

public class Example1{
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
	
		System.out.print ("Введите целое число: ");
	if (sc.hasNextInt()) {
		a = sc.nextInt();
		System.out.print("Введите второе целое число: ");
	}else {
		System.out.println("Вы ввели не целое число");
		return;
	}
	
	if (sc.hasNextInt()) {
		b = sc.nextInt();
		System.out.println (a + b);
		System.out.println (a - b);
		System.out.println (a / b);
		System.out.println (a * b);
	}else {
		System.out.println("Вы ввели не целое число");
	}
	
	if (a > b) {
		System.out.println("a > b");
	} else if (a < b) {
		System.out.println("a < b");
	} else {
		System.out.println("a = b");
	}
}		
	}