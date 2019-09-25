package inheritance;

// Demo for runtime polymorphism a.k.a Dynamic method dispatch 
class A{
	void callme() {
		System.out.println("Inside A's callme method");
	}
}

class B extends A{
	//override callme
	void callme(){
		System.out.println("Inside B's callme method");
	}
	
}

class C extends B{
	//override callme
	void callme() {
		System.out.println("Inside C's callme method");
	}
}

public class runtimePolymorphism {

	public static void main(String[] args) {
	A a = new A(); // object of type A
	B b = new B(); // object of type B
    C c = new C(); // object of type C
   
    A r;// obtain a reference of type A
    r = a; // r refers to object of type A
    
    r.callme();//calls A's version
    
    r =b; // refers to B object
    r.callme();// calls B's version
    
    r =c; //refers to C object
    r.callme(); // calls C's version
	} 
}
