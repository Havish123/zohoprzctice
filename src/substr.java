import java.util.Scanner;

public class substr {
    public static void main(String args[]){
        Scanner sd =new Scanner(System.in);
        String str1,str2;
        System.out.println("Enter the String");
        str1=sd.next();
        System.out.println("Enter the sub String");
        str2=sd.next();
        int count=0;
        for(int i=0;i<str1.length();i++){
            for (int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    count=1;
                }
                else{
                    count=0;
                }
            }
        }
        if(count==1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
