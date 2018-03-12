package willnurspielen;

public class GeometricObject 
{
	public Vertex pos;
	public double width;
	public double height;
	
	public double getWidth(){return width;}
	public double getHeight(){return height;}
	public Vertex getPos(){return pos;}
	
	//Konstruktoren
	public GeometricObject (double w,double h,Vertex poss) 
	{
		width=w;
		height=h;
		pos=poss;
		
		if (width<0)
		{
			width = -width;
			pos.x = pos.x - width;
		}
		if (height<0)
		{
			height = -height;
			pos.y = pos.y - height;
		}
	}
	public GeometricObject (double w,double h)
	{
		this(w,h,new Vertex(0,0));
	}
	public GeometricObject(double w)
	{
		this(w,w); //konstruktor Breite = Höhe
	}
	public GeometricObject()
	{
		this(10);// Konstruktor schaut wo nur 1 wert rein muss-> w somit ist w=10 und w=h!
	}
	public GeometricObject(Vertex pos)
	{
		this(0,0,pos); //objekt ist ein punkt hannst nur eine pos eingeben
	}

	//Methoden
	public String toString()
	{
		return "width="+width+", height="+height+", pos="+pos;
	}
	public double circumference()
	{
		return 2*(width+height);
	}	
	public double area()
	{
		return width*height;
	}	
	public boolean contains(Vertex v)
	{
		return v.x >= pos.x && v.x <= pos.x+width //x is within
		&& v.y >= pos.y && v.y <= pos.y+height; //y is within
	}	
	public boolean isLargerThan(GeometricObject that)
	{
		return this.area() > that.area();
	}	
	public void moveTo(Vertex pos)
	{
		this.pos=pos;
	}
	public void moveTo(double x, double y)
	{
		moveTo(new Vertex(x,y));
	}	
	public void move(Vertex v)
	{
		moveTo(pos.add(v));
	}
	public boolean equals(Object thatObject)
	{
		if (thatObject instanceof GeometricObject)
		{
		GeometricObject that = (GeometricObject)thatObject; // casten thatObject zu GeometricObject
		return that.width==this.width
		&& this.height==that.height
		&& this.pos.equals(that.pos);
		}
		return false;
	}	
	public boolean touches(GeometricObject that) 
	 {
		 if ( this.pos.x+this.width  >= that.pos.x
				 && this.pos.x <= that.pos.x+that.width
			&& this.pos.y+this.height >= that.pos.y
				&& this.pos.y <= that.pos.y+that.height)
			{
			 return true;
			 }
		 return false;
	 }
}
