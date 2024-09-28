package task2;

import java.util.Scanner;


public class Student_Grade_Calculator {
	
	//for calculating the grade
	 public static String calculateGrade(double averagePercentage) {
	        if (averagePercentage >=90 ) {
	            return "A";
	        } else if (averagePercentage >= 80) {
	            return "B";
	        } else if (averagePercentage >= 70) {
	            return "C";
	        } else if (averagePercentage >= 60) {
	            return "D";
	        } else {
	            return "F";
	        }
	    }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of subject:");
	    int noOfSubject=sc.nextInt();
	    
	    double marks[]=new double[noOfSubject];
	    
	    
	    for(int i=0;i<marks.length;i++) 
	    {
	    	 System.out.print("Enter marks for subject " + (i) + " out of 100: ");
	    	 marks[i]=sc.nextDouble();
	    }
	    
	    
	    double totalMarks = 0;
	    for(int i=0;i<marks.length;i++)
	    {
	    	totalMarks+=marks[i];
	    }
	   
	    
	    double averagePercentage=totalMarks/noOfSubject;
	    
	    String grade=calculateGrade(averagePercentage);
	    
	    System.out.println("------RESULT-------");
	    System.out.println("Total Marks Obtain: "+totalMarks);
	    System.out.println("Average Percentage: "+averagePercentage);
	    System.out.println("Average Percentage: "+grade);
	    
	

	}

}
