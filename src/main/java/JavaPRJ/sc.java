package JavaPRJ;

import java.util.*;

public class sc
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int[] arr = new int[100];
        int i, cnt = 0;

        for( i=0; i<arr.length; i++)
        {
            arr[i] = scn.nextInt();

            if( arr[i] == 0)
            {
                break;
            }
            cnt++;
        }
        for( i=cnt-1; i>=0; i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
