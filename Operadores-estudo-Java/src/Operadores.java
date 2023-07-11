// vamos iniciar o nosso estudo sobre operadores!

// inicio de minha aplicação
public class Operadores {
    public static void main(String[] args) {

        int numero = 5;
        // numero = numero + 2;

        numero = numero + 2;
        numero++; // isto e uma representação um operador unário
        // ele soma o meu número +1

        int numero2 = 5;
        numero2 = -numero2;// aqui eu quis representar que o meu número ele e negativo
        numero2++;

        System.out.printf("O resultado e : %d%n", numero);
        System.out.printf("O resultado e : %d%n", -numero);// Aqui eu coloco um sinal de menos que
        // me mostra um valor negativo
        System.out.printf("O resultado e : %d%n", numero2);

    }
}
