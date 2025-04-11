package program;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		if (n > 0 && n < 10) {
			for (int i = 0; i < n; i++) {
				System.out.print("Digite um numero: ");
				vect[i] = sc.nextInt();
				}
			System.out.println("NUMEROS NEGATIVOS");
			
			for(int i=0; i < n; i++) {
				if (vect[i] < 0) {
					System.out.println(vect[i]);
				}
			}
			
		}
		
		
		
		
		
		
		sc.close();

	}

} // RESOLUÇÃO SEM AJUDA.