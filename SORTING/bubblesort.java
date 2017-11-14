package sort;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
//the worst sorting algorithm
public class bubblesort {
public static void main(String[] args) {
	int [] array=new int[50000];
	
	
	try {
	File arrayfile=new File("random2");
	Scanner unsortednumbers=new Scanner(arrayfile);
	int i=0;
	
	while(unsortednumbers.hasNext()) {
		//System.out.print("hello");
		array[i]=unsortednumbers.nextInt();
		//System.out.print(array[i]+" ");
		i++;
		if(i==50000) {
			break;
		}
		
	}
	//System.out.println("done");
	unsortednumbers.close();
} 
  catch(FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	for(int i=1;i<array.length;i++) {
		for(int j=i;j>0;j--) {
			if(array[j]<array[j-1]) {
				int exchanger =array[j];
				array[j]=array[j-1];
				array[j-1]=exchanger;
			}
		}
		}
	System.out.print("done");
		
	for(int i=0;i<array.length;i++) {
		
		System.out.print(array[i]+" ");
		
	}
	}
}

