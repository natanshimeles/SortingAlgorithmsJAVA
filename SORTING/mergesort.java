package sort;

import java.awt.List;
import java.util.Random;

/**
   * Mergesort algorithm.
   * @param a an array of Comparable items.
   */

public class mergesort{
	
	public static void main(String[] args) {
		Random r=new Random();
		int[] a= {6,5,4,3,2,1};
		//int c=0;
		//while(c<a.length) {
		//	a[c]=r.nextInt(10000);
		//}
		
		divide(a);
		//for(int i:a) {
			//System.out.println(i);
		//}
	}
public static void divide(int[] list) {
	
	if(list.length>1) {
      int[]firsthalf=new int[list.length/2];
	  System.arraycopy(list, 0, firsthalf, 0, list.length/2);
	  for(int k:firsthalf) {
		  System.out.print(k);
	  }
	  System.out.println();
	  
	  divide(firsthalf);
		
		
	  int secondhalflength=list.length-list.length/2;
	  int []secondhalf=new int[secondhalflength];
	  System.arraycopy(list, list.length/2, secondhalf,0,secondhalflength);
	  divide(secondhalf);
	  int [] temp=merge(firsthalf,secondhalf);
	  System.arraycopy(temp,0,list,0,temp.length);
	}
}
private static int[] merge (int[] list1,int [] list2) {
	int[] temp=new int[list1.length + list2.length];
	
	int current1=0;
	int current2=0;
	int current3=0;
	while(current1<list1.length&&current2<list2.length) {
		if(list1[current1]<list2[current2]) {
			temp[current3++]=list1[current1++];
		}
		else {
			temp[current3++]=list2[current2++];
		}}
		while(current1<list1.length) {
			temp[current3++]=list1[current1++];
		}
		while(current2<list2.length) {
			temp[current3++]=list2[current2++];
		}
		
	return temp;
	
}


}