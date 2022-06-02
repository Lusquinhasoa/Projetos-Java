import java.util.Scanner;

public class At13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double n1 = in.nextInt();
    
        System.out.println("Informe a segunda nota: ");
        double n2 = in.nextInt();

        System.out.println("Informe a terceira nota: ");
        double n3 = in.nextInt();
    
        System.out.println("Informe a quarta nota: ");
        double n4 = in.nextInt();

        double media = (n1+n2+n3+n4)/4;
        System.out.println("A média é " + media);

        if(media >= 6){
            System.out.println("PARABÉNS! Você foi aprovado");
        }
        
        in.close();
    }
}
