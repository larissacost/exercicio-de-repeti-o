package Exercicios02_09_21;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
    int idade,sex,humor,contC=0,contMN=0,contHA=0,contOC=0,contPQ=0,contPD=0,x=1;
    
    Scanner leia = new Scanner(System.in);
    
    while(x <= 5) {
    	System.out.println("\nEntre com a idade:");
    	idade = leia.nextInt();
    	if(idade < 1)
    	{
    		System.out.println("\nIdade inválido");
    	}
    	System.out.println("\nEntre com o seu gênero:\n1- Feminino\n2- Masculino\n3- Outros :");
    	sex = leia.nextInt();
    	if(sex<1 || sex>3)
    	{
    		System.out.println("\nOpção inválida");
    	}
    	System.out.println("\nEntre com o seu humor:\n1- Calmo\n2- Nervoso\n3- Agressivo :");
    	humor = leia.nextInt();
    	if(humor<1 || humor>3)
    	{
    		System.out.println("\nOpção inválida");
    	}
    	
    	if(humor == 1) 

    	{ 

    	contC++; 

    	} 

    	if(sex == 1 && humor == 2) 

    	{ 

    	contMN++; 

    	} 

    	if(sex == 2 && humor == 3) 

    	{ 

    	contHA++; 

    	} 

    	if(sex == 3 && humor == 1) 

    	{ 

    	contOC++; 

    	} 

    	if(humor == 2 && idade>40) 

    	{ 

    	contPQ++; 

    	} 

    	if(humor == 1 && idade<18) 

    	{ 

    	contPD++; 

    	} 
    	x++; 
    	} 
    
    System.out.println("\nQuantidade de pessoas calmas: "+contC); 
    System.out.println("\nQuantidade de mulheres nervosas: "+contMN); 
    System.out.println("\nQuantidade de homens agressivos: "+contHA); 
    System.out.println("\nQuantidade de outros calmos: "+contOC); 
    System.out.println("\nQuantidade de pessoas nervosas com mais de 40 anos: "+contPQ); 
    System.out.println("\nQuantidade de pessoas calmas com menos de 18 anos: "+contPD); 
    }
}


