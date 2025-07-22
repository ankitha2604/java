package ishu;

public class hierarchical 
{
	void eat()
	{
		System.out.println(" and eating");
	}
}	
class dog extends hierarchical
{
	void bark()
	{
		System.out.println(" Dog is barking");
	}
}
class cat extends hierarchical
{
	void meow()
	{
		System.out.println("Cat is meowing");
	}
}
class hinhertiance
{
	public static void main(String[] args) 
	{
	     dog d = new dog();
	     d.bark();
	     d.eat();
	     cat c = new cat();
	     c.meow();
	     c.eat();

	}
}	


