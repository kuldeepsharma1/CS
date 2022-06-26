//Java Program to demonstrate the use of the parameterized constructor.  
class JavafinalizeExample1 {  
    
       
    @Override  
  protected void finalize()   
  {   
      System.out.println("finalize method called");   
  }   


  }   
 
class Student4{  
  int id;  
  String name;  
  //creating a parameterized constructor  
  Student4(int i,String n){  
  id = i;  
  name = n;  
  }  



  //method to display the values  
  void display(){System.out.println(id+" "+name);}  
 
  public static void main(String args[]){  
  //creating objects and passing values  
  Student4 s1 = new Student4(111,"Karan");  
  Student4 s2 = new Student4(222,"Aryan");  
  //calling method to display the values of object  
  s1.display();  
  s2.display();  
    JavafinalizeExample1 obj = new JavafinalizeExample1();   
      System.out.println(obj.hashCode());   
      obj = null;   
      // calling garbage collector    
      System.gc();   
      System.out.println("end of garbage collection");  
 }  
}  


