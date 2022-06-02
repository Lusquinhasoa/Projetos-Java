import java.util.Scanner;

public class At19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a quantidade de gols do Grêmio: ");
        int gre = in.nextInt();

        System.out.println("Digite a quantidade de gols do Inter: ");
        int inter = in.nextInt();

        if(gre==inter){
            System.out.println("EMPATE ! QUE JOGO EMOCIONANTE. ");
        }
       else{
           if(gre>inter){
               System.out.println("O vencedor foi... GRÊMIO !!");
        }
        if(inter>gre){
            System.out.println("O vencedor foi... INTER ");
        }
        in.close();
    }
}
}
