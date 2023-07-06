package project;

import java.util.ArrayList;

public class Shape {
	

	public void Area() {
		
		System.out.println("Calculated area");
	}	

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		
		Rectangle rectangle = new Rectangle(4, 4);
        Circle circle = new Circle(4);

        shapes.add(rectangle);
        shapes.add(circle);
		
        try {
            for (Shape shape : shapes) {
                shape.Area();
            }
        
        } finally {
            System.out.println("Area calculated");
        }
	}
  }

		
		
		
		
		
		
		
		
