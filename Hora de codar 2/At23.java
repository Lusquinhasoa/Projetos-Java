import java.util.Scanner;

public class At23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total = 20;

        int numero = 0;

        int maiorNum = 0;

        int menorNum = 0;

        for(int i = 0; i < total; i++){

            System.out.print("Informe um número: ");

            int nx = in.nextInt();

            if(i == 0){
			menorNum = nx;
            maiorNum = nx;
			}

            if(nx > maiorNum){
                maiorNum = nx;
                
            }
            if(nx < menorNum){
                menorNum = nx;
            }
        }
        System.out.println("O maior número informado é o: " + maiorNum + ", e o menor número informado é o: " + menorNum);

    }
}

