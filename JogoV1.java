//import java.util.Random;

public class JogoV1 {
    public static void main(String[] args) throws InterruptedException {
        Personagem kawaii = new Personagem();
        kawaii.nome = "nico";

        while (true) {
            kawaii.cacar();
            kawaii.dormir();
            kawaii.comer();
            kawaii.dormir();
            kawaii.dormir();
            kawaii.dormir();
            kawaii.cacar();
            kawaii.comer();
            kawaii.cacar();
            kawaii.cacar();

            System.out.println("====================");
            Thread.sleep(3000); // pausa 3 segundos
        }
    }
}
