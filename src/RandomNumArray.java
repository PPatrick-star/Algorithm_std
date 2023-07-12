public class RandomNumArray {

    public int[] getIntArray() {
        // 1. 배열생성 - 배열 원소 수는 10개로 고정하여 진행
        // 2. 배열 원소 범위 지정
        // 3. 배열 내 중복 숫자 여부 확인

        // 1-1 배열생성
        int[] intArray = new int[10];

        // 1-2 배열에 원소 넣기
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
