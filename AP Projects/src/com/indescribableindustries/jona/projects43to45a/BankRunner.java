/**
 * @author Jon Ausherman
 * @version 1.0
 */
package com.indescribableindustries.jona.projects43to45a;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @description the class controls the Bank Accounts that are going
 * to be created
 * 
 */
public class BankRunner {
	
	
	public static void main(String[] args) {
		String escStatement = "";
		Scanner scnSt = new Scanner(System.in);//String Scanner
		Scanner scnDb = new Scanner(System.in);//Double Scanner
		//to store the BankAccount objects
		ArrayList<BankAccount> accountList = new ArrayList<BankAccount>();
		ListIterator<BankAccount> lstIt = accountList.listIterator();
		//allows the formatation of decimal numbers
		NumberFormat formatter = NumberFormat.getNumberInstance( );
		
		do{
			System.out.print("Please enter the name to whom the account belongs. " +
															"(\"Exit\" to abort) ");
			escStatement = scnSt.nextLine();
			
			
			if(!escStatement.equalsIgnoreCase("EXIT")){
			
				System.out.print("Please enter the amount of the deposit. ");
				//creates a new BankAccount object and adds it to accountList
				 lstIt.add(new BankAccount(escStatement, scnDb.nextDouble()));
				 System.out.print("");
			}
	
		}while(!escStatement.equalsIgnoreCase("EXIT"));
		
		//searches for the largest bank account
		double maxBalance = 0;
		String maxName = "";
		
		while(lstIt.hasPrevious()){//check to see if there is still an index to test
			BankAccount check = lstIt.previous();	
			//check to see if there is a larger balance
			if(check.balance>maxBalance){
				maxBalance = check.balance;
				maxName = check.name;
			}
			
		}
		System.out.println("The account with the largest balance belongs to " + maxName);
        System.out.println("The amount is $" + formatter.format(maxBalance));

	}

}
