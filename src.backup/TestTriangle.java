import static org.junit.Assert.*;
import org.junit.Test;

public class TestTriangle 
{
	@Test
	public void testIsTriangle() 
	{
	Triangle t1 = new Triangle(3,4,5);
	assertEquals(true,t1.isTriangle(t1));
	Triangle t2 = new Triangle(3,4,10);
	assertEquals(false,t1.isTriangle(t2));
	Triangle t3 = new Triangle(1,1,2);
	assertEquals(false,t1.isTriangle(t3));
	Triangle t4 = new Triangle(-1,-1,2);
	assertEquals(false,t1.isTriangle(t4));
	}
	
	@Test
	public void testGetType() {
		Triangle t1 = new Triangle(4,7,6);
		assertEquals("Scalene",t1.getType(t1));
		Triangle t2 = new Triangle(4,4,6);
		assertEquals("Isosceles",t2.getType(t2));
		Triangle t3 = new Triangle(4,4,4);
		assertEquals("Regular",t3.getType(t3));
		Triangle t4 = new Triangle(-1,-1,2);
		assertEquals(false,t1.isTriangle(t4));
		}
	
	@Test
	public void testGetBorders() 
	{Triangle t = new Triangle(3,4,5);
	t.getBorders();}
	
	}
