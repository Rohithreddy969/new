package project;

public class Rectangle extends Shape {
	
	  double length;
      double width;

    public Rectangle(double length, double width) {
    	
    	this.length = length;
    	this.width = width;
	}

	public void Area() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
    
}

