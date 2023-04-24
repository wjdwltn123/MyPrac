import java.util.Scanner;

public class SS2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        //5개의 정수 입력받기
        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }
        //배열 요소 비교를 통한 정렬
        for(int i=0; i<5; i++) {
            for(int j=i+1; j<5; j++) {
                if(arr[i] < arr[j]) { //현재 요소보다 큰 요소가 있다면
                    int temp = arr[i]; //스왑을 통한 요소 교환
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //큰 순서대로 출력
        for(int i=0; i<5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
