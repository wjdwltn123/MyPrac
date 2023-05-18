package JavaPRJ;

import java.util.*;

public class PRJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();

        // 5개의 정수를 입력받아서 LinkedList에 추가함.
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        Integer[] arr = list.toArray(new Integer[5]);
        Arrays.sort(arr, Collections.reverseOrder());
        //  List 객체를 Integer 배열로 변환하고 그 배열을 내림차순으로 정렬

        // 숫자가 큰것들부터 출력함.
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
