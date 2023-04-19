import java.util.Arrays;
import java.util.Scanner;

public class Class12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] a = new int[5];  // a배열문에 정수형 공간 5개를 만듬.


        for (int i = 0; i < a.length; i++) { // i 가 0으로 저장, i가 배열 a의 값보다 작을 때까지 반복합니다.
            System.out.print((i + 1) + "번째 정수를 입력하세요: "); // i+1값을 입력받아 출력
            a[i] = s.nextInt(); //사용자가 적은 수를 i번쨰 배열에 저장함.
        }

        // 배열 정렬하여 큰 순서대로 출력하기
        Arrays.sort(a); // 오름차순 정렬함.
        for (int i = a.length - 1; i >= 0; i--) { // i가 0보다 크거나 같은 동안 i를 1씩 감소시킵니다.
            System.out.print(a[i] + " ");  // i번째 배열값을 출력하고, 공백 문자를 추가합니다
        }
    }
}






