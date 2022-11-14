package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        String []num=new String[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println(i + "つ目の整数を入力してください");
            num[i]=scanner.nextLine();

        }
        System.out.println(num[0]+"+"+(num[1]) +"="+(Integer.parseInt(num[0])+Integer.parseInt(num[1])));

    }

}