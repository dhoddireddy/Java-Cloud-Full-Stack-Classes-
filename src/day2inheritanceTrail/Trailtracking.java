package day2inheritanceTrail;


public class Trailtracking extends Trail {

    public static void main(String[] args)
    
    
    {

        Trailtracking t = new Trailtracking();

        t.id = 101;
        t.name = "Babu";
        t.address = "Bangalore";
        t.mobile = 9876543210L;

        System.out.println(t.id);
        System.out.println(t.name);
        System.out.println(t.address);
        System.out.println(t.mobile);
        
    }
}