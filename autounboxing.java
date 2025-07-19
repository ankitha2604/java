package ankitha;

public class autounboxing {

	public static void main(String[] args, int booleanobj) {
	boolean b = true;
	byte b1 = 100;
	double d =200.0d;
	float f = 300.5f;
	long l = 400l;
	int i = 500;
	short s =600;
	
	boolean boolobj=b;
	byte byteobj=b1;
	double doubleobj=d;
	float floatobj=f;
	long longobj=l;
	int intobj=i;
	short shortobj=s;
	
	System.out.println("primitive objects");
	System.out.println(+booleanobj);
    System.out.println(+byteobj);
    System.out.println(+doubleobj);   
    System.out.println(+floatobj);
    System.out.println(+longobj);
    System.out.println(+intobj);
    System.out.println(+shortobj);
  
	boolean boolvalue=boolobj;
	byte bytevalue=byteobj;
	double doublevalue=doubleobj;
	float floatvalue=floatobj;
	long longvalue=longobj;
	int intvalue=intobj;
	short shortvalue=shortobj;
	
	System.out.println("primitive values");
	
    System.out.println(+bytevalue);
    System.out.println(+doublevalue);   
    System.out.println(+floatvalue);
    System.out.println(+longvalue);
    System.out.println(+intvalue);
    System.out.println(+shortvalue);

	}

}
