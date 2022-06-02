import java.util.Scanner;

public class At15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento : " );
        int ano = in.nextInt();

        int voto = 2022 - ano;

        if(voto>17){
            System.out.println("Você já pode votar");
        }
        else{
            System.out.println("Você não poderá votar este ano.");
        }
        in.close();
    }
}
