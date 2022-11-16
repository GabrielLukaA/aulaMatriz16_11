import java.util.Scanner;

public class matriz {
	public static void main(String[] agrs) {

		Scanner in = new Scanner(System.in);

		// int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };
		int arr[][] = new int[3][3];

		for (int i = 0; i < 3; i++)
		{

			for (int j = 0; j < 3; j++) {
				// System.out.print(arr[i][j] + " ");

				System.out.println("Digite o valor da posição linha : " + i + " coluna: " + j);
				arr[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < 3; i++)
		{

			for (int j = 0; j < 3; j++) {
				// System.out.print(arr[i][j] + " ");

				System.out.println("O valor da posição linha : " + i + " coluna: " + j+" é : "+arr[i][j]);

			}
		}
	}

}
