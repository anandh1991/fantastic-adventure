//fantastic-adventure

import java.io.*;
import org.testng.annotations.Test;
import java.util.*;

//My new Adventure
public class Array {
@Test
	public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub
int[] FirstArray= {56,89,65,54,32};

for(int i=0; i<FirstArray.length; i++); 
	System.out.println(FirstArray.length);

	//Summing element
int j=0;
	for (int i=2; i<FirstArray.length; i++) {
	j+=FirstArray[i];}
	System.out.println();
	System.out.println("Sum of Element " + j);
	
	// Display largest number with exception
	try {
	int max =FirstArray[5];
	for (int i=1; i<FirstArray.length; i++) { 
		if(FirstArray[i]>max) max= FirstArray[i];   
	}
		System.out.println("Largest No of Array :" + max);
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Exception :" + e);}

	
	     // Execption with array
	try { FileReader fr=new FileReader("F://Java/Brand.java");
		char []a= new char[50];
		fr.read(a); // read value of a
		//for (char b : a);  //looping values and store in b
		System.out.println(a);}
	catch (IOException e){
		e.printStackTrace();
	}
	
	}
		
	}


