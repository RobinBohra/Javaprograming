package unit_01;

public class P3_Task01_WrappingClassesInJava {

	public static void main(String[] args) {
		/* The Wrapper classes in java helps in converting primitive into objects.
		 * because in java is a fully object oriented language and everything is almost written in obects 
		 * form.
		 * we can use 8 data types in java
		 * 1.Byte 2.Integer 3.Long 4.Float 5.Double 6.char 7.Boolean 8.short 
		 */
		int a = 10;
		String s = "" + a + "";
		Integer i = Integer.valueOf(a);//converting int value Integer explicity
		Integer j = a;//autoboxing : now compiler automatically write Integer.valueof(a)
		
		System.out.println(a + " " + i + " " + j );
		
		System.out.println(i.toString());
		//a.toString can not be used as a is an int type not an object
		//autoboxing converting primitve into objects
		
		byte b = 10;
		Byte byteobj=b;
		
		System.out.println(byteobj);
		//converting objects into primitive
		
		byte bytevalue = byteobj;
		System.out.println(bytevalue);
	}

}
