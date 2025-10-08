
class Demo
{
	int id;
}

public class Test {
	public static void main(String[] args) {
		
		
		try {
			Demo d= null	;
			d.id = 50;
		} 
		catch(NullPointerException e)
		{
			System.out.println("Null pointer");
		}
		catch (Exception e) {
			System.out.println("exception");
		}
		
		
		
	}
}
