public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 6; i++) {

			for (int j = 2; j <= 7; j++)

				if (i == 2 && (j == 1 || j == 2)) {
					continue;
				}

				else if (i == 3 && (j == 1 || j == 2 || j == 3)) {
					continue;
				} else if (i == 4 && (j == 1 || j == 4 || j == 2 || j == 3)) {
					continue;
				} else if (i == 5
						&& (j == 1 || j == 4 || j == 2 || j == 3 || j == 5)) {
					continue;
				} else if (i == 6
						&& (j == 1 || j == 4 || j == 2 || j == 3 || j == 5 || j == 6)) {
					continue;
				} else {
					sum++;
					System.out.println(i + " " + j + " ");

				}
		}
		System.out.print("The number of possible combinations is:  " + sum);
		System.out.println();

	}

}
