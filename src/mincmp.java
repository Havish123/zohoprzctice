import java.util.Scanner;

public class mincmp {
    public static void main(String args[]){
        int s1;
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter the size of array");
        s1=sd.nextInt();
        System.out.println("Enter the array elements");
        int[] aray=new int[s1];
        for(int i=0;i<s1;i++){
            aray[i]=sd.nextInt();
        }
        int min=0,max=0;
        int c=0;
        String[] str=new String[10];
        for (int i=0;i<s1;i++){
            min=aray[i];
            for (int j=0;j<s1;j++){
                max=aray[j];
                if(max>min){
                    for(int k=0;k<s1;k++){
                        if(aray[k]>min && aray[k]<max){
                            max=aray[k];
                        }
                    }
                }
            }
            System.out.print(min+">"+max+" ,");
        }
    }
}
