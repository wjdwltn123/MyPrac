import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5]; // 5개의 정수를 저장할 배열 생성

        // 5개의 정수 입력 받기
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + "번째 정수 입력 : ");
            a[i] = scanner.nextInt();
        }

        int max = a[0]; // 배열의 첫 번째 원소를 최대값으로 초기화
        int min = a[0]; // 배열의 첫 번째 원소를 최소값으로 초기화
        int sum = 0; // 입력 받은 정수들의 합을 저장할 변수 초기화

        // 최대값, 최소값, 합 구하기
        for (int i = 0; i < 5; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
            sum += a[i];
        }

        double avg = (double) sum / 5; // 평균 구하기

        // 결과 출력
        System.out.println("가장 큰 값 : " + max);
        System.out.println("가장 작은 값 : " + min);
        System.out.println("평균 값 : " + avg);

        scanner.close();
    }
}
