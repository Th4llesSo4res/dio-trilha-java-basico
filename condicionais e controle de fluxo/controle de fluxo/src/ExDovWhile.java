import java.util.Random;

public class ExDovWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            //executando repetidas vezes até alguem atender
            System.out.println("Telefone Tocando");
            
        }while(tocando());

        System.out.println("Alô !!!");

    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(5)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
