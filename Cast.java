package willnurspielen;

public class Cast 
{
	public static String asString(Object o)
	{
		 return (String)o;
	 }
	public static void main(String[] args)
	{
		String s1 = asString("hello");
		String s2 = asString(new Vertex(17,4));
	}
	
}
