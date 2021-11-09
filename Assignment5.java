abstract class Shape{
abstract void draw();
       }		
 class Line extends Shape
     {
	public void draw()
	{
		System.out.println("Draw a line of cm 20");
	}
     }
class Rectangle extends Shape
    {
	public void draw()
	{
		System.out.println("Draw a rectangle of length 15 breadth 25");
	}
     }
class Cube extends Shape
    {
	public void draw()
	{
		System.out.println("Draw a cube");
	}
    }
 class MainShape{
  public static void main(String[] args)
	{
		Line line = new Line();
		Rectangle rectangle = new Rectangle();
		Cube cube = new Cube();
		line.draw();
		rectangle.draw();
		cube.draw();
		
	}
    }

