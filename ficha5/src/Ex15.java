import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int id, x = 12, i = 0;
        double irst = 0, vbt = 0, vlt = 0, salt = 0, encargost = 0;
        int[] y = new int[x];
        double[] encargos = new double[x], vb = new double[x], sst = new double[x], sal = new double[x], irs = new double[x], ss = new double[x], tsu = new double[x], vl = new double[x];
        String rsp = "N", nome, cargo;

        do {
            do {
                System.out.println("Tenha a mao a seguinte informação");
                System.out.println("O seu codigo de Funcionario");
                System.out.println("O seu nome de Funcionario");
                System.out.println("O seu cargo de Funcionario");
                System.out.println("Quantos meses trabalhou");
                System.out.println("Quantos dias trabalhou");
                System.out.println("");
                System.out.println("");

            } while (!rsp.equals("N"));

            do {
                System.out.println("Qual o seu codigo de Funcionario");
                id = input.nextInt();
                System.out.println("Deseja refazer?");
                rsp = input.next();

            } while (!rsp.equals("N"));// So deixa avançar se for valido!


            do {
                System.out.println("Qual o seu nome de Funcionario");
                nome = input.next();
                System.out.println("Deseja refazer?");
                rsp = input.next();
            } while (!rsp.equals("N"));

            do {
                System.out.println("Qual o seu cargo de Funcionario");
                cargo = input.next();
                if (cargo.equals("C") || cargo.equals("E") || cargo.equals("A")) {
                    System.out.println("Deseja Refazer?");
                    rsp = input.next();
                } else {
                    System.out.println("Cargo Invalido! Tente de novo!");
                    rsp = "S";
                }

            } while (!rsp.equals("N")); // So deixa avançar se for valido!


            do {
                System.out.println("Quantos meses trabalhou");
                x = input.nextInt();
                if (x < 0 || x > 13) {
                    System.out.println("Erro repita! de novo!");
                    rsp = "S";
                } else {
                    System.out.println("Deseja refazer?");
                    rsp = input.next();
                }

            } while (!rsp.equals("N"));

            do {
                for (i = 0; i < x; i++) {
                    System.out.println("Quantos dias trabalhou no mes " + (i + 1));
                    y[i] = input.nextInt();
                    if (y[i] > 31 || y[i] < 0) {
                        System.out.println("Numero dias errado");
                        i = i - 1;
                    }
                }
                System.out.println("Deseja refazer?");
                rsp = input.next();
            } while (!rsp.equals("N"));

            switch (cargo) {
                case "E":
                    for (i = 0; i < x; i++) {
                        if (y[i] < 17) {
                            vb[i] = y[i] * 40;

                        } else if (y[i] < 20) {
                            vb[i] = y[i] * 40 * 1.02;
                        } else {
                            vb[i] = y[i] * 40 * 1.05;
                        }
                        vbt = vbt + vb[i];
                        sal[i] = y[i] * 5;
                        salt = sal[i] + salt;
                        if (vb[i] < 1000) {
                            irs[i] = vb[i] * 0.1;
                        } else if (vb[i] < 2500) {
                            irs[i] = vb[i] * 0.2;
                        } else {
                            irs[i] = vb[i] * 0.3;
                        }
                        irst = irst + irs[i];
                        ss[i] = vb[i] * 0.11;
                        tsu[i] = vb[i] * 0.2375;

                        sst[i] = ss[i] + tsu[i];
                        vl[i] = vb[i] - ss[i] - irs[i];
                        vlt = vl[i] + vlt;
                        encargos[i] = vb[i] + sal[i] + sst[i];
                        encargost = encargost + encargos[i];
                    }


                    break;
                case "C":
                    for (i = 0; i < x; i++) {
                        if (y[i] < 17) {
                            vb[i] = y[i] * 60;

                        } else if (y[i] < 20) {
                            vb[i] = y[i] * 60 * 1.02;
                        } else {
                            vb[i] = y[i] * 60 * 1.05;
                        }
                        vbt = vbt + vb[i];
                        sal[i] = y[i] * 7.5;
                        salt = sal[i] + salt;
                        if (vb[i] < 1000) {
                            irs[i] = vb[i] * 0.1;
                        } else if (vb[i] < 2500) {
                            irs[i] = vb[i] * 0.2;
                        } else {
                            irs[i] = vb[i] * 0.3;
                        }
                        irst = irst + irs[i];
                        ss[i] = vb[i] * 0.11;
                        tsu[i] = vb[i] * 0.2375;

                        sst[i] = ss[i] + tsu[i];
                        vl[i] = vb[i] - ss[i] - irs[i];
                        vlt = vl[i] + vlt;
                        encargos[i] = vb[i] + sal[i] + sst[i];
                        encargost = encargost + encargos[i];
                    }
                    break;

                case "A":
                    for (i = 0; i < x; i++) {
                        if (y[i] < 17) {
                            vb[i] = y[i] * 80;

                        } else if (y[i] < 20) {
                            vb[i] = y[i] * 80 * 1.02;
                        } else {
                            vb[i] = y[i] * 80 * 1.05;
                        }
                        vbt = vbt + vb[i];
                        sal[i] = y[i] * 7.5;
                        salt = sal[i] + salt;
                        if (vb[i] < 1000) {
                            irs[i] = vb[i] * 0.1;
                        } else if (vb[i] < 2500) {
                            irs[i] = vb[i] * 0.2;
                        } else {
                            irs[i] = vb[i] * 0.3;
                        }
                        irst = irst + irs[i];
                        ss[i] = vb[i] * 0.09;
                        tsu[i] = vb[i] * 0.21;

                        sst[i] = ss[i] + tsu[i];
                        vl[i] = vb[i] - ss[i] - irs[i];
                        vlt = vl[i] + vlt;
                        encargos[i] = vb[i] + sal[i] + sst[i];
                        encargost = encargost + encargos[i];
                    }
                    break;

            }
            for (i = 0; i < x; i++) {
                System.out.println("O valor liquido mensal dos funcionarios foi no mes " + i + " de " + vl[i] + "€");
                System.out.println("O valor pago total mensal dos funcionarios foi no mes " + i + " de " + sst[i] + "€");
            }

            System.out.println("\n\nO valor liquido total do funcionario foi  " + vlt + "€");
            System.out.println("O valor liquido total do funcionario foi  " + encargost + "€\n\n");


            System.out.println("Deseja calcula outra função?");
            rsp = input.next();
        } while (!rsp.equals("S"));

    }
}

