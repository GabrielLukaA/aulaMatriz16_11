
import java.util.Scanner;
public class questão1 {

	public static void main(String[]args) {
	
		Scanner in = new Scanner(System.in);
		
		int arr[][] = new int[5][3];
		int somas[] = new int [3];
		
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 3; j++) {


				System.out.println("Digite o valor da posição linha : " + i + " coluna: " + j);
				arr[i][j] = in.nextInt();
			}
		}
		for (int j=0;j<3;j++) {
		for (int c= 0;c<5;c++) {

		somas[j] += arr[c][j];
		}
	}
		for (int j=0;j<3;j++) {
			for (int c=0; c<5;c++) {
				arr[c][j]=somas[j]*arr[c][j];
			}
		}
		for (int c=0;c<3;c++) {
			System.out.println(somas[c]);
		}
		
		for (int c = 0; c < 5; c++){

			for (int j = 0; j < 3; j++) {

				System.out.println("O valor da posição coluna : " + j + " linha: " + c+" é : "+arr[c][j]);

			}
		}

				
				
				
				
				
	}
}
