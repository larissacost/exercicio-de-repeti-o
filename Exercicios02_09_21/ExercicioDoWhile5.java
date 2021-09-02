package Exercicios02_09_21;

import java.util.Scanner;

public class ExercicioDoWhile5 {

	public static void main(String[] args) {
		int num,somaNum=0,cont=0;
		
		do 
		{
			Scanner leia = new Scanner(System.in);
			System.out.println("\nDigite um  número: ");
			num = leia.nextInt();
			somaNum += num;
			cont++;
		}while(num!=0);
		
		System.out.println("\nA soma dos números digitados é: "+somaNum);

	}

}
