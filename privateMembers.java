package inheritance;
//superclass
class A{
	int i;
	private int j;//private Member
	
	void setij(int x, int y) {
		i=x;
		j=y;
		
	}
}

class B extends A{
	int total;
	
	void sum() {
		total = i+j;//error change access modifier
	}
}
public class privateMembers {
	public static void main(String[] args) {
		B subObj = new B();
		subObj.setij(10, 12);
		subObj.sum();
		System.out.println("Total is: "  subObj.sum());
	}

}
