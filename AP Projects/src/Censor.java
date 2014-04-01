/**
 * Class that checks a string for specific words
 * 
 * Jon Ausherman
 * 1.14.14
 * 
 * version 1.5
 */
import java.util.*;
import java.io.*;

public class Censor {
	public static void main(String[] args){
		//checks to see if the user wants to enter any thing else
		do{
			checkSent(inStrng());//<=asks for a string, then returns it it the next method. I was surprised this worked
		}while(looping());
		
	}
	//method the check for the "bad" words
	public static void checkSent(String inSent){
		StringTokenizer stfSrg = new StringTokenizer(inSent, " ',.");//<= these are all the white spaces I saw in the sentences the book gave
		boolean dumbCheck = true;//this boolean will remain true if there are not "bad" words in the inputted sentence
		do{
			String checker = stfSrg.nextToken();
			checker = checker.toLowerCase();
			if(checker.equals("hermes")){
				System.out.println(inSent + ">>>REJECTED");
				dumbCheck = false;
				break;//code ends any time a "bad" word is found
			}else if(checker.equals("bridge")){
				System.out.println(inSent + ">>>REJECTED");
				dumbCheck = false;
				break;
			}else if(checker.equals("muddy")){
				System.out.println(inSent + ">>>REJECTED");
				dumbCheck = false;
				break;
			}else if(checker.equals("river")){
				System.out.println(inSent + ">>>REJECTED");
				dumbCheck = false;
				break;
			}else if(checker.equals("assault")){
				System.out.println(inSent + ">>>REJECTED");
				dumbCheck = false;
				break;
			}else if(checker.equals("offensive")){
				System.out.println(inSent + ">>>REJECTED");
				dumbCheck = false;
				break;
			}
				
		}while(stfSrg.hasMoreTokens());//if there are any more tokens left in the string, this loop will continue, unless broken
		if(dumbCheck == true){
			System.out.println(inSent + ">>>OK");
			}
		
	}
	
	//Grabs the original sentence and returns it.
	public static String inStrng(){//all methods must be static because the main method is static, found that out the hard way
		Scanner inScn = new Scanner(System.in);
		System.out.println("Enter next sentence: ");
		
		String origin = inScn.nextLine();
		System.out.println(origin);
		return origin;
	}
	
	//returns a boolean of true if the user wants to continue
	public static boolean looping(){
		Scanner yn = new Scanner(System.in);
		System.out.println("Enter another sentence? Enter \'yes\' or \'no\'");
		String yesno = yn.next();
		yesno = yesno.toLowerCase();//takes any capitalisation issues out of the way
		
		if(yesno.equals("yes")){
			return true;
		}else return false;
		
	}
}
