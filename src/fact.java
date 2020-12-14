import java.util.Scanner;

public class fact {
    public static void main(String args[]){
        int f;
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter the number");
        f=sd.nextInt();
        int res=fact1(f);
        System.out.println("Factorial of the given number"+res);
    }
    private static int fact1(int f){
        int result=1;
        if(f<0){
            System.out.println("Enter the corect number...");
        }
        else if(f==0 || f==1){
            result=1;
        }
        else{
            result=f*fact1(f-1);
        }
        return result;
    }
}
