import java.util.Scanner;

public class At18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual seu gênero? : \n (1 - Feminino; 2 - Masculino)");
        int gen = in.nextInt();

        System.out.println("Qual a sua altura? : ");
        double h = in.nextDouble();


        if(gen == 1){
            System.out.println("Seu peso ideal é: " + ((72.7 * h) - 58));
        }
        else{
            System.out.println("Seu peso ideal é: " + ((62.1 * h) - 44.7));
        }
        in.close();
    }
}
