import java.util.Scanner;

public class ExercicioW1 {

	public static void main(String[] args) {
		float dist;
		float tempo;
		Scanner in = new Scanner(System.in);
		System.out.println("Informe a dist�ncia percorrida:");
		dist = in.nextFloat();
		System.out.println("Informe o tempo:");
		tempo = in.nextFloat();
		float vm = dist / tempo;
		System.out.println("A velocidade m�dia foi de " + vm);
		

	}

}
