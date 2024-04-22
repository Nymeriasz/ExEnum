package Enum;

public class ExemploEnum {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.SEGUNDA; // Atribuímos SEGUNDA a dia
        System.out.println(dia);

        // Podemos usar um switch-case para fazer algo com base no dia da semana
        switch (dia) {
            case SEGUNDA:
                System.out.println("É segunda-feira.");
                break;
            case TERÇA:
                System.out.println("É terça-feira.");
                break;
            case QUARTA:
                System.out.println("É quarta-feira.");
                break;
            case QUINTA:
                System.out.println("É quinta-feira.");
                break;
            case SEXTA:
                System.out.println("É sexta-feira.");
                break;
            case SÁBADO:
                System.out.println("É sábado.");
                break;
            case DOMINGO:
                System.out.println("É domingo.");
                break;
        }
    }
}
