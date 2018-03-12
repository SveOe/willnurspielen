package willnurspielen;

public class SimpleOval extends GeometricObject 
{
	public SimpleOval(double w, double h, Vertex pos)
	{
		this.width=w;
		this.height=h;
		this.pos=pos;
	}
	public SimpleOval(double w, double h, Vertex pos) 
	{
		super(w,h,pos);
	}
	public SimpleOval(double w, double h, double x, double y)
	{
		super(w,h,new Vertex(x,y));
	}
	
}
