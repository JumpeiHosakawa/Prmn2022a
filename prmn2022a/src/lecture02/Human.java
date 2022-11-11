package lecture02;

public class Human {
    String name;
    int age;

    public Human(String name,int age) {
        this.name=name;
        this.age=age;
    }


    void print(){
        if(age<18){
            System.out.println(name+age+"生徒");
        }
        if(age>18&&age<23){
            System.out.println(name+age+"学生");
        }
        else{
            System.out.println(name+age);
        }
    }
}
