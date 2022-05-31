import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        System.out.print("Hello, Matrix!");

        String nome = "Luks";
    //Como seria em Javascript: var nome = 'Luks' -> Não fazer isso no Java.

        int idade = 18;
    System.out.println(" Ola," + nome + ". Eu sei que você tem " + idade + " anos");
    // Utilizar sinal de adição e não a vírgula para concatenar os elementos.
    

    double dinheiro = 20.0;

    int umMaisum = 1 + 1;
    int oitoDivididoPorDois = 8 / 2;

    //System.out.println(umMaisum);
    //System.out.println(oitoDivididoPorDois);

    System.out.println("Informe a idade do seu cachorro em anos humanos: ");
    Scanner in = new Scanner(System.in);
    //Como seria em Javascript: var nome = prompt ('Olá. Me diga seu nome')

    int idadeCachorro = in.nextInt();
    //var nome = parseInt(prompt('Quantos anos você tem?'));

    idadeCachorro = idadeCachorro * 7;

    System.out.println("O seu cachorro tem " + idadeCachorro + " anos em anos de cachorro");
    }
}