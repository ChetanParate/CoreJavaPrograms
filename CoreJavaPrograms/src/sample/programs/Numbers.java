package sample.programs;

class Numbers {
	public static void main(String[] args) {
		int i = 0;
		int num = 0;
		String number = "";

		for (i = 1; i <= 10; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				number = number + i + " ";
			}
		}
		System.out.println("numbers are :" + number);
	}
}