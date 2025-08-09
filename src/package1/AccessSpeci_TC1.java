package package1;

public class AccessSpeci_TC1 {
	public static void main(String[] args) {
		AccessSpeci_TC2 tc2 = new AccessSpeci_TC2();
		tc2.add();
		tc2.div();
		tc2.mul();
		//tc2.sub(); This is private method of AccessSpeci_TC2 Class
	}

}
