import java.util.Scanner;

public class _QUIZ565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 5개의 숫자를 입력받음
        System.out.print("숫자 5개를 입력하세요(중복불가): ");
        String input = sc.nextLine();

        // 입력된 숫자를 char 배열로 변환
        char[] numbers = input.toCharArray();

        // 선택정렬 알고리즘을 사용하여 char 배열을 오름차순으로 정렬
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            char temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        // 정렬된 숫자 출력
        System.out.println("정렬된 숫자: " + new String(numbers));
    }
}