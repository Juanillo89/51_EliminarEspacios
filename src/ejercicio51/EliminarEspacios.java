package ejercicio51;

import java.util.Scanner;

public class EliminarEspacios
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca cadena: ");
		String cadena = sc.nextLine();
		String cadenaSinEsp = "";
		sc.close();
		for (int i = 0; i < cadena.length(); i++)
		{
			if (cadena.charAt(i) != ' ')
			{
				cadenaSinEsp += cadena.charAt(i);
			}
		}
		System.out.println(cadenaSinEsp);
	}
}
