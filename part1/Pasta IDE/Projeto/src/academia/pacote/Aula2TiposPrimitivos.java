package academia.pacote;

public class Aula2TiposPrimitivos {
    public static void main(String[] args) {
// int, double, float, char, byte, short, long, boolean. 8 no total.
        int myAge = (int) 28888888888L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.50D;
        float salarioFloat = (float) 2500.0d;
        byte idadeByte = 127;
        short idadeShort = 28;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 37;
        var num = 30;
        System.out.println("Minha idade é " + myAge);
        String myName = "Doca Augusto";
        System.out.println("Meu nome é "+ myName);
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println(salarioFloat);
        System.out.println(numeroGrande);
        System.out.println(num);

    }
}
