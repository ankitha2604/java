package ankitha;

public class students {
	
			int rollno;
			String name;
			void display()
			{
			System.out.println("student name is :"+name);
			System.out.println("student roll number is :"+rollno);
			}
	}
			class studentsinfo {
			private static String name;
			private static int rollno;

			public static void main(String[] args)
			{
			students s1 = new students ();
			s1.name = "krish";
			s1.rollno = 12;
			s1.display();
	
		
			
			}

			
				}
			


