package Mapi2;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws InstantiationException, Exception, Exception {
		
		Methods method=new Methods();
		Scanner sa = new Scanner(System.in);
		
do {
			
			
			System.out.println("..........................");

		System.out.println("////////////////////////////////////");
		System.out.println("////////////Main Menue//////////////");
		System.out.println("///     1.Read From Api          ///");
		System.out.println("///     2.Create Table           ///");
		System.out.println("///     3.Inset Value Into Table ///");
		System.out.println("////////////////////////////////////");
		
		System.out.println("plz select option...");
		int list = sa.nextInt();
		System.out.println("..........................");

		
		switch(list){
		
		case 1:
			
			method.ReadFromApi();
			
			break;
			
		case 2:
			
			method.CreateApiTable();
			
			break;
			
		case 3:
			
			method.InsertValue();
			
			break;
		
		}
		}while(true);
		
	}

}
