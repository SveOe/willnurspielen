package willnurspielen;

public class Vertex 
{
	//definition der Objekteigenschaften x und y
	public double x;  //feldname=x, felddefinition=double, public=Atribut(erlaubt anderen klassen die werte dieses objektes zu erfragen)
	public double y;
	//public double a;
	
	//s1==s2;
	//s1.equals(s2);
	
	public Vertex (double xx,double yy) //Konstruktor bauanleitung für objekt/objekte auch ein art methode
	{
		x=xx;
		y=yy;
	}
	public static void main (String[] args) // main methode kann oben erzeugte objekte aufrufen und je nach methode  ausführen
	{
		Vertex v1 = new Vertex(17,4);   // erzeugung des objektes unter Nutzung des konstruktors
		Vertex v2 = new Vertex(42,0);   // werte werden zugewiesen z.b. (17,4), objekte haben as typ die klasse von der sie erzeugt werden
		//Vertex vv = new Vertex(0,0);
		
		//double a = 4*v2.x; 
		String s1="hallo";
		String s2="HallO".toLowerCase();
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		v1.y = 2*v1.y;
		
		System.out.println("v1.y = "+v1.y);
		System.out.println("v1.x*v2.x = "+v1.x*v2.x);
		System.out.println(v1);	
	}
	
	//toString methode
	public String toString() 
		{
			return "("+x+","+y+")";
		}
	public double length() 
	{
		return Math.sqrt (x*x+y*y);
	}  
	public Vertex skalarMult(double s)
	{
		return new Vertex(x*s,y*s);
	}
	public void skalarMultMod(double s)
	{
		 x=s*x;
		 y=s*y;
	}
	public Vertex add(Vertex v2)
	{
		return new Vertex(x+v2.x,y+v2.y);
	}
	public void addMod(Vertex v2)
	{
		 x=x+v2.x;
		 y=y+v2.y;
	}
	public void setzeX(double xx)
	{
		x=xx;
	}
	public void setX(double x){this.x = x;}
	public void setY(double y){this.y = y;}
	public double getX(){return x;}
	public double getY(){return y;}
	public boolean equals(Object thatObject)
	// checkt ob beide objekte der klasse vertex angehören, wenn ja wird weiterhin gecheckt ob sie ein und die selben sind 
	{
		if (thatObject instanceof Vertex)
		{
			Vertex that = (Vertex)thatObject;
			return this.x==that.x && this.y == that.y;
		}
		return false;
	}
	public Vertex sub(Vertex that)
	{
		return new Vertex(this.x-that.x,this.y-that.y);
	}
	public double distance(Vertex that) 
	{
		return  (Math.sqrt(Math.pow((this.x-that.x),2)+Math.pow((this.y-that.y),2)));
	}	
	public Vertex normalized() 
	{
		return new Vertex(1/this.length()*this.x,1/this.length()*this.y);
	}
	
	
}


