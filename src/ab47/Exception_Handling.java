package ab47;

public class Exception_Handling {

	public static void main(String[] args) {
		try {
		int	c = 1/0;
		System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
		System.out.println("This is due to Arithmetic Exception");
		}

	}

}
