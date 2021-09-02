package Exercicios02_09_21;

import java.util.Scanner;

public class ExercicioWhile3 {

	public static void main(String[] args) {
		int idade,contMenos=0,contMais=0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com a sua idade:");
		idade = leia.nextInt();
		
		while(idade>1)
		{
			if(idade<21)
			{
				contMenos++;
			}
			else if(idade >50)
			{
			    contMais++;	
			}
		}
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+contMenos);
		System.out.println("\nTotal de pessoas com mais de 50 anos: "+contMais);
	}

}
