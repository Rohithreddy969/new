package project;

public class Circle extends Shape {
	
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
		public void Area() {
	        double area = Math.PI * radius * radius;
	        System.out.println("Circle Area: " + area);
	    
	}

}
