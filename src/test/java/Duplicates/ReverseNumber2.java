package Duplicates;

import java.util.HashSet;

public class ReverseNumber2 {

	public static void main(String[] args) {

int[] a={2,1,8,2,3,4,8,4,8,2,9,9,9};

		HashSet<Integer> hs= new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++){
			hs.add(a[i]);
		}
		for(int n:hs){
			System.out.print(n + " ");
		}
		

	}

}
