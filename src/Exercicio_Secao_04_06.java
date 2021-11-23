import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Secao_04_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double vlr_Um;
		double vlr_Dois;		
		double vlr_Tres;
		
		double vlr_Pi = 3.14159;
		
		double area_Triangulo;
		double area_Circulo;
		double area_Trapezio;
		double area_Quadrado;
		double area_Retangulo;
		
		
        Locale.setDefault(Locale.US);
		
        Scanner sc = new Scanner(System.in);
        
        vlr_Um   = sc.nextDouble();
        vlr_Dois = sc.nextDouble();
        vlr_Tres = sc.nextDouble();
		
        area_Triangulo = ((vlr_Um * vlr_Tres) / 2);
        area_Circulo  = (vlr_Pi * Math.pow(vlr_Tres, 2));
        area_Trapezio  = (((vlr_Um + vlr_Dois) / 2) * vlr_Tres);
        area_Quadrado  = (Math.pow(vlr_Dois, 2));
        area_Retangulo  = (vlr_Um * vlr_Dois);
		
		System.out.printf("햞ea Triangulo Retangulo :  %.3f \n", area_Triangulo);
		System.out.printf("햞ea do Circulo          :  %.3f \n" , area_Circulo);
		System.out.printf("햞ea do trapezio         :  %.3f \n" , area_Trapezio);
		System.out.printf("햞ea do Quadrado         :  %.3f \n" , area_Quadrado);
		System.out.printf("햞ea do Retangulo        :  %.3f \n" , area_Retangulo);
		sc.close();	

	}

}
