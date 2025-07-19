package ankitha;

public class string {

		public static void main (String[]args)
		{
		
		String s1="JAVA";
		char ch[]= {'P','R','O','G','R','A','M','M','I','N','G'};
		String s2=new String(ch);
		String s3=new String("LANGUAGE");
		
		
		String s4=s1.concat(s2);
		System.out.println("concatenating Two Strings: \n" +s4);
		
		
		System.out.println("Length of the first String : "+s1.length());
		System.out.println("Length of the second String : "+s2.length());
		System.out.println("Length of the third String : "+s3.length());
		
		System.out.println("Character at the position 5 in second string : "+s2.charAt(5));
		System.out.println("Index of the character 'A' in Second string : "+s2.indexOf('A'));
		
		System.out.println("Converting UpperCase to LowerCase: "+s1.toLowerCase());
		System.out.println("Converting LowerCase to UpperCase: "+s2.toUpperCase());
		
		System.out.println("Initial string created using 'String litrals' - "+s1);
		System.out.println("Initial string created using 'char to string' - "+s2);
		System.out.println("Initial string created using 'new code' - "+s3);
	    }
		}
