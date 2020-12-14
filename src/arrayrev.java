import java.util.Scanner;

public class arrayrev {
    public static void main(String args[]){
        int size=10;
        int[] array=new int[size];
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter the Elements one by one..");
        for(int i=0;i<size;i++){
            array[i]=sd.nextInt();
        }
        System.out.println("Reverse order array...");
        for (int i=size-1;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}
