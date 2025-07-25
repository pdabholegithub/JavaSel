package ab47;

class MultiLevelInheritance_ClassD {
	void addclassD() {
		System.out.println("This is class D method");
	}

}

class MultiLevelInheritance_ClassC extends MultiLevelInheritance_ClassD {
	void addclassC() {
		System.out.println("This is class C method");
	}

}

class MultiLevelInheritance_ClassB extends MultiLevelInheritance_ClassC {
	void addclassB() {
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
		ca.addclassB();
		ca.addclassC();
		ca.addclassD();

	}

}
