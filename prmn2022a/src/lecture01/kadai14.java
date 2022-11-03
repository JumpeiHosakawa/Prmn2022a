package lecture01;

public class kadai14 {
    public static void main(String[] args) {
        int sum=0;
        int[] array = new int[100];
        for (int i=0;i<array.length;i++){
            array[i]=i+1;
            if(i%2==1){
                sum=sum+array[i];
            }
        }
        System.out.println(sum);

    }
}
