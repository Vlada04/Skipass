package skipasses;

public class Turnstile {
    public void check(SkiPass pass){
        if (pass.isBlocked() == true || pass.getTerm() == 0){
            System.out.println("No entry allowed");
        }
        else{
            System.out.println("Passage permitted. Have a good time!");
        }
    }
}
