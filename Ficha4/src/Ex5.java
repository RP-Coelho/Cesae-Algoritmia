import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String opcao, cargo = "S" , op;
        int id=0, dias=0;
        double vb=0, irs=0, ss=0, tsu=0, sal=0;

        do {


            System.out.println("Qual o seu Id de Funcionario");
            id = input.nextInt();
            System.out.println("Deseja continuar? S ou N");
            op = input.next();
            if (op.equals("S")) {
                System.out.println("Qual o seu cargo");
                cargo = input.next();
                System.out.println("Deseja continuar? S ou N");
                op = input.next();
            }
            if (op.equals("S")) {
                System.out.println("Quantos dias trabalhou");
                dias = input.nextInt();
                System.out.println("Deseja continuar? S ou N");
                op = input.next();

            } else {
                op = "N";
            }

            switch (cargo) {
                case "E":
                    if (dias > 20) {
                        vb = 40 * dias * 0.05;
                    } else if (dias > 17) {
                        vb = 40 * dias * 0.02;
                    } else {
                        vb = 40 * dias;

                    }
                    sal = 5 * dias;
                    if (vb >= 2500) {
                        irs = vb * 0.3;
                    } else if (vb > 1000) {
                        irs = vb * 0.2;
                    } else {
                        irs = vb * 0.1;
                    }
                    tsu = vb * 0.2375;
                    ss = vb * 0.11;
                    break;
                case "C":
                    if (dias > 20) {
                        vb = 60 * dias * 0.05;
                    } else if (dias > 17) {
                        vb = 60 * dias * 0.02;
                    } else {
                        vb = 60 * dias;

                    }
                    sal = 7.5 * dias;
                    if (vb >= 2500) {
                        irs = vb * 0.3;
                    } else if (vb > 1000) {
                        irs = vb * 0.2;
                    } else {
                        irs = vb * 0.1;
                    }
                    tsu = vb * 0.2375;
                    ss = vb * 0.11;

                    break;

                case "A":
                    if (dias > 20) {
                        vb = 80 * dias * 0.05;
                    } else if (dias > 17) {
                        vb = 80 * dias * 0.02;
                    } else {
                        vb = 80 * dias;

                    }
                    sal = 7.5 * dias;
                    if (vb >= 2500) {
                        irs = vb * 0.3;
                    } else if (vb > 1000) {
                        irs = vb * 0.2;
                    } else {
                        irs = vb * 0.1;
                    }
                    tsu = vb * 0.21;
                    ss = vb * 0.09;

                    break;
            }

            System.out.println("O balor liquido é " + vb + "€");
            System.out.println("O subsidio alimentação é " + sal + "€");
            System.out.println("O valor do IRS é "+irs+"€");
            System.out.println("O valor a entregar a segurança social é " + (ss+tsu) + "€");
            System.out.println("O valor liquido a receber pelo funcionario " +(vb+sal-ss-irs)+ "€");
            System.out.println("O valor do encargo total será de " +(vb+sal+tsu)+"€" );


            System.out.println("Deseja Calcular outro? S ou N");
            op = input.next();

        } while (!op.equals("N"));


    }
}

