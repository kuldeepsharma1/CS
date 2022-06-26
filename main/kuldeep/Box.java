class Box1{  
    void eat(){System.out.println("eating...");}  
    }  
    class Dog extends Box1{  
    void bark(){System.out.println("barking...");}  
    }  
    class Box{  
    public static void main(String [] args){  
    Dog d=new Dog();  
    d.bark();  
    d.eat();  
    }}  