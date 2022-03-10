import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o primeiro número:");
		a = in.nextInt();
		System.out.println("Informe o segundo número:");
		b = in.nextInt();
		int soma = a + b;
		System.out.println("A soma dos valores é: " + soma);
	}

}
