package Ex1;

import java.util.Scanner;

public class FabricaLampada {
    Scanner ler = new Scanner(System.in);
    Florescente lampada1 = new Florescente();
    Incandescente lampada2 = new Incandescente();
    public void construir(){
        System.out.println("Qual lampâda você quer escolher?");
        System.out.println("Digite 1 --- Florescente");
        System.out.println("Digite 2 --- Incandescente");
        int nmr = ler.nextInt();

        if (nmr == 1) {
            System.out.println("Você escolheu a lampada "+lampada1.Florescente);
            lampada1.body1();
        }else if (nmr == 2) {
            System.out.println("Você escolheu a lampada "+lampada2.Incandescente);
            lampada2.body2();
        }else {
            System.out.println("Opção inválida");
            return;
        }
    }




    public class Florescente implements Lampada {
        String Florescente;
        public Florescente() {
            this.Florescente = "Florescente";
        }

        @Override
        public void ligar() {
            System.out.println("A lampada Florescente está ligada");
        }

        @Override
        public void desligar() {
            System.out.println("A lampada Florescente está desligada");
        }
        public void body1(){
            System.out.println("Deseja ligar ou desligar");
            String opcao = ler.next();
            if (opcao.equals("ligar")){
                ligar();
            } else if (opcao.equals("desligar")) {
                desligar();
            } else {
                System.out.println("Opção inválida");
            }
    }
}





    public class Incandescente implements Lampada {
        String Incandescente;
        public Incandescente() {
            this.Incandescente = "Incandescente";
        }
        @Override
        public void ligar() {
            System.out.println("A lampada Incandescente está ligada");
        }

        @Override
        public void desligar() {
            System.out.println("A lampada Incandescente está desligada");
        }

        public void body2(){
            System.out.println("Deseja ligar ou desligar");
            String opcao = ler.next();
            if (opcao.equals("ligar")){
                ligar();
            } else if (opcao.equals("desligar")) {
                desligar();
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
