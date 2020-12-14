import java.util.Scanner;

public class maxcont {
    public static void main(String args[]){
        int s1,key;
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        s1=sd.nextInt();
        System.out.println("Enter the key value");
        key=sd.nextInt();
        System.out.println("Enter the array elements");
        int[] array=new int[s1];
        for (int i=0;i<s1;i++){
            array[i]=sd.nextInt();
        }
        int sum1=0;
        for (int i=0;i<s1;i++){
            if(array[i]==key){
                System.out.print("{"+array[i]+"}");
                continue;
            }
            for (int j=i+1;j<s1;j++){
                if(array[i]+array[j]==key){
                    System.out.print("{"+array[i]+" "+array[j]+"}");
                }

            }
        }
    }
}
