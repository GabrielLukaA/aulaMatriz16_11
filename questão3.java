import java.util.Scanner;

public class questão3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int matriz[][] = new int[5][5];
		int numeroBusca, w=0;
		
		for (int l = 0; l < 5; l++) {

			for (int c = 0; c < 5; c++) {
				System.out.println("Digite o valor da posição linha : " + l + " coluna: " + c);
				matriz[l][c] = in.nextInt();
			}
		}
		
		System.out.println("\nQue valor você deseja encontrar?\n");
		numeroBusca= in.nextInt();
		
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 5; c++) {
				
				if (numeroBusca==matriz[l][c]) {
					System.out.println("O valor "+numeroBusca+" pode ser encontrado na linha: "+l+" coluna: "+c);
				} else {}
				
			}
		}
				if (w==0) {
			System.out.println("Valor não encontrado.");
		}
	}
}
