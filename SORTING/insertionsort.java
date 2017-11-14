package sort;
import java.io.File;
import java.util.Random;
public class insertionsort {
public static void main(String[] args) {
	int []arr= new int[100000];
	File arrayfile=new File("random2");
	
	
	
	for(int i=1;i<arr.length;i++) {
		for(int j=i;j>0;j--) {
			if(arr[j]<arr[j-1]) {
				int exchanger =arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=exchanger;
			}
		}
		}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
