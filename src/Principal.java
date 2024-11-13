import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lampada lampada = new Lampada();

        System.out.println(">>> INÍCIO DO SOFTWARE DA LÂMPADA <<<\n");

        System.out.print("Digite a cor: ");
        lampada.setCor(scanner.nextLine());

        System.out.print("Digite a marca: ");
        lampada.setMarca(scanner.nextLine());

        System.out.print("Digite a modelo: ");
        lampada.setModelo(scanner.nextLine());

        System.out.print("Digite a Watts: ");
        lampada.setVoltagem(Double.parseDouble(scanner.nextLine()));

        System.out.print("Tipo: ");
        lampada.setTipo(scanner.nextLine());

        System.out.print("Garantia: ");
        lampada.setGarantia(scanner.nextLine());

        System.out.print("Preço: ");
        lampada.setPreco(Double.parseDouble(scanner.nextLine()));

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Ligar lâmpada");
            System.out.println("2. Desligar lâmpada");
            System.out.println("3. Mostrar Status");
            System.out.println("0. Sair do programa");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
            case 1:
                lampada.metodoLigar();
                break;
            case 2:
                lampada.metodoDesligar();
                break;
            case 3:
                lampada.mostrarDados();
                break;
            case 0:
                System.out.println("*** Você encerrou o software. ***");
            }
        }while (opcao != 0);
    }
}