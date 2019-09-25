package inheritance;


// superclass
	class A {
		int i,j;
	
		void showij() {
			System.out.println("i and j: "+ i+" "+j);
		}
	}
	
	class B extends A{
		int k;
		void showk() {
			System.out.println("k: " + k );
		}
		
		void sum() {
			System.out.println("i + j+ k :" + (i+j+k));
		}
	}
	public class simple {
	public static void main(String[] args) {
		A superObj = new A();
		B subObj = new B();
		
		//superclass may be used by itself
		superObj.i =10;
		superObj.j =20;
		System.out.println("Contents of superObj: " );
		superObj.showij();
		System.out.println();
		
		//subclass has access to all public members of its superclass
		subObj.i=7;
		subObj.j= 8;
		subObj.k= 9;
		System.out.println("Contents of subObj: ");
		subObj.showij();
		subObj.showk();
		System.out.println();
		
		System.out.println("Sum of i, j and k in subObj: ");
		subObj.sum();
		
	}
}
