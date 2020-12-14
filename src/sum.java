import java.util.Scanner;

public class sum {
    public static void main(String args[]){
        Scanner sd=new Scanner(System.in);
        int rem=0;
        int sum1=0;
        int count=1;
        int s1,s2;
        System.out.println("Enter the first array size..");
        s1=sd.nextInt();
        System.out.println("Enter the sec array size");
        s2=sd.nextInt();
        int[] array=new int[s1];
        int[] array1=new int[s2];
        System.out.println("First array elemnts");
        for (int i=0;i<s1;i++){
            array[i]=sd.nextInt();
        }
        System.out.println("Enter second array");
        for (int i=0;i<s2;i++){
            array1[i]=sd.nextInt();
        }

        int[] res=new int[s1];
        int j=s2-1;
        for (int i=s1-1;i>=0;i--){
            if (j < 0) {
                res[i]=array[i]+rem;
                rem=0;
                j--;
            }
            else{
                sum1=array[i]+array1[j]+rem;
                if(sum1>9){
                    res[i]=sum1%10;
                    rem=sum1/10;
                    count=count+1;
                    j--;
                }
                else{
                    res[i]=sum1;
                    rem=0;
                    count=count+1;
                    j--;
                }
            }
        }

        System.out.println("Result are");
        for(int i=0;i<s1;i++){
            System.out.print(res[i]);
        }
    }
}
