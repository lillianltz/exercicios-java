package saudacao;

import java.util.Scanner;

public class saudacao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int momento;
		
		System.out.println("Digite a hora em sua cidade: ");
		momento = (int) sc.nextDouble();
		
		if (momento >= 0 && momento < 12) {
			System.out.println("Bom dia!");
		} else if (momento >= 12 && momento < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}
		
	
	}

}
