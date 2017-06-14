import java.awt.print.PrinterGraphics;
import java.util.Scanner;

public class minPath {
	static int a[][] = new int[10][10];
	static boolean[] fina = new boolean[10];
	static int d[] = new int[10];
	static int count = 0;
	static boolean[][] q = new boolean[10][10];

	public static void main(String[] args) {
		int v;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				a[i][j] = 9999999;
			}
		}
		// System.out.println(a[1][1]);
		while (input.hasNext()) {
			count++;
			int n = input.nextInt();
			if (n == 1) {
				System.out.println("请输入三个数");
				int c = input.nextInt();
				int b = input.nextInt();
				int wi = input.nextInt();
				a[c][b] = wi;
			//	System.out.println(count);
				/**
				 * 先把和０相连的顶点 赋值
				 */
				for (v = 0; v < count; v++) {
					fina[v] = false;
					d[v] = a[0][v];
				}
				// for(int w = 0;w < count + 1; w++)q[v][w]=false;
				// if(d[v]<999999){
				// q[v][0] = true; q[v][v] = true;
				// }
				d[0] = 0;
				fina[0] = true;
				for (int i = 1; i < count; i++) {
					int min = 999999;
					for (int w = 0; w < count; w++) {
						if (!fina[w]) {
							if (d[w] < min) {
								v = w;
								min = d[w];
							}
						}
					}
					fina[v] = true;
					for (int w = 0; w < count; w++) {
						if (!fina[w] && (min + a[v][w] < d[w])) {
							d[w] = min + a[v][w];
							// q[w] = q[v];
							// q[w][w] = true;
						}
					}
				}
			} else {
				System.out.println("请输入一个数");
				int z = input.nextInt();
				System.out.println(d[z]);
			}
		}
	}
}
