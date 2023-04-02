import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha um das opçoes abaixo:");
        System.out.println("1 - Area do Retangulo");
        System.out.println("2 - Area de uma circunferencia");
        System.out.println("3 - Area de um triangulo");
        int opcao = ler.nextInt(); //Aqui está lendo a opção da escolha acima.

        switch (opcao) {
            case 1:{
                System.out.println("Digite a Base do Retangulo");
                double base = ler.nextDouble();
                System.out.println("Digite a Altura do Retangulo");
                double altura = ler.nextDouble();
                double arearetangulo = (base * altura);
                System.out.println("O resultado da área do retangulo é:" + arearetangulo);
                break;
        }
            case 2: {
                System.out.println("Digite o raio da circunferência");
                double raio = ler.nextDouble();
                double area = Math.PI * Math.pow(raio, 2); // Em Java, a constante "Math.PI" representa o valor de π (PI)
                /*
                  Para calcular a área de uma circunferência em Java,
                  precisamos elevar o valor do raio ao quadrado,
                  o que é feito pela função "Math.pow(raio, 2)"
                */
                System.out.println("O valor de raio de circunferência é: " + area);
                break;
            }
            case 3:
                System.out.println("Digite a base do triangulo:");
                double basetriangulo = ler.nextDouble();
                System.out.println("Digite a altura do triangulo");
                double alturatriangulo = ler.nextDouble();
                double arearetangulo = basetriangulo * alturatriangulo;
                System.out.println("A base do triangulo é: " + arearetangulo);
                break;
        }


    }
}
