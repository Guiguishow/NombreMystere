package number;

import java.util.Random;
import java.util.Scanner;

public class NombreMystere {
    public static void main(String[] args) {

        int nombreMystere;
        int tentative;
        int compteurTentatives = 0;
        int maxTentatives = 10;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        nombreMystere = random.nextInt(100) + 1;

        while (compteurTentatives < maxTentatives) {

            System.out.print("Devinez le nombre (entre 1 et 100) : ");
            tentative = scanner.nextInt();
            compteurTentatives++;

            if (tentative == nombreMystere) {
                System.out.println("Bravo, tu as trouvé le nombre Mystere: " + nombreMystere);
            } else if (tentative > nombreMystere) {
                System.out.println("Ton nombre est trop grand !");
            } else {
                System.out.println("Ton nombre est trop petit !");
            }
        }

        System.out.println("Désolé, vous avez épuisé vos tentatives. Le nombre mystère était : " + nombreMystere);
    }
}
