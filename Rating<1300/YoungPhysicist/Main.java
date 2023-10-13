import java.util.Scanner;

class Main {
	static void solver(int array[], int count) {
		int matriz[][] = new int[count / 3][3];
		int x = 0;
		int y = 0;
		for (int num : array) {
			if (y < count / 3) {
				if (x < count) {
					matriz[y][x] = num;
					x++;
				}
				y++;
			}
		}
		x = 0;
		y = 0;
		int calc[] = new int[3];
		while (x < 3) {
			while (y < count) {
				calc[x] += matriz[y][x];
				y++;
			}
			y = 0;
			x++;
		}
		if (calc[0] == 0 && calc[1] == 0 && calc[2] == 0)
			System.out.printf("YES");
		else
			System.out.printf("NO");
	}
	static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		int count = data.nextInt();
		int vectors[] = new int[count];
		for (int i = 0; i < count; i++)
			vectors[i] = data.nextInt();
		solver(vectors, count);
	}
}
