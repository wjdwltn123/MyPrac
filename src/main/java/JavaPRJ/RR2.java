package JavaPRJ;

import java.util.Scanner;

public class RR2 {
    public static void main(String[] args) {
        int a = 0; //a를 0으로 저장
        int b = 0; //b를 0으로 저장
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("(1) 콜라");
            System.out.println("(2) 사이다");
            System.out.println("(3) 제로콜라");
            System.out.print("원하는 음료 (1~3)를 선택하세요. (종료:0) >");
            // 출력하는 값에 따라 입력하는것이 다르게 설정함
            String tmp = s.nextLine();
            a = Integer.parseInt(tmp); // 사용자가 쓰는 숫자를 입력받아 출력함.

            if (a==0) { // a가 0이라면 프로그램 종류가됨.
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (! (1 <= a && a <= 3)) { // a가 1 이상이고 3 이하가 아닐 경우
                System.out.println("메뉴를 잘못 설택하셨습니다. (종료는 0"); // 메뉴를 잘못 선택했다고 나옴.
                continue;

            }
            System.out.println("선택하신 메뉴는 "+a +"번입니다."); //a에 입력받은 값이 함께 출력됨.
        }


    }


}

