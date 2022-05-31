import java.util.Scanner;

public class Paralelogramo{

public static void main(String[]args){

    Scanner in = new Scanner(System.in);
    System.out.println("Informe o valor da base do Paralelogramo : ");
    int n1 = in.nextInt();

    System.out.println("Informe o valor da altura do Paralelogramo ");
    int n2 = in.nextInt();
     
    int area = (n1 * n2);
    System.out.println("A área do Paralelogramo é : " + area);
    in.close();

}
}