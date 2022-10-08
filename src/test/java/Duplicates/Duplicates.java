package Duplicates;

public class Duplicates {

	public static void main(String[] args) {
		
		int[] a={8,2,4,3,5,2,7,6,6};
		
		int[] temp=new int[a.length];//create a new array that will store the values after comparasion
		int j=0;
		
		for(int i=0;i<a.length-1;i++)//traverse in main array
		{
			
			if(a[i] !=a[i+1])//compare i and i+1 values
			{
				temp[j]=a[i];//copy the values in new array 
				j++;
			}
		}
		System.out.println(temp.length);
		temp[j]=a[a.length-1];//this is for printing last index
		for(int i=0;i<temp.length-2;i++)
		{
		System.out.print(temp[i]+" ");	
		}
	}

}
