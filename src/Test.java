import java.util.*;

public class Test 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Podaj pierwsz¹ liczbê do dodania: ");
		int a = in.nextInt();
		
		System.out.print("Podaj drug¹ liczbê do dodania: ");
		int b = in.nextInt();
		
		Dodawanie suma = new Dodawanie();
		System.out.println(suma.Add(a, b));
	}
}
