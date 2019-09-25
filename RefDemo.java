package inheritance;
// A reference variable of parent class can be assigned to reference of any  child class derived from it
public class RefDemo {

	public static void main(String[] args) {
		BoxDemoWeight weightbox = new BoxDemoWeight(2,5,7,8.3);
		BoxDemo plainbox = new BoxDemo();
		double vol;
		
		vol = weightbox.volume();
		System.out.println("volume of weightbox: " + vol);
	    System.out.println("weight of weightbox: " + weightbox.weight);
	    System.out.println("");
	    
	    //assign BoxDemoWeight(child) reference to BoxDemo(parent) object
	    plainbox = weightbox;
	    
	    vol = plainbox.volume();
	    System.out.println("volume of plainbox: " + vol);
	    //System.out.println("weight of plainbox: " + plainbox.weight);/invalid as weight is not defined inside plainbox
	}
}
