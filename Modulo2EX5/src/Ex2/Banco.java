package Ex2;

import java.util.Scanner;

public class Banco {
    ContaCorrente conta1 =new ContaCorrente();
    ContaPoupança conta2 = new ContaPoupança();
    SeguroDeVida conta3 = new SeguroDeVida();
    Scanner ler = new Scanner(System.in);
    String nome;
    double saldo;

    public Banco(String nome,double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void resultadoFinal (){
        System.out.println("Nome: "+getNome());
        System.out.println("Saldo atual: "+getSaldo());

        System.out.println("Escolha qual a sua conta");
        System.out.println("Digite 1 ---- Conta Corrente");
        System.out.println("Digite 2 ---- Conta Poupança");
        System.out.println("Digite 3 ---- Conta com Seguro de vida");
        int nmr = ler.nextInt();

        if (nmr == 1){
            conta1.calcularTributo();
        }else if (nmr == 2) {
            conta2.calcularTributo();
        } else if (nmr == 3) {
            conta3.calcularTributo();
        } else {
            System.out.println("Opção inválida");
            return;
        }


    }

    public class ContaCorrente implements Tributáveis{

        @Override
        public double calcularTributo() {
          double calculo =  saldo * 0.01 ;
            System.out.println("Você tem $"+calculo);
          return calculo;
        }
    }
        public class ContaPoupança implements Tributáveis {
            @Override
            public double calcularTributo() {
                double calculo =  saldo * 0.0;
                System.out.println("Você tem $"+calculo);
                return calculo;

            }
        }
        public class SeguroDeVida implements Tributáveis {
            @Override
            public double calcularTributo() {
                double calculo =  saldo - 42;
                System.out.println("Você tem $"+calculo);
                return calculo;
            }
        }
    }
