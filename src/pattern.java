import java.util.Scanner;

public class pattern {
    public static void main(String args[]){
        int key;
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter the value");
        key=sd.nextInt();
        int mul=1;
        if(key==0){
            System.out.println("Enter the correct input");

        }else {
            for (int i=0;i<key;i++){
                mul=mul*2;
            }
            for (int i=0;i<mul;i++){
                binary(i,key);

            }
        }

    }

    private static void binary(int i,int key) {
        int[] bin1=new int[key];
        for (int j=0;j<key;j++){
            bin1[j]=0;
        }int j=key-1;
            while (i>0){
                bin1[j]=i%2;
                i=i/2;
                j--;
            }

        for (int k=0;k<key;k++){
            System.out.print(bin1[k]+" ");
        }
        System.out.println(" ");
    }
}
