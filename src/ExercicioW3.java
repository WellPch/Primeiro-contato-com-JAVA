import java.util.Scanner;

public class ExercicioW3 {

	public static void main(String[] args) {
		int ano = 365;
		int idade;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = in.nextInt();
		int resu = ano * idade;
		System.out.println("Os dia vivido é: " + resu);
	}

}
