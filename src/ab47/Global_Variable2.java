package ab47;

public class Global_Variable2 {
	static int a = 100;
	int b = 90;

	public static void main(String[] args) {
		System.out.println(a);
		Global_Variable2 gv2 = new Global_Variable2();
		gv2.b = 70;
		System.out.println(gv2.b);
	}
}
