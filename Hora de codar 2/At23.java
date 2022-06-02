import java.util.Scanner;

public class At23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe 20 números ");
        double num1 = Integer.parseInt("0");
    
        for (int i = 0; i<20;i++){
            System.out.println("Informe o " + (i+1) + " ° número");
            num1 += in.nextDouble();
        }

        
        System.out.println("O maior número é: " + (num1));

        in.close();
    }
}

