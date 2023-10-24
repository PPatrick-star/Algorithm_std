package basic;

//[?] 정렬되어 있는 데이터를 이진 검색(이분탐색)을 사용하여 반씩 나눠서 검색

// SearchAlgorithm

public class SearchAlgorithm {
    public static void main(String[] args) {
        // 1 Input
        int[] data = { 1, 3, 5, 7, 9}; //오름차순으로 정렬되었다고 가정
        int N = data.length;
        int search = 5; // 검색할 데이터
        boolean flag = false; // 찾았으면 true 그렇지않으면 false
        int index = -1; //찾은 위치(인덱스)

        // 2 Process : 이진검색 (Binary Search)
        int low = 0; // min : 낮은 인덱스
        int high = N - 1; // max : 높은 인덱스
        while (low <= high) {
            int mid = (low + high) / 2; //중간 인덱스 구하기
            if ( data[mid] == search) {
                flag = true; index = mid; break;
            }
            if (data[mid] < search) {
                low = mid + 1; //찾을 데이터가 크면 오른쪽 영역으로 이동
            }
            else {
                high = mid - 1; //찾을 데이터가 작으면 왼쪽 영역으로 이동
            }
        }
        
        // 3 Output
        if(flag) {
            System.out.println("Find " +search + " in this position "+  index );
        }
        else {
            System.out.println("Can't find");
        }
    }
}