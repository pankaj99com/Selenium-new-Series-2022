package OOPSCONCEPT;
class MyEmployee1{
	
	private int id;
	
	private String name;
	
	public void setName(String s) {
		
		name=s;
		
	}
	public String getName() {
		
		return name;
	} 
	
	public void setId(int i) {
		if (i < 1 || i > 10) {
			 
           System.out.println("iNvalid entry");
        }
		id=i;
		
	}
	public int getId() {
		 
		return id;
	}
}
public class AccessModifierPrivate {

	public static void main(String[] args) {
		MyEmployee1 e=new MyEmployee1();
//		e.id=10;
//		e.name="pankaj" because variables are private we cannot access it
		e.setId(10);
		System.out.println(e.getId());
		
		e.setName("Pankaj");
		System.out.println(e.getName());

		

	}

}
