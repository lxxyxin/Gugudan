import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args){
        //2단
        //System.out.println(2*1);
        //System.out.println(2*2);
        //System.out.println(2*3);
        //System.out.println(2*4);
        //System.out.println(2*5);
        //System.out.println(2*6);
        //System.out.println(2*7);
        //System.out.println(2*8);
        //System.out.println(2*9);

        //3단
        /*System.out.println(3*1);
        System.out.println(3*2);
        System.out.println(3*3);
        System.out.println(3*4);
        System.out.println(3*5);
        System.out.println(3*6);
        System.out.println(3*7);
        System.out.println(3*8);
        System.out.println(3*9);*/

        //4단
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("number : " + number);

        int result = number * 1;
    }
}
