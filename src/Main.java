public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[0] = 10;
        intArray[1] = 2;
        intArray[2] = 8;
        intArray[3] = 3;
        intArray[4] = 9;
        intArray[5] = 6;
        intArray[6] = 1;
        intArray[7] = 7;
        intArray[8] = 4;
        intArray[9] = 5;

        for (int k : intArray) {
            System.out.println("intArray : " + k);
        }
        System.out.println("=====정렬 시작=====");

        for (int r = 0; r <= intArray.length; r++) {
            int a = 0;
            int b = a+1;
            for (int i = a; i < intArray.length; i++) {

                for (int j = b; j < intArray.length; j++) {
                    boolean bool = intArray[i] > intArray[j];
                    System.out.println(" 비교 : " + bool + ", firstNum[" +i+"] : {" + intArray[i] + "}, secondNum[" +j+"] : {" + intArray[j] + "}");
                    if (bool) {

                        int firstNum = intArray[i];
                        int secondNum = intArray[j];
                        intArray[i] = secondNum;
                        intArray[j] = firstNum;
                        System.out.println("CHANGE: "+ i +"번째 자리수 : "+intArray[i] + " 와 "+ j + "번째 자리수 "+ intArray[j] +" 교환");
                    } else if (intArray[i] < intArray[j]) {
                        System.out.println("Don't need to change");
                    }
                    i++;

                }

            }
            System.out.println("=====정렬 " + r +"회차 종료=====");
            for(int i=0; i < intArray.length; i++) {
                System.out.println("intArray[" + i +"] -> "+ intArray[i]);
            }
        }

        System.out.println("=====정렬 종료=====");
        for(int i=0; i < intArray.length; i++) {
            System.out.println("intArray[" + i +"] -> "+ intArray[i]);
        }
    }
}