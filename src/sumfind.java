import java.util.Scanner;

public class sumfind {
    public static void main(String args[]){
        int s1,key,i;
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        s1=sd.nextInt();
        int[] array=new int[s1];
        System.out.println("Enter the array values");
        for (i=0;i<s1;i++){
            array[i]=sd.nextInt();
        }
        System.out.println("Enter the key value");
        key=sd.nextInt();
        boolean a=true;
        for (i=0;i<s1;i++){
            for (int j=i+1;j<s1;j++){
                int sum1=array[i]+array[j];
                if(sum1==key){
                    System.out.println("true");
                    a=false;
                break;}
                }
            }
        if(a==true){
            System.out.println("false");
        }
        }
    }

