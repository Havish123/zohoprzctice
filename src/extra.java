import java.util.Scanner;

public class extra {
    public static void main(String args[]){
        int s1,s2;
        System.out.println("Enter 1st and 2nd the array size...");
        Scanner sd=new Scanner(System.in);
        s1=sd.nextInt();
        s2=sd.nextInt();

        if(s1>s2){
            int temp=s1;
            s1=s2;
            s2=temp;
        }
        int[] array1=new int[s1];
        int[] array2=new int[s2];
        System.out.print("Enter the first array elements.");
        for(int i=0;i<s2;i++){
            array2[i]=sd.nextInt();
        }
        System.out.println("Enter the sec array elements..");
        for(int i=0;i<s1;i++){
            array1 [i]=sd.nextInt();
        }
        int[] visited=new int[s2];
        for (int i=0;i<s2;i++){
            visited[i]=1;
        }
        for (int i=0;i<s1;i++){
            for(int j=0;j<s2;j++){
                if(array1[i]==array2[j]){
                    visited[j]=-1;
                    continue;
                }
            }
        }
        for (int i=0;i<s2;i++){
            if(visited[i]==1){
                System.out.println("Extra element is "+array2[i]+"and position is"+(i+1)+"\n");
            }
        }
    }
}
