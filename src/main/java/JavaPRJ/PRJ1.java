package JavaPRJ;

import java.util.*;

public class PRJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();

        // 5개의 정수를 입력받아 LinkedList에 추가
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // LinkedList를 배열로 변환하여 정렬
        Integer[] arr = list.toArray(new Integer[5]);
        Arrays.sort(arr, Collections.reverseOrder());

        // 큰 순서대로 출력
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
