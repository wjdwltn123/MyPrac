public class Class5 {
    public static void main(String[] args){
        int []aa  = new int[100]; // aa 배열문에 100 선언
        int bb []  = new int[100]; // bb 배열문에 100 선언
        int i; // i는 정수형으로 선언

        for ( i =0; i < 100; i++) { //i를 0으로 저장하고 100보다 클떄까지 실행
            aa[i] = i * 2; // i가 100보다 클떄까지 2를 곱하고 aa 배열문에 안에 1을 증가시킴.
        }

        for ( i = 0; i< 100; i++) { // i는 0으로 저장, 100보다 클떄까지 실행
            bb[i] = aa[99-i]; // i가 99가 되면서 aa배열문은 0인 상태로 bb배열문에 저장함 = bb[0] << 현 상태
        }

        System.out.printf("bb[0]는 %d, bb[99]는 %d 입력됨\n", bb[0], bb[99]); // 각 bb배열문들을 정수형 입력받아 출력함.
    }
}