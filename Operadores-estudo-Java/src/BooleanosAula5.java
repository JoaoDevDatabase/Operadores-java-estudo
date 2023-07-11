public class BooleanosAula5 {
    public static void main(String[] args) {
        // temos aqui uma aplicação monstrando que temos o uso do if/else
        int a;
        int b;
        int c, d;

        a = 10;

        b = 5;

        c = 6;

        d = 6;

        if (a <= b) {
            System.out.printf("Este número não e maior que %d%n: ", b);
        } else {
            System.out.println(" Número maior ");
        }

        // aqui nos temos outra representação do uso de operador ternario
        // com os sinal (?) eu digo que e positivo, e o sinal ( : ) digo quando for
        // falso
        String resultado = c == d ? "verdadeiro" : "falso";
        String resultado1 = c >= d ? "resultado verdadeiro" : "resultado falso";
        int resultado2 = a == b ? 1 : 0;
        // o operador ternario nao se limita apenas em string's;

        System.out.println(resultado);
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
/*
 * ESTA APLICAÇÃO E PARA PODERMOS USAR O IF/ELSE PARA PODERMOS MOSTRAR QUAIS
 * VALORES SÃO MAIORES
 */