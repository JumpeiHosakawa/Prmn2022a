package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("何行分入力しますか？");
        int number=scanner.nextInt();
        scanner.nextLine();
        for(int i=1;i<=number;i++){
            System.out.println(i+"行目");
            lists.add(scanner.nextLine());
        }
        System.out.println("入力した文字列");
        for(String list:lists){
            System.out.println(list);

        }

    }
}
