import java.util.Scanner;
public class D_44{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in); // 사용자가 입력한 정수형,실수형을 화면에 입력받음.


        int a; // a를 정수형으로 선언함.

        System.out.printf(" 1 ~ 4 중에 선택하세요 : "); // 괄호안에 문장들을 출력함.
        a = s.nextInt(); // a에 사용자가 입력받을 값을 씀.

        switch (a) {  // 정수값을 집어 넣는다.
            case 1: //만약 1이라면
                System.out.printf("1을 선택했다."); // 1을 선택했다고 뜨고
                break; //실행이 끝난다.
            case 2: //만약 2라면
                System.out.printf("2를 선택했다."); //2를 선택했다고 출력하고
                break; // 실행이 끝남 ---- 이걸 반복한다.
            case 3:
                System.out.printf("3을 선택했다.");
                break;
            case 4:
                System.out.printf("4를 선택했다.");
                break;

            default: // 하지만 1~4의 숫자가 아닌 다른걸 입력하면
                System.out.printf("이상한걸 선택했다."); //다음문장이 입력된다.
        }


    }
}