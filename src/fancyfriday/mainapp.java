/**
 * This is a demo app 
 */
package fancyfriday;

import java.util.Scanner;

/**
 * @author Student
 *
 */
public class mainapp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputfancyfriday, inputSunny, inputRaining;
		boolean Fancyfriday, Sunny, Raining = false;
		
		// Get input from the user
		   Scanner input = new Scanner(System.in);
		   System.out.println("Is it fancy friday?");
		   inputfancyfriday= input.nextLine();  
		   
		   System.out.println("sunny?");
		   inputSunny= input.nextLine(); 
		   
		   System.out.println("raining?");
  	       inputRaining= input.nextLine(); 
		   
		   //Test if the variables are working properly
		   //System.out.println(fancyfriday = "" +sunny = "" +raining="");
		 
		// Set condition variables based on input
		if(inputfancyfriday.equalsIgnoreCase("yes)")) {
			Fancyfriday = true;
		}
			if(inputSunny.equalsIgnoreCase("yes)")) {
				Sunny = true;
			}
				if(inputRaining.equalsIgnoreCase("yes)")) {
					Raining = true;
				}	
		// Use if statement to decide what to wear
					
	
					
				}
//				input.close();
//				System.out.println("BOY BYE... I AINT SORRY");
					}
				
		

	


