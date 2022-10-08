package javaConcepts;

public class static2DArray {

	public static void main(String[] args) {
		
		String str[][]=new String[2][5];
		System.out.println(str.length);//total rows
		System.out.println(str[0].length);//total columns
	
		str[0][0]="JAVA";
		str[0][1]="c";
		str[0][2]="c++";
		str[0][3]="selenium";
		str[0][4]="TestNg";
		str[1][0]="Pankaj";
		str[1][1]="Vishwa";
		str[1][2]="Priti";
		str[1][3]="Sandy";
		str[1][4]="Pranjali";
		
		System.out.println(str[0][4]);
		
		for(int row=0;row<str.length;row++) {
			for(int col=0;col<str[1].length;col++) {
				System.out.println(str[row][col]);
			}
		}
		
		
	}

}
