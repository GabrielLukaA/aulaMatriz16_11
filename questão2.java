import java.util.Scanner;

public class questão2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int matrizA[][] = new int[4][4];
		int matrizB[][] = new int[4][4];
		int matrizC[][] = new int[4][4];

		System.out.println("\nMatriz A\n");
		for (int l = 0; l < 4; l++) {

			for (int c = 0; c < 4; c++) {
				System.out.println("Digite o valor da posição linha : " + l + " coluna: " + c);
				matrizA[l][c] = in.nextInt();
			}
		}
System.out.println("\nAgora a MatriZ B\n");
		for (int l = 0; l < 4; l++) {

			for (int c = 0; c < 4; c++) {
				System.out.println("Digite o valor da posição linha : " + l + " coluna: " + c);
				matrizB[l][c] = in.nextInt();
			}
		}
		
		for (int l = 0; l < 4; l++) {

			for (int c = 0; c < 4; c++) {
				if (matrizA[l][c]>matrizB[l][c]) {
					matrizC[l][c]=matrizA[l][c];
				} else  {
					matrizC[l][c]=matrizB[l][c];
				}
			}
		}
		
		System.out.println("\nA matriz C é: \n");
		for (int c = 0; c < 4; c++){

			for (int j = 0; j < 4; j++) {

				System.out.println("O valor da posição coluna : " + j + " linha: " + c+" é : "+matrizC[c][j]);

			}
		}
	}
}
