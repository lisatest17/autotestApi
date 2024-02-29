import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomCycle = new Random();

        int[] bicycles;
        bicycles = new int[20];

        for (int i = 0; i < bicycles.length; i++) {
            bicycles[i] = randomCycle.nextInt(500);

            System.out.println(bicycles[i]);
        }
    }
}