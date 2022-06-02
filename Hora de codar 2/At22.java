import java.util.Scanner;

public class At22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            System.out.println("Loja Remi du Fromage: cada capacete artesanal para tartaruga custa R$18.230 e pode ser pago em até 15 vezes sem juros.");

        System.out.println("Informe o número de parcelas desejadas: ");
        double parc = in.nextDouble();

        if(parc > 15){
            System.out.println("Desculpe, mas não é possível parcelar");
        }   
        else{
            System.out.println("O valor de cada parcela ficará: " + 18.230 / parc);
        }
        in.close();
    }
}

