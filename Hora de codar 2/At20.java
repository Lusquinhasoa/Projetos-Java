import java.util.Scanner;

public class At20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número de lados do seu polígono regular: ");
        int lados = in.nextInt();

        if(lados<3){
            System.out.println("NÃO É UM POLÍGONO");
                    }
             else if(lados>5){
                 System.out.println("POLÍGONO NÃO IDENTIFICADO");
                        }
                if(lados==3){
                System.out.println("Ele é um TRIÂNGULO");
                
                System.out.println("Digite o valor dos 3 lados: ");
                int p1 = in.nextInt();

                System.out.println("Digite o valor dos 3 lados: ");
                int p2= in.nextInt();
                
                System.out.println("Digite o valor dos 3 lados :");
                int p3 = in.nextInt();

                int p4 = (p1) + (p2) + (p3);
                System.out.println("O perímetro é igual a : " + p4 +"m");
                        }
                if(lados==4){
                    System.out.println("Ele é um QUADRADO");

                System.out.println("Digite o valor de um dos lados: ");
                int a = in.nextInt();

                System.out.println("A área é igual a : " + a * a + "cm²");
                    }

                if(lados==5){
                    System.out.println("Ele é um PENTÁGONO");
                        }
                in.close();
        }
    }

