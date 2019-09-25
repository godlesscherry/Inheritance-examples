package inheritance;

class Box{
	private double height;
	private double width;
	private double depth;
	
	// construct clone of an Object
	Box(Box ob){
		width = ob.width;
		depth = ob.depth;
		height = ob.height;
	}
	
	//constructor used when no dimensions specified
	Box(){
		width =-1; //use -1 to indicate an uninitialized box
		depth=-1;
		height=-1;
	}
	
	//constructor with all the dimensions specified
	Box(double w, double h, double d){
	 width = w;
	 depth = d;
	 height = h;
	}

	//constructor when box is a cube
	Box(double len){
		width = depth = height = len;
	}
	
     //compute and return volume
	double volume() {
		return width*depth*height;
	}
}

// Add weight
class BoxWeight extends Box{
	double weight;
	
	//construct a clone of an object
	BoxWeight(BoxWeight ob){
		super(ob);
		weight = ob.weight;		
	}
	
	//constructor when all the parameters are specified
	BoxWeight(double w, double h, double d, double wgt){
		super(w,h,d);
		weight = wgt;
	}
	//default constructor
	BoxWeight(){
		super();
		weight = -1;
	}
	
	//constructor when a cube is created
	BoxWeight(double len, double m){
		super(len);
		weight = m;
	}
}

//shipping class which adds shipping costs
class Shipping extends BoxWeight{
	double cost;
	
	//construct clone of an Object
	Shipping(Shipping ob){
	   super(ob);// pass the object to constructor
	   cost = ob.cost;
	}
	
	//constructor when all parameters are specified
	Shipping(double w, double d, double h, double wgt, double c){
		super(w,d,h,wgt);
		cost =c;
	}
	
	//default constructor
	Shipping(){
		super();
		cost =-1;
	}
	
	//constructor used when cube is created
	Shipping(double len, double wgt, double c){
		super(len, wgt);
		cost = c;
	}
	
}
public class multiLevelInheritanceDemo {

	public static void main(String[] args) {
		Shipping ship1 = new Shipping(1,21,15,14.1,23);
		Shipping ship2 = new Shipping(2,3,4,0.17,3);
		double vol;
		
		vol = ship1.volume();
		System.out.println("Volume of 1st shipment: "+ vol);
		System.out.println("weight of 1st shipment: " + ship1.weight);
		System.out.println("Cost of 1st shipment: " + ship1.cost);
		System.out.println();
		
		vol = ship2.volume();
		System.out.println("Volume of 2nd shipment: "+ vol);
		System.out.println("weight of 2nd shipment: " + ship2.weight);
		System.out.println("Cost of 2nd shipment: " + ship2.cost);
		System.out.println();
	}
}
