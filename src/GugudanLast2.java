import java.util.Scanner;

public class GugudanLast2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String InputValue = scanner.nextLine();

        String[] splitedValue = InputValue.split(",");

        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);

        int result;

        for(int j=2; j<=first;j++){
            for(int i=1;i<=second;i++){
                result = j*i;
                System.out.println(result);
            }
        }
    }
}
