package ab47;

public class ArrayValue_Available {

	public static void main(String[] args) {
		int student[] = new int[4];
		student[0] = 74;
		student[1] = 99;
		student[2] = 11;
		student[3] = 38;
		int notocheck = 38;

		for (int i = 0; i < 4; i++) {
			if (notocheck == student[i]) {
				System.out.println(notocheck + " is a part of array at index position " + i);
			}

		}

	}

}
