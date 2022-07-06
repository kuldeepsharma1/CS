import java.util.*;

class Encrypt{
	public static void main(String args[]){

 	Scanner sc = new Scanner(System.in);
	
	
System.out.println("Enter Your Password :\n\n");
String s1=sc.nextLine();  
char[] ch=s1.toCharArray(); 
System.out.println("cipher text :\n\n");
char[] ch2 = new char[ch.length];
char[] ch3 = new char[ch.length];


for(int i=0;i<ch.length;i++){  
	char c = ch[i];
	int er =c;
	int b = er<<1;
	ch2[i]=(char) b;



}
System.out.println(ch2);
System.out.println();
System.out.println("Copy this Decrypted code and Plug it into Decrypt.java");


/** 
 * This is your decrypted message code
 * 
 * 
System.out.println("Original Password :\n\n\n");

for(int i=0;i<ch2.length;i++){  
	char c = ch2[i];
	int er =c;
	int b = er>>1;
	ch3[i]=(char) b;

}
System.out.println(ch3);


*/

	}
}