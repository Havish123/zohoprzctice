import java.util.Scanner;

public class maxcont {
    public static void main(String args[]){
        int s1;
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        s1=sd.nextInt();
        int[] array=new int[s1];
        for (int i=0;i<s1;i++){
            array[i]=sd.nextInt();
        }
        int sum1=0;
        for (int i=0;i<s1;i++){
            if (array[i]>0){
                sum1=sum1+array[i];
            }
            else {
                if (array[i+1]>0){
                    sum1=sum1+array[i];
                }
                else {

                }
            }
        }
    }
}
