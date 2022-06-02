import java.util.Scanner;

public class At16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Valor das maçãs: R$0,30(menos que uma dúzia) \n e R$0,25 se comprar ao menos doze ");

        System.out.println("Digite a quantidade de maçãs desejadas: " );
        int macas = in.nextInt();

        if(macas<12){
            System.out.println("Valor total: R$" + macas * 0.30 + "0");
        }
        else{
            System.out.println("Valor total: R$" + macas * 0.25 + "0");
        }
        in.close();
    }
}
