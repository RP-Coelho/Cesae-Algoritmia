import java.util.Scanner;


public class Main {

    public static/* Ler um numero */ int ex00() {
        Scanner input = new Scanner(System.in);

        System.out.println("Diga-me um numero");
        return input.nextInt();
    }

    public static/* Ler comprimento de array */ int ex011() {
        Scanner input = new Scanner(System.in);
        System.out.println("Diga-me o comprimento de array");
        return input.nextInt();


    }

    public static/* colocar numeros no array */ int[] ex01() {
        Scanner input = new Scanner(System.in);

        int[] array = new int[ex011()];

        for (int i = 0; i < array.length; i++) {
            System.out.println("De-me o valor para indice " + i);

            array[i] = input.nextInt();
        }

        return array;

    }

    public static /* Ler frase  */ String ex02() {
        Scanner input = new Scanner(System.in);

        System.out.println("Diga-me uma palavra");
        return input.next();

    }

    public static/* ler e colocar numeros na Matriz*/ int[][] ex03() {
        Scanner input = new Scanner(System.in);

        int l = ex011();
        int c = ex011();
        int[][] matriz = new int[l][c];

        for (int x = 0; x < l; x++) {
            for (int y = 0; y < c; y++) {
                System.out.println("De-me o valor para matriz [" + x + "] e para [" + y + "] :");

                matriz[x][y] = input.nextInt();
            }
        }


        return matriz;
    }


    public static boolean  /* Par */ ex1(int num) {
        //1. Implemente uma função que determine se um número (passado por argumento) é par ou ímpar
        boolean cond;
        if (num % 2 == 0) {
            cond = true;

        } else {
            cond = false;
        }

        if (cond) {
            System.out.println("E par");
        } else {
            System.out.println("E impar");
        }
        return cond;
    }

    public static /* Positivo*/ boolean ex2(int num) {
        //2. Implemente uma função que determine se um número (passado por argumento) é positivo ou negativo
        boolean cond;

        if (num < 0) {
            cond = false;

        } else {
            cond = true;

        }

        if (cond) {
            System.out.println("É Positivo");
        } else {
            System.out.println("É Negativo");
        }

        return cond;
    }

    public static /* Primo*/ boolean ex3(int num) {
        //3. Implemente uma função que determine se um número (passado por argumento) é ou não primo.
        boolean cond;

        if (num == 2 || num == 3 || num == 5 || num == 7) {
            cond = true;

        } else if (num % 2 != 0) {
            if (num % 3 != 0) {
                if (num % 5 != 0) {
                    if (num % 7 != 0) {
                        cond = true;
                    } else {
                        cond = false;
                    }
                } else {
                    cond = false;
                }
            } else {
                cond = false;
            }
        } else {
            cond = false;
        }
        if (cond) {
            System.out.println("É Primo");
        } else {
            System.out.println("Não é Primo");
        }

        return cond;
    }

    public static /* Perfeito*/ boolean ex4(int num) {

        //4. (Opcional) Implemente uma função que determine se um número (passado por argumento) é perfeito
        //2(n−1)((2n)−1):
        // podiamos usar um array mas teriamos que inventar um length, o que nao seria muito errado porque os numeros sao exponencialmente maiores
        boolean cond;
        int res = 2;
        int formula = 0, res1;

        while (formula < num) {
            res1 = res;
            res *= 2;
            formula = (res1 * (res - 1));
        }

        if (formula == num) {
            cond = true;
        } else {
            cond = false;
        }

        if (cond) {
            System.out.println("É numero Perfeito");
        } else {
            System.out.println("Não é um numero Perfeito");
        }

        return cond;
    }

    public static /* Menu*/ void ex5() {
        Scanner input = new Scanner(System.in);
/*Implemente um programa que contenha uma função com menu de opções que permitam invocar as funções
desenvolvidas nos exercícios 1 a 3 (ou 4), devendo o número ser escolhido antes das opções do menu. */

        int op, i = 0;
        String p;
        do {
            do {
                System.out.println("\n1 - Função é par ou ímpar");
                System.out.println("2 - Função é positovo ou negativo");
                System.out.println("3 - Função é primo ou não");
                System.out.println("4 - Função é perfeito ou não");
                System.out.println("5 - Menor valor de um array");
                System.out.println("6 - Maior valor de um array");
                System.out.println("7 - O array esta crescente");
                System.out.println("8 - Imprime asteristicos");
                System.out.println("9 - Imprime array");
                System.out.println("10 - Função é palindromo");
                System.out.println("11 - Desenhar um quadrado");
                System.out.println("11 - Desenhar um quadrado");
                System.out.println("12 - Soma de matrizes");
                System.out.println("13 - Somatorio total de matrizes");
                System.out.println("15 - Sair do Programa");
                System.out.println("\n");
                System.out.println("Que opção deseja");
                op = input.nextInt();


            } while (op < 1 || op > 15);

            switch (op) {
                case 1:
                    ex1(ex00());
                    break;
                case 2:
                    ex2(ex00());
                    break;
                case 3:
                    ex3(ex00());
                    break;
                case 4:
                    ex4(ex00());
                    break;
                case 5:
                    ex7(ex01());
                    break;
                case 6:
                    ex6(ex01());
                    break;
                case 7:
                    ex8(ex01());
                    break;
                case 8: // bastava a ultima linha mas e para ficar mais "legivel"
                    // ex00();
                    // ex10(ex00());
                    ex101(ex10(ex00()));
                    break;
                case 9:
                    ex11(ex01());
                    break;
                case 10:
                    ex12(ex02());
                    break;
                case 11:
                    ex13();
                    break;
                case 12:
                    ex14();
                    break;
                case 13:
                    ex15(ex14());
                    break;
            }

            if (op != 15) {
                System.out.println("\nDeseja fazer outra operação?\n");
                p = input.next();
                if (p.equals("S")) {
                    op = 1;
                } else {
                    op = 5;
                }
            }
        } while (op != 15);

    }

    public static /* maior array*/ int ex6(int[] array) {
//6. Escreva uma função que recebe um array de inteiros como parâmetro e retorna o maior valor do array.

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("O valor mais alto do array é " + max);
        return max;
    }

    public static /* Menor array*/ int ex7(int[] array) {
//7. Escreva uma função que recebe um array de inteiros como parâmetro e retorna o menor valor do array.

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("O valor mais alto do array é " + min);
        return min;
    }

    public static /* Crescente array */ boolean ex8(int[] array) {
        //Escreva uma função que recebe um array de inteiros como parâmetro e retorna se o array está crescente.

        boolean trigger = true;

        for (int i = 1; i < array.length; i++) {

            if (array[i] < array[i - 1]) {
                trigger = false;
                break;
            }
        }

        if (trigger) {
            System.out.println("O Array está em ordem crescente!");
        } else {
            System.out.println("Não está em ordem crescente!");
        }
        return trigger;
    }

    public static /* ciclo valor inteiro */ int ex10(int num) {
        /* 10. Escreva uma função que leia um valor inteiro positivo (deve solicitar números até que seja inteiro e positivo) */


        while (!ex2(num)) {
            System.out.println("Erro! Numero tem que ser positivo");
            num = ex00();
        }

        return num;
    }

    public static /* asteristicos */ void ex101(int num) {
        /* e crie uma função que imprima numa linha um número de asteriscos igual ao valor inserido pelo utilizador.*/

        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }

    }

    public static /* imprimir conteudo array */ void ex11(int[] array) { // leia conjunto e armazena num array//
 /*Teste a função no âmbito de um programa que pergunte ao utilizador quantos números a ler
e imprima o conteúdo do array.*/

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }


    }


    public static /* Ver palindromo */ boolean ex12(String ex02) {
        /*retorna verdadeiro se a string é um palíndromo (ou seja, pode ser lida da mesma forma de trás para frente) e falso caso contrário*/
        boolean cond;
        int trigger = 0;
//string = string ao contrario
        int x = ex02.length() - 1;

        for (int i = 0; i < ex02.length(); i++) {

            if (ex02.charAt(i) != ex02.charAt(x)) {
                trigger++;

            }
            x--;

        }

        if (trigger == 0) {
            System.out.println("é um palindromo");
            cond = true;
        } else {
            System.out.println("Não é um palindromo");
            cond = false;
        }
        return cond;
    }

    public static/* Ler Quadrado */ String[][] ex13() {

 /*13. Escreva um programa para desenhar um quadrado no ecrã. Esse quadrado deverá ser desenhado por uma função
para a qual são passados três argumentos: caracter a utilizar, número de linhas e número de colunas. Segue-se
um exemplo do algoritmo a ser executado, ilustrando o pretendido:
Introduza um caracter: z
Introduza o número de linhas: 4
Introduza o número de colunas: 6
*/

        int l = ex011();
        int c = ex011();
        String caracter = ex02();
        String[][] ex13 = new String[l][c];

        for (int x = 0; x < l; x++) {
            for (int y = 0; y < c; y++) {
                if (x == 0 || y == 0 || x == (l - 1) || y == (c - 1)) {
                    ex13[x][y] = caracter;
                    System.out.print(ex13[x][y]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        return ex13;
    }

  /*  public static/* Ler uma letra numa string e somar  String[][] ex15(){
    String palavra=ex02();


    }
    */

    /* 5. Escreva uma função que recebe uma string como parâmetro e retorna o número de ocorrências da letra 'a'
(minúscula) na string*/

    public static/* Somar numero  matriz */ int[][] ex14() {
    /*Implemente funções que, dadas 2 matrizes de inteiros com a mesma dimensão bem como a sua dimensão,
apresente (numa função) em forma de matriz o resultado da soma das 2 matrizes e (noutra função) o somatório
dos seus elementos*/
        int[][] matriz1 = ex03();
        int[][] matriz2 = ex03();
        int[][] matriz3 = new int[matriz1.length][matriz2[0].length];


        for (int x = 0; x < matriz3.length; x++) {
            for (int y = 0; y < matriz3[0].length; y++) {

                matriz3[x][y] = matriz1[x][y] + matriz2[x][y];
                System.out.println("A soma das duas matrizes é no array[" + x + "][" + y + "] é de " + matriz3[x][y]);
            }
        }

        return matriz3;

    }

    public static/* Somar numero  matriz */ int ex15(int[][] matriz3) {
    /*Implemente funções que, dadas 2 matrizes de inteiros com a mesma dimensão bem como a sua dimensão,
apresente (numa função) em forma de matriz o resultado da soma das 2 matrizes e (noutra função) o somatório
dos seus elementos*/
        int soma = 0;

        for (int x = 0; x < matriz3.length; x++) {
            for (int y = 0; y < matriz3[0].length; y++) {

                soma += matriz3[x][y];

            }
        }
        System.out.println("A soma das duas matrizes é " + soma);
        return soma;

    }

    public static /* Main */ void main(String[] args) {

        ex5();

    }
}