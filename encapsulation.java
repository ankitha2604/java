package ishu;

import ankitha.person;

public class encapsulation {
	private string name;
    private int age;
    public string getname() {
		return name;
	}
    public void Setname (string name)
    {
    	this.name=name;
    }
    public int getage()
    {
    	return age;
    }
    public void Setname (int age)
    {
    	this.age=age;
    }
}    
class mains    
{
	public static void main (String[]args)
	{
		encapsulation p = new encapsulation();
		person person = new person();
		person.setName("John");
		person.setAge(30);
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		}
}
	