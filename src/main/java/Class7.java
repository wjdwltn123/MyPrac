public class Class7 {
    public static void main(String[] args){

        int[][] aa= new int[3][4]; //3행 4열의 2차원 배열을 선언한다.

        aa[0][0] = 1; aa[0][1] = 2; aa[0][2] = 3; aa[0][3] = 4; // 2차원 배열의 각각 값들을 저장함
        aa[1][0] = 5; aa[1][1] = 6; aa[1][2] = 7; aa[1][3] = 8; // 2차원 배열의 각각 값들을 저장함
        aa[2][0] = 9; aa[2][1] = 10; aa[2][2] = 11; aa[2][3] = 12; // 2차원 배열의 각각 값들을 저장함

        System.out.printf("aa[0][0]부터 aa[2][3]까지 출력 \n"); // 배열자들의 합을 입력받음

        System.out.printf("%3d %3d %3d %3d\n",aa[0][0], aa[0][1], aa[0][2],aa[0][3]); // 저장한 내용을 출력함
        System.out.printf("%3d %3d %3d %3d\n",aa[1][0], aa[1][1], aa[1][2],aa[1][3]); // 저장한 내용을 출력함
        System.out.printf("%3d %3d %3d %3d\n",aa[2][0], aa[2][1], aa[2][2],aa[2][3]); // 저장한 내용을 출력함

    }
}