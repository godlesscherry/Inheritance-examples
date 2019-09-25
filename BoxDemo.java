package inheritance;
//Inheritance to extend box
public class BoxDemo {
double width;
double height;
double depth;
// construct clone of an object
BoxDemo(BoxDemo ob){
	width = ob.width;
	depth = ob.depth;
	height = ob.height;
	
}

//constructor with all the dimensions specified
BoxDemo(double w, double h, double d){
 width = w;
 depth = d;
 height = h;
}

// constructor with no dimensions specified
BoxDemo(){
	width =-1; // use -1 to indicate uninitialized box
	depth =-1;
	height =-1;
	
}

// constructor used when cube is created
BoxDemo(double len){
	width = height = depth = len;
}

//compute and return volume
double volume() {
	return width*height*depth;
}

}

//Extend Box to include weight
class BoxDemoWeight extends BoxDemo{
	double weight; // weight of the box
	
	//constructor for boxweight
	BoxDemoWeight(double wgt, double w, double h, double d){
//		width =w;
//		height = h;
//		depth = d;
		// Alternatively we can call superclass constructor
		super(w,h,d);
		//super must always be the first statement executed inside the subclass constructor
		weight =wgt;
		
	}
	
	
	public static void main(String[] args) {
	    BoxDemoWeight mybox1 = new BoxDemoWeight(10,20,15,34.3);
	    BoxDemoWeight mybox2 = new BoxDemoWeight(1, 2, 1 ,3.3);
	    double vol = mybox1.volume();
	    System.out.println("volume of box1: " + vol);
	    System.out.println("weight of box1: " + mybox1.weight);
	    System.out.println("");
	    double vol2 = mybox2.volume();
	    System.out.println("volume of box2: " + vol2);
	    System.out.println("Weight of box2: " + mybox2.weight);
	    System.out.println("");
	    
		}
	
}


