/**
 * @author Jon Ausherman
 * @version 1.0
 */
package com.indescribableindustries.jona.projects43to45a;

/**
 * @description A combination of Lessons 43, 44, and 45a
 * 
 */
	public class BankAccount{     
		
		public BankAccount(String nm, double amt){         
		amt = balance;
		nm = name;
		      
		}     
		
		//adds the real number amount
		public void deposit(double dp){         
			balance = balance + dp;     
		}     
		
		//subtracts the real number amount
		public void withdraw(double wd){         
			balance = balance - wd;        
		}     
		
		String name;     
		double balance;
		
		/**
		@note for some reason, when I access name and balance through getters, I can only
		access the values from the last object created in ArrayList
		*/
		public String getName() {
			return name;
		}

		public double getBalance() {
			return balance;
		}
		
		
}
