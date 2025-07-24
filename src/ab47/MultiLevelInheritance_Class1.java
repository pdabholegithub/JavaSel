package ab47;

class MultiLevelInheritance_Class4 {
	static void addclass4() {
		System.out.println("This is class 4 method");
	}

}

class MultiLevelInheritance_Class3 extends MultiLevelInheritance_Class4 {
	static void addclass3() {
		System.out.println("This is class 3 method");
	}

}

class MultiLevelInheritance_Class2 extends MultiLevelInheritance_Class3 {
	static void addclass2() {
		System.out.println("This is class 2 method");
	}

}

public class MultiLevelInheritance_Class1 extends MultiLevelInheritance_Class2 {
	static void addclass1() {
		System.out.println("This is class 1 method");
	}

	public static void main(String[] args) {
		addclass1();
		addclass2();
		addclass3();
		addclass4();

	}

}
