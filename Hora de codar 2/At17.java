import java.util.Scanner;

public class At17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a senha correta: " );
        int password = in.nextInt();

        if(password == 1234){
            System.out.println("ACESSO PERMITIDO");
        }
        else{
            System.out.println("ACESSO NEGADO");
        }
        in.close();
    }
}
