package willnurspielen;

public class GeometricObjectTest 
{
	public static void main(String [] args)
	{

		GeometricObject o1 = new GeometricObject(17,4,new Vertex(42,23));
		GeometricObject o2 = new GeometricObject(17,4);
		GeometricObject o3 = new GeometricObject(17);
		GeometricObject o4 = new GeometricObject();
		GeometricObject o5 = new GeometricObject(1,1);
		GeometricObject o6 = new GeometricObject(1,1,new Vertex(3,0));
		GeometricObject o7 = new GeometricObject(1,1,new Vertex(1,1));
		
		System.out.println(o1.equals(o2));
		o2.moveTo(42,23);
		System.out.println(o1.equals(o2));
		System.out.println(o3.contains(new Vertex(10,3)));
		System.out.println(o4);
		System.out.println(o5.touches(o6));
		System.out.println(o5.touches(o7));
	}	
}
