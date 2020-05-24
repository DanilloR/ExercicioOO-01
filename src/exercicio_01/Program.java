package exercicio_01;

import java.util.Locale;
import java.util.Scanner;

import entity.Rectangle;

public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rt = new Rectangle();
		System.out.println("Enter rectangle widht and height");
		rt.width = sc.nextDouble();
		rt.height = sc.nextDouble();
		
		System.out.println(rt);
		
		sc.close();

	}

}
