import java.util.Scanner;

public class arythres {
    public static void main(String args[]) {
        int s1, thres;
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter the array size");
        s1 = sd.nextInt();
        System.out.println("Enter the threshold value..");
        thres = sd.nextInt();
        System.out.println("Enter the aray elements one by one..");
        int[] aray = new int[s1];
        for (int i = 0; i < s1; i++) {
            aray[i] = sd.nextInt();
        }
        int sum1 = 0;
        for (int i = 0; i < s1; i++) {
            int count = 0;
            sum1 = sum1 + threshold(count, aray[i], thres);
        }
        System.out.println("Count" + sum1);
    }

    private static int threshold(int count, int val, int t) {
        if (val >=t) {
            int di=val/t;
            count=count+di;
            int div=val % t;
            int d=threshold(count, div, t);
            return d;

        }else if(val>0){
            count++;


        }

        return count;

    }
}
