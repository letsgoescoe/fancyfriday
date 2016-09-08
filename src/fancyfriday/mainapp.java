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
		boolean Fancyfriday = false, Sunny = false, Raining = false;
		
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
			if(Fancyfriday) {
				
				if(Sunny){
					System.out.println("tea gown");
				} else if(Raining){
				System.out.println("power suit");
				
				//catch all 
				} else {
					System.out.println("long gown");
				}
				
			} else {
				System.out.println("tshirt and jeans");
			}
	
					
				}

					}
				
		

	


