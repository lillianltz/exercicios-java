package media_notas;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner nota = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		System.out.println("Calculadora de Média de Notas");
		
		System.out.println("Digite sua primeira nota: ");
		nota1 = nota.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		nota2 = nota.nextDouble();
		
		System.out.println("Digite sua terceira nota: ");
		nota3 = nota.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Sua média do primeiro semestre é " + media);
		
	}

}
