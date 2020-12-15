import java.util.Scanner;

public class altsort {
    public static void main(String args[]){
        int s1,i,j,min=0,max=0;
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        s1=sd.nextInt();
        int[] aray=new int[s1];
        System.out.println("Enter the elements...");
        for(i=0;i<s1;i++){
            aray[i]=sd.nextInt();
        }
        int[] visited=new int[s1];
        for(i=0;i<s1;i++){
            visited[i]=aray[i];
        }
        j=1;
        for (i=0;i<s1-1;i++){
            for (j=i+1;j<s1;j++){
                if(aray[i]>aray[j]){
                    int temp=aray[j];
                    aray[j]=aray[i];
                    aray[i]=temp;
                }
            }

        }
        j=s1-1;
        for (i=0;i<s1/2;i++){
            if(s1%2==1){
                if(j>(s1/2)){
                    System.out.print(" "+aray[j]+","+aray[i]+"");
                    j--;
                }
                if(i==(s1/2)-1){
                    System.out.print(" "+aray[s1/2]+",");
                }

            }else{
                if(j>(s1/2)-1){
                    System.out.print(" "+aray[j]+","+aray[i]+"");
                    j--;
                }

            }
        }

    }
}
