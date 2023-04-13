import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[5]; // 배열문의 5개의 정수 입력 받음

        for (int i = 0; i < 5; i++) { // i가 0으로 저장, i가 5보다 작을떄 다음행으로 너어감
            System.out.print((i+1) + "번째 정수 입력 : "); // 사용자가 정수나 실수 입력하기.
            a[i] = s.nextInt(); // 값을 입력받음
        }
        int max = a[0]; //최대값을 0
        int min = a[0]; // 최소값을 0
        int sum = 0; // 평균값을 0

        for (int i = 0; i < 5; i++) {  // i를 1로 저장 i가 5보다 작을떄 다음행으로
            if (max < a[i]) max = a[i]; //최대값이 i 배열문의 값보다 작으면 max는 그 i값으로 저장함.
            if (min > a[i]) min = a[i]; // 최소값이 i 배열문의 값보다 크면 min는 그 i값으로 저장함.
            sum += a[i]; // 평균값은 sum에 i를 더한 값을 대입한다
        }
        float avg = (float) sum / 5;

        System.out.println("가장 큰 값 : " + max);
        System.out.println("가장 작은 값 : " + min);
        System.out.println("평균 값 : " + avg);


    }
}

