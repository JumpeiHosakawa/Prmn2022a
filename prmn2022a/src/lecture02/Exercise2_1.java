package lecture02;

import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {
        String name ;
        int age;
        Scanner input=new Scanner(System.in);
        System.out.println("名前の入力");
        name=input.next();
        System.out.println("年齢");
        age= input.nextInt();
        Human h=new Human(name,age);
        h.print();
    }
}
