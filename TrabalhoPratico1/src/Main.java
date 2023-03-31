import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idQuarto, diasQuarto; // Declarar variaveis
        String tipoQuarto;
        double receita = 0, custo = 0, lucro = 0, imposto;

        //Leitura de variaveis
        System.out.println("Bom dia! \nDiga-me qual é o numero do quarto que quer calcular!");
        idQuarto = input.nextInt();
        System.out.println("Quantos dias ficou o quarto reservado?");
        diasQuarto = input.nextInt();

        //Filtrar opçao invalida  do numero de dias reservados
        if (diasQuarto < 0 || diasQuarto > 365) {

            System.out.println("Erro! Numero de dias invalido! Recomece o programa! ");

        } else {
            System.out.println("Qual é o tipo de quarto? I – Individual, D – Duplo, T – Triplo, S – Suite ");
            tipoQuarto = input.next();
            if (tipoQuarto.equals("I") || tipoQuarto.equals("D") || tipoQuarto.equals("T") || tipoQuarto.equals("S")) {
                switch (tipoQuarto) { // Filtrar a opção do tipo de quarto
                    case "I":
                        //o Individual: +200€/dia reservado
                        // o Individual: -25€/dia reservado
                        receita = 200 * diasQuarto;
                        custo = 25 * diasQuarto;
                        lucro = receita - custo;
                        break;
                    case "D":
                        //o Duplo: + 250€/dia reservado
                        //o Duplo e Triplo: -30€/dia reservado
                        receita = 250 * diasQuarto;
                        custo = 30 * diasQuarto;
                        lucro = receita - custo;
                        break;

                    case "T":
                        //   o Triplo: +275€/dia reservado
                        //o Duplo e Triplo: -30€/dia reservado
                        receita = 275 * diasQuarto;
                        custo = 30 * diasQuarto;
                        lucro = receita - custo;
                        break;

                    case "S":
                        // o Suite: +350€/dia reservado
                        //o Suite: -50€/dia reservado
                        receita = 350 * diasQuarto;
                        custo = 50 * diasQuarto;
                        lucro = receita - custo;
                        break;

                }
                       /*• Descontos fiscais -> Ver valor em impsoto!
                o Inferior a 20.000€ inclusive: -23% (lucro)
                o Superior a 20.000€ e inferior a 50.000€ inclusive: -25% (lucro)
                o Superior a 50.000€: -28% (lucro)
             */

                if (lucro <= 20000) {
                    imposto = lucro * 0.23;
                } else if (lucro <= 50000) {
                    imposto = lucro * 0.25;
                } else {
                    imposto = lucro * 0.28;
                }

            /* Imprimir os resultados desejados
                o O valor ilíquido a receber pelas reservas totais.
                o Total do custo da limpeza.
                o Valor de descontos fiscais a entregar ao estado.
                o Valor líquido a receber pelo quarto.
           */

                System.out.println("\n O  Quarto - " + idQuarto + " - com tipologia - " + tipoQuarto + " - com numero de dias reservado de " + diasQuarto + " dias deu : ");
                System.out.println("\n - Valor iliquido a receber no total " + receita + "€");
                System.out.println(" - Custo da limpeza a pagar no total " + custo + "€");
                System.out.println(" - Valor imposto a pagar no total " + imposto + "€");
                System.out.println(" - Valor liquido a receber no total " + (lucro - imposto) + "€");
            } else {

                System.out.println("Erro! Opção de tipo de quarto invalida! Recomece o programa!");
            }
        }

    }
}