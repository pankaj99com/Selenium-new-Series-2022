package StringConcept;

final public class Test {
	
	private int i;
	Test(int i){
		this.i=i;
	}
	public Test change(int i) {
		if(this.i==i) {
			return this;
		}else {
			return (new Test(i));
		}
	}

	public static void main(String[] args) {
		Test t1=new Test(10);
		Test t2=new Test(100);
		Test t3=new Test(10);
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		

	}

}
