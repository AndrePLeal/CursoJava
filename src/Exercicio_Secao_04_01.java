import java.util.Scanner;

public class Exercicio_Secao_04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		int y;
		int z;
		
		Scanner sc = new Scanner(System.in);
				
		x = sc.nextInt();
		y = sc.nextInt();
		z = x + y;
		
		System.out.println("conteudo de x : " +x);
		System.out.println("conteudo de y : " +y);
		System.out.println("conteudo de y : " +z);
		
		sc.close();
	}

}
