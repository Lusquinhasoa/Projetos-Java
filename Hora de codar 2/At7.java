import java.util.Scanner;

public class At7{

public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.println("Informe o 1° número ");
    int n1 = in.nextInt();

    System.out.println("Informe o 2° número ");
    int n2 = in.nextInt();

    System.out.println("Informe o 3° número ");
    int n3 = in.nextInt();
    
    System.out.println("Informe o 4° número ");
    int n4 = in.nextInt();

    if (n1 > n2 && n1 > n3 && n1 > n4) {

            System.out.println("Primeiro: " + n1 + " ultimo: " + n4 + " maior: " + n1);

    } else if (n2 > n1 && n2 > n3 && n2 > n4) {

            System.out.println("Primeiro: " + n1 + " ultimo: " + n4 + " maior: " + n2);

        } else if(n3> n1 && n3 > n2 && n3 > n4) {

            System.out.println("Primeiro: " + n1 + " ultimo: " + n4 + " maior: " + n3);

            } else {

            System.out.println("Primeiro: " + n1 + " ultimo: " + n4 + " maior: " + n4);

            }

    in.close();
}
}