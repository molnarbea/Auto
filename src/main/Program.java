package main;

public class Program {
    public static void main(String[] args) {
        Auto a1 = new Auto();
        a1.megy();
        a1.tankol();
        
        a1.megy();
        a1.tankol();
        
        a1.setInditva(false);
        
        a1.megy();
        a1.tankol();
        
        a1.setInditva(true);
        
        a1.megy();
        a1.tankol();
    }
}
