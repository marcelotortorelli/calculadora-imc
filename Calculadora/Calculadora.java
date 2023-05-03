package Calculadora;

import java.util.Scanner;
import java.util.Locale;
import java.lang.Double;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("CALCULADORA E CALCULO DE IMC");

        int opcao;
        do {
            System.out.println("|   1 - SOMAR           |");
            System.out.println("|   2 - SUBTRAIR        |");
            System.out.println("|   3 - MULTIPLICAR     |");
            System.out.println("|   4 - DIVIDIR         |");
            System.out.println("|   5 - CALCULAR IMC    |");
            System.out.print("Qual operação deseja efetuar? (0 para sair):");

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            processar(opcao);
        } while (opcao != 0);


    }

    public static void processar(int opcao) {
        Scanner scanner = new
                Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);


        switch (opcao) {

            case 0: {
                System.out.println("Sair!");
                break;
            }
            default:
                System.out.println("Ops, opção inválida :/");
                break;
            case 1: {
                System.out.println("SOMAR!");

                System.out.print("Digite o primeiro número:");
                Integer numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número:");
                Integer numero2 = scanner.nextInt();

                Integer soma = numero1 + numero2;
                System.out.println("O resultado é:" + soma);
                break;
            }
            case 2: {

                System.out.println("SUBTRAIR!");
                System.out.print("Digite o primeiro número:");
                Integer numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número:");
                Integer numero2 = scanner.nextInt();

                Integer subtracao = numero1 - numero2;
                System.out.println("O resultado é:" + subtracao);
                break;
            }
            case 3: {

                System.out.println("MULTIPLICAR!");
                System.out.print("Digite o primeiro número:");
                Integer numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número:");
                Integer numero2 = scanner.nextInt();

                Integer multiplicacao = numero1 * numero2;
                System.out.println("O resultado é:" + multiplicacao);
                break;
            }

            case 4: {

                System.out.println("DIVIDIR!");
                System.out.print("Digite o primeiro número:");
                Double numero1 = Double.valueOf(scanner.nextInt());

                System.out.print("Digite o segundo número:");
                Double numero2 = Double.valueOf(scanner.nextInt());


                if (numero2 == 0) {
                    System.out.println("Não é possível dividir por zero :(");
                } else {
                    Double divisao = numero1 / numero2;
                    System.out.println("O resultado é:" + divisao);
                }
            }
            break;
            case 5: {
                System.out.println("INDICE DE MASSA CORPOREA!");
                System.out.print("Digite o seu peso:");
                float peso1 = scanner.nextFloat();

                System.out.print("Digite a sua altura: (exemplo: 1.83)");
                float altura = scanner.nextFloat();

                float imc = peso1 / (altura * altura);
                System.out.println("Seu IMC é:" + imc);

                if (imc <= 18.5) {
                    System.out.println("Você está abaixo do peso!");
                }

                if (imc >= 18.6 && imc <= 24.9) {
                    System.out.println("Você está dentro do seu peso ideal :D");
                }

                if (imc >= 25.0 && imc <= 29.9) {
                    System.out.println("Você está acima do peso! x.x");
                }

                if (imc >= 30.0 && imc <= 34.9) {
                    System.out.println("Cuidado! Você está em obesidade grau I!");
                }

                if (imc >= 35.0 && imc <= 39.9) {
                    System.out.println("Cuidado!! Você está em obesidade grau II!");
                }

                if (imc >= 40.0 && imc >= 40.0) {
                    System.out.println("Cuidado!!! Você está em obesidade grau III");
                }
                }
                break;
            }


        }
    }

