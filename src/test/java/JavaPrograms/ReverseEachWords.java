package JavaPrograms;

public class ReverseEachWords {

	public static void main(String[] args) {
		
		String str="I am learning java";
		String result="";
		
		String[] arr=str.split(" ");
		
		for(int i=arr.length-1;i>=0;i--) {
			
			result=result+arr[i]+" ";
			
		}
		
		System.out.println(result);

	}

}
