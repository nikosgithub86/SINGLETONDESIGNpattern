package singletondesignpattern;
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    
//in singleton design patterns the constructor must be private
    private SingleObject() {
    }

    public static SingleObject getInstance(){
        return instance;
        
    }
    
    public void showMessage(){
        System.out.println("only one object can be created");
    }
    
    
    
    
}
