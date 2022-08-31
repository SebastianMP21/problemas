import java.util.Scanner;

public class ej1 {
	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		 
		int horaMil;
		int min;
		int s;
		
		System.out.println("Por favor ingresar la hora militar: ");
		horaMil = entrada.nextInt();
		System.out.println("Por favor ingresar los minutos: ");
		min= entrada.nextInt();
		System.out.println("Por favor ingresar los segundos: ");
		s = entrada.nextInt();
		
		if	(horaMil <=12) 
			System.out.println(horaMil + " : " + min + " : "+ s);
		else 
			System.out.println(horaMil - 12 + " pm : " + min + " : " + s);
		
	}
}
