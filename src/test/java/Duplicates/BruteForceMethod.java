package Duplicates;

public class BruteForceMethod {

	public static void main(String[] args) {
		int[]a={1,4,2,3,2,4,7,4,9,8};
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]==a[j]){
					
					System.out.print(a[i]+" ");
					
				}
				}
			}
		}
	}

