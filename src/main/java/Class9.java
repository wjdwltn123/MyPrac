import java.util.Scanner;
public class Class9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 정수형, 실수형과 같은 값을 화면에서 입력할것이다.
        int a, b, c, d; // a,b,c,d를 정수형 변수에 저장함
        int hap; // hap을 정수형 변수에 저장.

        System.out.printf("1번째 숫자를 입력하세요.  : "); //1번째 숫자를 화면에서 출력한다

        a = s.nextInt(); //위에 행에 적은 숫자가 입력되고 다음행으로 이동한다.

        System.out.printf("2번쨰 숫자를 입력하세요. :"); //2번째 숫자를 화면에서 입력한다.

        b = s.nextInt(); //b에 사용자가 적은 숫자가 저장되고 다음행으로 이동한다.

        System.out.printf("3번쨰 숫자를 입력하세여. :"); //3번째 숫자를 화면에서 입력한다.

        c = s.nextInt(); //c에 사용자가 적은 숫자가 저장되고 다음행으로 이동한다.

        System.out.printf("4번쨰 숫자를 입력하세요. :"); //4번째 숫자를 화면에서 입력한다.

        d = s.nextInt(); //d에 사용자가 적은 숫자가 저장되고 다음행으로 이동한다.
        hap = a + b + c + d; //합은 a,b,c,d의 합을 더한걸 저장한다.

        System.out.printf(" 합 ==> %d \n", hap); //합에 저장된 정수를 합 ==>에 출력되고 다음행으로 넘어간다.
    }
}
