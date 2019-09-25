package inheritance;

//Method Overriding
class A{
	int i, j;
	A(int a, int b){
		i=a;
		j=b;
	}
	
	//display i and j
	void show() {
		System.out.println("i and j: " + i+" & "+ j);
	}
}

class B extends A{
	int k;
	B(int a, int b, int c){
		super(a,b);
		k=c;
	}
	
	//display k - this overrides i and j in A
	void show() {
		super.show(); // calls the version in A
		System.out.println("k: " + k);
	}
	// overloaded method as parameters are different
	void show(String msg) {
		System.out.println(msg + k);
	}
	
}
public class methodOverriding {
	
	public static void main(String[] args) {
		B subObj = new B(1,2,3);
		subObj.show("This is the overloaded method call, k is : ");
		subObj.show(); // this calls the show in B
	}

}
