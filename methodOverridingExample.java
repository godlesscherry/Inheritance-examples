package inheritance;

// practical example that uses method overriding and Using run-time 
class Figure{
	double dim1;
	double dim2;
	
	Figure(double a, double b){
		dim1 = a;
		dim2 = b;
	}
	
	double area() {
		System.out.println("Area is undefined");
		return 0;
	}
}
class Rectangle extends Figure{
	
	Rectangle(double a, double b){
		super(a,b);
	}
	
	//override area for rectangle
	double area() {
		System.out.println("Inside Area for a rectange");
		return dim1*dim2;
	}
}

class Triangle extends Figure{
	
	Triangle(double a, double b){
		super(a,b);
	}
	
	//override area for a triangle
	double area() {
		System.out.println("Area for a triangle");
		return dim1*dim2/2;
	}
}

public class methodOverridingExample {

	public static void main(String[] args) {
		Figure f = new Figure(10,10);
		Rectangle r = new Rectangle(9,5);
		Triangle t = new Triangle(10,8);
		
		Figure fig;
		
		fig =r;
		System.out.println("Area is: "+fig.area());
		
		fig = t;
		System.out.println("Area is: "+fig.area());
		
		fig = f;
		System.out.println("Area is: "+fig.area());
	}
}
