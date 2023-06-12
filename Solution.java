import java.util.Scanner;

//Change to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int x = fs.nextInt(), y = fs.nextInt(), z = fs.nextInt();
			int boxesNeed = y / z;
			if (y % z != 0) {
				boxesNeed++;
			}
			System.out.println(x * boxesNeed);
		}
		fs.close();
	}
}
