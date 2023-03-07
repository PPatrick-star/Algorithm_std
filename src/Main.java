import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        RandomNumArray randomNumArray = new RandomNumArray();

        int[] intArray = randomNumArray.getIntArray();

        System.out.println("intArray " + Arrays.toString(intArray));
    }
}