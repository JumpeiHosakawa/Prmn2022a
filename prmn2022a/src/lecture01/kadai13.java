package lecture01;

import java.util.Scanner;

public class kadai13 {
    public static void main(String[] args) {
        System.out.println("何歳ですか");
        Scanner input=new Scanner(System.in);
        int age= input.nextInt();
        if(age<=19){
            System.out.println("未成年です");
        }
        else{
            System.out.println("成人です");
        }

    }
}
