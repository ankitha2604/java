package ishu;

public class Dynamic 
{
	void speak()
	{
		System.out.println("person Speaks!");
	}
}
class teacher extends Dynamic
{
   @Override
   void speak()
   {
	   System.out.println("Teacher speaks!");
   }
}
class Dbinding
{
	public static void main(String[] args)
	{
		Dynamic p =new Dynamic();
		p.speak();
		teacher t=new teacher();
		t.speak();
	}
}


