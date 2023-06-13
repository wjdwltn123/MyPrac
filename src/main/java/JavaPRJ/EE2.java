package JavaPRJ;

import java.util.Scanner;

public class EE2 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int[] day = new int[13];
        int i, year;

        for( i=1; i<day.length; i++)
        {
            if( i==2) // i에 2를 저장하면
            {
                day[i] = 28; //28을 i에 저장
            }
            else if( i==4 || i==6 || i==9 || i==11) //i에 4,6,9,11를 저장하면
            {
                day[i] = 30; //30에 i 저장
            }
            else // 저 조건들이 아니라면
            {
                day[i] = 31; // 31을 i에 저장함
            }
        }

        while(true) //무한 로프를 작성하여 년도와 월을 계속 진행하게 만듬
        {
            System.out.print("년도 : ");
            year = scn.nextInt();
            System.out.print("월 : ");
            i = scn.nextInt();

            if(i == 0) // i에 0을 출력하면 멈춤
            {
                break;
            }

            if(i<1 || i>12) // i가 1부터 12사이의 값이 아닌 경우면
            {
                System.out.print("잘못 입력하였습니다.\n\n"); //잘못 입력했다고 작성되고 계속진행함
                continue;
            }

            else if( i==2) // i가 2면
            {
                if(year%400==0||((year%4==0)&&(year%100!=0))) //윤년인지 확인하는 조건
                {
                    day[2] = 29; //조건에 맞으면 29를 day[2]에 저장함
                }
                else
                {
                    day[2] = 28; //조건에 틀리면 28를 day[2]에 저장
                }
            }

            System.out.printf("입력하신 달의 날수는 %d일입니다.\n\n", day[i]); //값을 출력함
        }
    }
}
