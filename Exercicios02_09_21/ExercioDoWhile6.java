package Exercicios02_09_21;

import java.util.Scanner;

public class ExercioDoWhile6 {

	public static void main(String[] args) {
		int num,contN=1,multiT=0,media;
		
		do 
		{
			Scanner leia = new Scanner(System.in);
			System.out.println("\nDigite um n�mero: ");
			num = leia.nextInt();
			if(num % 3 ==0)
			{
				contN++ ;
				multiT += num;
			}
			
		}while(num!=0);
		media = multiT/contN;
		System.out.println("\nA m�dia dos n�meros digitados �: "+media);

	}

}
