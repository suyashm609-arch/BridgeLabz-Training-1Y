import java.util.Scanner;
 class ArrayUpdatingElements{
public static void main (String[]args){
	Scanner sc= new Scanner(System.in);
int[] marks = {10,20,30,40,50};
System.out.println("Array elements :");
System.out.println("updating element:");
marks [3]=999;
System.out.println("array elements:");
	for (int i=0;i< marks.length; i++){
	System.out.println(marks[i]);
        }
 
     }
 }
