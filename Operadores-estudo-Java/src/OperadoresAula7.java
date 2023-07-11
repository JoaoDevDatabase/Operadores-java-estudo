// arquivos OperadoresAula7 

public class OperadoresAula7 {
    public static void main(String[] args) {

        // vamos utilizar os operadores :
        // && para falar que ( e ): exemplo;
        // if(condicao1 && condicao2){ se condicao 1 e (&&) condicao2, são
        // verdadeiras...
        // System.out.println("são verdadeiras")
        // }

        // vamos utilizar o operador : || para falar que um ( OU ), o outro e verdadeira
        // EXEMPLO:
        /*
         * if(condicao1 && condicao2){ se
         * System.out.println("são verdadeiras")
         * }
         * if(condicao1 || condicao2){ se condição1 OU ( || ) condicao2 e verdadeira...
         * System.out.println("Uma das condições sao verdadeiras")
         * }
         */

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Alguma das condições sao verdadeiras!");
        }

        System.out.println("fim do programa");

    }
}
