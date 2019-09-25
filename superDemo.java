package inheritance;
//Using super to overcome name hiding
public class superDemo {

public static void main(String[] args) {
	B subObj = new B(1,2);
	subObj.show();
	
}
}

class A{
	int i;
}
// creating a subclass by extending A
class B extends A{
	int i; // this hides the i in A
	
	B(int a, int b){
		super.i =a; //i in A
		i =b;//i in B
	}
	void show() {
		System.out.println("i in superclass: "+ super.i);
		System.out.println("i in subclass: "+ i);
	}
}
