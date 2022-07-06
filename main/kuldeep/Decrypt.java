import java.util.Scanner;
public class Decrypt {
    

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Paste Your Encrypted Message ");
        String s1=sc.nextLine(); 
        char[] ch=s1.toCharArray(); 
        char[] ch1= new char[ch.length];
        for(int i=0;i<ch.length;i++){  
            char c = ch[i];
            int er =c;
            int b = er>>1;
            ch1[i]=(char) b;
        //System.out.print(ch[i]); 
        //System.out.println(b);
        }
        System.out.println("Your secret Message is :\n");
        System.out.println(ch1);

    }
}
