import java.util.Scanner;

class Main {
	static void solver(int array[], int count) {
		int matriz[][] = new int[count][3];
		int x = 0;
		int y = 0;
		System.out.printf("\nCheck solver function parameter array[]\n");
		for (int num : array) {
			System.out.printf("%d ", num);
			if (y < 3) {
				matriz[x][y] = num;
				y++;
			}
			else {
				y = 0;
				x++;
				matriz[x][y] = num;
				y++;
			}
		}
		int cx = 0;
		int cy = 0;
		System.out.printf("\n\nMatrix:\n");
		while (cx < count) {
			while (cy < 3) {
				System.out.printf("%d",matriz[cx][cy]);
				cy++;
			}
			System.out.printf("\n");
			cy = 0;
			cx++;	
		}
		x = 0;
		y = 0;
		int calc[] = new int[3];
		System.out.printf("\nCalc array:\n");
		while (x < 3) {
			while (y < count) {
				calc[x] += matriz[y][x];
				System.out.printf("Sum of the vector %d for the (%d) time = %d\n", x, y, calc[x]);
				y++;
			}
			y = 0;
			x++;
		}
		// Prints the output based on the sum of the vectors on xyz
		if (calc[0] == 0 && calc[1] == 0 && calc[2] == 0)
			System.out.printf("\nYES");
		else
			System.out.printf("\nNO");
	}
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		System.out.printf("\n### START OF INPUTS ###\n");
		int count = data.nextInt();
		int vectors[] = new int[count * 3];
		for (int i = 0; i < count * 3; i++)
			vectors[i] = data.nextInt();
		System.out.printf("### END OF INPUTS ###\n");
		solver(vectors, count);
	}
}
