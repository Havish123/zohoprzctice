import java.util.Scanner;

public class oddeve {
    public static void main(String args[]){
        int size=10;
        int[] array=new int[size];
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter the elements one by one..");
        for (int i=0;i<size;i++){
            array[i]=sd.nextInt();
        }
        System.out.println("Odd position in array");
        for (int i=0;i<size;i++){
            if(i%2!=1){
                System.out.println(array[i]);
            }
        }
        System.out.println("Even position in array");
        for (int i=0;i<size;i++){
            if(i%2==1){
                System.out.println(array[i]);
            }
        }
    }
}
