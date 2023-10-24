public class SumAlgorithm {

    // [?] n명의 국어 점수 중에서 80점 이상인 점수의 합계ㅒ

    // 합계 알고리즘 (Sum Algorithm) : 주어진 범위에 주어진 조건에 해당한느 자료 들의 합계

    public void sumAlgorithm() {
        // [1] Input : n명의 국어점수
        int[] scores = { 100, 75, 50, 37, 90, 95};
        int sum = 0;

        // [2] Process : 합계 알고리즘 영역 : 주어진 범위에 주어진 조건(필터링)
        for (int score : scores) {
            if (score >= 80) {
                sum += score; //sum
            }
        }

        // [3] Output
        System.out.println(scores.length + "명의 점수 중 80점 이상의 총점 :" +sum);
    }

}
