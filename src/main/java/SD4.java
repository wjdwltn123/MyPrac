import java.util.Scanner;
public class SD4 {
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        int []a = new int [5];

        for ( int i = 0; i < 5 ; i ++ ) {
            System.out.print((i + 1) +"번쨰 숫자를 입력하세요. : ");
            a[i] = s.nextInt();
        }

        int max = a[0];
        int min = a[0];
        int sum = 0;

        for ( int i = 1; i < 5; i ++ )
        {
            if ( max < a[i]) max = a[i];
            if ( min > a[i]) min = a[i];
            sum += a[i];
        }
        double avg = (double) sum / 5;

        System.out.println("가장 큰 값: " + max);
        System.out.println("가장 작은 값: " + min);
        System.out.println("평균 값: " + avg);
    }
}