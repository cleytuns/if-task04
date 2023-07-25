import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		int horas = number1 - number2;
		int total = Math.abs(horas - 24);
		
		if (total <= 24) {
			System.out.printf("O JOGO DUROU %d HORAS(S)", total);
		}
		else {
			System.out.println("O JOGO DUROU MAIS DE UM DIA");
		}
		
		sc.close();
}
	}