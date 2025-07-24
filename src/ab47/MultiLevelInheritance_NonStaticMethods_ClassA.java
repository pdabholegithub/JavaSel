package ab47;

class MultiLevelInheritance_ClassD {
	void addclass4() {
		System.out.println("This is class D method");
	}

}

class MultiLevelInheritance_ClassC extends MultiLevelInheritance_ClassD {
	void addclass3() {
		System.out.println("This is class C method");
	}

}

class MultiLevelInheritance_ClassB extends MultiLevelInheritance_ClassC {
	void addclass2() {
		System.out.println("This is class B method");
	}

}

public class MultiLevelInheritance_NonStaticMethods_ClassA extends MultiLevelInheritance_ClassB {
	void addclassA() {
		System.out.println("This is class A method");
	}

	public static void main(String[] args) {
		MultiLevelInheritance_NonStaticMethods_ClassA ca = new MultiLevelInheritance_NonStaticMethods_ClassA();

		ca.addclassA();
		ca.addclass2();
		ca.addclass3();
		ca.addclass4();

	}

}
