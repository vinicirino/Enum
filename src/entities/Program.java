package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		Client cli = new Client("Maria", "maria@gmail.com", sdf.parse("02/10/1990"));
		
		
		System.out.println(cli);
		
		
		
		//Product p = new Product("TV", 1000.00);
		
		//OrderItem oi1 = new OrderItem(1, 1000.00, p);
		
		//System.out.println(oi1);
		
		
		
		
		sc.close();
		
	}

}
