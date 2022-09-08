import java.util.Scanner;
//입력값에 따라 크기가 다른 구구단을 출력하는 문제
//ex)8 입력 -> 2*1 부터 8*8까지 출력
public class GugudanLast1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result;

        for(int j = 2;j<=number;j++){
            for(int i=1;i<=j;i++){
                result = j*i;
                System.out.println(result);
            }
        }
    }
}
