package generalLogic;

public class ConvertValuesToString {
	
		public static void main(String args[])
		{
			//define different type of values
			int intVal=120;
			float floatVal=12.34f;
			double doubleVal=2345.0d;
			boolean booleanVal=true;

			System.out.println("After converting into string");
			
			//printing values in string format 
			System.out.println("String value of intVal: "+ String.valueOf(intVal));
			System.out.println("String value of floatVal: "+ String.valueOf(floatVal));
			System.out.println("String value of doubleVal: "+ String.valueOf(doubleVal));
			System.out.println("String value of booleanVal: "+ String.valueOf(booleanVal));  
		}
	}