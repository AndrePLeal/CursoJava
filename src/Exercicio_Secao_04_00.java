import java.util.Locale;

public class Exercicio_Secao_04_00
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String product1 = "Computer";
    String product2 = "Office Desk";
	int age = 54;
	int code = 1967;
	char gender = 'M';
	double price_1 = 5000.00;
	double price_2 = 10000.00;		
	double measure = 53.12345678;
	
	System.out.println("Products:");
	System.out.printf ("%s ,which price is %.2f \n" ,product1, price_1);
	System.out.printf ("%s ,which price is %.2f \n \n" ,product2, price_2);
	System.out.printf ("Record: %d years old, code %d and Gender: %s \n \n" ,age, code,gender);
	System.out.printf ("Measure with eigth decimal places: %.8f \n", measure);
	System.out.printf ("Measure rounded with Three decimal places: %.3f \n", measure);
	Locale.setDefault(Locale.US);
	System.out.printf ("Measure rounded with Three decimal places US STANDARD: %.3f", measure);
	
	}

}
