package mainpackage;
import java.util.Scanner;

public class mainclass {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double peso;
		double altura;
	
		
		System.out.println("Digite o seu peso");
		peso = scan.nextDouble();
		
		System.out.println("Digite a sua altura");
		altura = scan.nextDouble();
		
		System.out.printf("%.2f%n", peso/(altura*altura));
		
		
		scan.close();
	}

}
