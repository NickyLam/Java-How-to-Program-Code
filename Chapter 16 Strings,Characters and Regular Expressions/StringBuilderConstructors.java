// Fig. 16.10: StringBuilderConstructors.java
// StringBuilder constructors.

public class StringBuilderConstructors 
{
	public static void main( String[] args)
	{
		StringBuilder buffer1 = new StringBuilder();
		StringBuilder buffer2 = new StringBuilder( 10 );
		StringBuilder buffer3 = new StringBuilder( "hello" );
		
		System.out.printf( "buffer1 = \"%s\"%n", buffer1);
		System.out.printf( "buffer2 = \"%s\"%n", buffer2);
		System.out.printf( "buffer3 = \"%s\"%n", buffer3);
	} // end main
} // end class StringBuilderConstructors
