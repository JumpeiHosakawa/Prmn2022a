package lecture01;

public class kadai15 {
    public static void main(String[] args) {
        int min, max;
        double ave;
        String s = null;
        int[] score = {41, 85, 72, 38, 80};
        for (int i = 0; i < score.length; i++) {
            if (score[i] < 60) {
                s = "不可";
            }
            if (score[i] >= 60 && score[i] < 70) {
                s = "可";
            }
            if (score[i] >= 70 && score[i] < 80) {
                s = "良";
            }
            if (score[i] >= 80 && score[i] < 90) {
                s = "優";
            }
            if (score[i] >= 90) {
                s = "秀";
            }
            System.out.println(i + 1 + "番" + score[i] + "点" + s);
        }
        max = Max(score);
        min = Min(score);
        ave = Ave(score);
        System.out.println("最高点"+max+"点");
        System.out.println("最低点"+min+"点");
        System.out.println("平均点"+ave+"点");
    }


    public static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int Min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static double Ave(int[] arr) {
        double ave = 0;
        for (int i = 0; i < arr.length; i++) {

            ave = ave + arr[i];
        }
        ave = ave / arr.length;

        return ave;
    }
}





