public class HelloJava {
    public static void main(String[] args) {

        int x = 10;
        double d = x;
        long l = x;
        float f = x;
        short s = 20;
        x = s;

        double valorDouble = 9.99;
        int valorInt = (int) valorDouble; // Perda de dados, conversão cast
        System.out.println(valorInt);


    }
}
