package stupid;

public class StupidRunner
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Lets look at inheritance!");

		Dumb harry = new Dumb(9);
		Dumber lloyd = new Dumber();

		System.out.println("harry is a Dumb, his blerg is:" + harry.getBlerg());

		System.out.println("lloyd is a Dumber, his blerg is:"
				+ lloyd.getBlerg());

		lloyd.setBlerg(45);

		System.out.println("harry is a Dumb, his blerg is:" + harry.getBlerg());

		System.out.println("lloyd is a Dumber, his blerg is:"
				+ lloyd.getBlerg());

	}

}
