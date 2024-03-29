/**
 * @author Jon Ausherman
 * @version 1.0
 */
package com.indescribableindustries.jona.proj50a;

/**
 * @description
 * 
 */
public class Proj50aRunnber {

	public static void main(String args[]) 

	 { 

	 int i[] ={-7, 15, 21, 22, 43, 49, 51, 67, 78, 81, 84, 89, 95, 97}; 

	 System.out.println(binarySearch(i, 22)); //prints 3 

	 System.out.println(binarySearch(i, 89)); //prints 11 

	 System.out.println(binarySearch(i, -100)); //prints -1 

	 System.out.println(binarySearch(i, 72)); //prints -1 

	 System.out.println(binarySearch(i, 102)); //prints -1 

	 } 

	 

	 //Look for srchVal in the a[] array and return the index of where it�s found 

	 //Return �1 if not found 

	 private static int binarySearch(int a[], int srchVal) 

	 { 

	 int lb = 0; 

	 int ub = a.length - 1; 

	 

	 while(lb <= ub) 

	 { 

	 int mid = (lb + ub)/2; 

	 if(a[mid] == srchVal) 

	 { 

	 return mid; 

	 } 

	 else if (srchVal > a[mid]) 

	 { 

	 lb = mid + 1; //set a new lowerbound 

	 } 

	 else 

	 { 

	 ub = mid -1; //set a new upper bound 

	 } 

	 } 

	 return -1; //srchVal not found 

	 } 

	}