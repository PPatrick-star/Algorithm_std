package algorithm.basic;
public class RandomNumArray {

    public int[] getIntArray() {

        int[] intArray = new int[10];

        for (int i = 0; i < intArray.length; i++) {
            int num = (int) (Math.random() * 100);
            System.out.println("num : " + num);
            if (num > 0) {
                System.out.println("num : " + num);
                intArray[i] = num;

            } else {
                num = num * (-1);
                intArray[i] = num;
                System.out.println("num : " + num);
            }
        }

        return intArray;
    }
}
