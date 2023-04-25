
import java.util.Scanner;
public class Class15 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 0; i < n; i ++ ){ // i가 0으로 저장되고
                                      // 입력받은 숫자보다 작을떄까지 루프 진행
            for( int k = 0; k<=i ; k++) { //k = 별의 갯수.
                                          // 0으로 저장 i가 k보다 크거나 같을떄까지 루프 진행

                System.out.printf("*"); // *이 출력됨
            }
            System.out.println();// 다음행으로 줄바꿈
        }
    }
}