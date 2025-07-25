package ishu;

public class Static {
	void speak()
	{
		System.out.println("person speaks");
	}

}
class Teachers extends Static
{
	void speak()
	{
		System.out.println("Teacher speaks");
	}
}
class sbinding
{
	public static void main(String[]args)
	{
	Static p=new Static();
	p.speak();
	Static p1= new Static();
	p1.speak();
	}
}
