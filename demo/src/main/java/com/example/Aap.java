package demo.src.main.java.com.example;


public class Aap {
    
    private String name;
    private int tailLength;
    
    public Aap(String name, int tailLength) {
        this.name = name;
        this.tailLength = tailLength;
    }
    
    public void call() {
        System.err.println(name + " does not respond to your call");
    }
    
    public boolean isGoodTreeClimber() {
        return tailLength >= 50;
    }

}
