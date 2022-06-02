import java.util.Scanner;

public class At8{

public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.println("Informe 10 números ");
    int n1 = Integer.parseInt("0");

    for (int i = 0; i<10;i++){
        System.out.println("Informe o " + (i+1) + " ° número");
        n1 += in.nextInt();
    }
    System.out.println("A soma é : " + (n1));
    in.close();
}
}