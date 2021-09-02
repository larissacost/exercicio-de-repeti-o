package Exercicios02_09_21;

public class ExercicioFor2 {

	public static void main(String[] args) {
		int num,contI=0,contP=0,x;
		
		for(x=0;x<11;x++)
		{
		 if(x%2==0)
		 {
			 contP++;
		 }
		 else
		 {
			contI++;
		 }
		}
		System.out.println("\nA quantidade de pares é: "+contP);
		System.out.println("\nA quantidade de ímpares é: "+contI);
        
	}

}
