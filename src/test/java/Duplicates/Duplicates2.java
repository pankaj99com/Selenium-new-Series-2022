package Duplicates;

public class Duplicates2 {

	public static void main(String[] args) {
		
		int[] a={1,2,2,3,4,5,5,6};//sorted array then this logic is correct
		
		//int[] temp=new int[a.length];//create a new array that will store the values after comparasion
		int j=0;
		
		for(int i=0;i<a.length-1;i++)//traverse in main array
		{
			
			if(a[i] !=a[i+1])//compare i and i+1 values
			{
				a[j]=a[i];//copy the values in new array 
				j++;
			}
		}
		a[j]=a[a.length-1];//this is for printing last index
		for(int i=0;i<j+1;i++)
		{
		System.out.print(a[i]+" ");	
		}
	}

}
