public class Ex07_10 {
    public static void main(String[] args) {
        int hap = 0;
        int i;

        for (i = 1; i<=100; i++){
            if (i % 3 != 0)
                // continue; 다른 문법으로 표현이 가능하기때문에 굳이 쓰지않는다.

            hap += i;
        }
        System.out.printf("1~100까지의 합(3의 배수 제외): %d\n", hap);
    }
}
