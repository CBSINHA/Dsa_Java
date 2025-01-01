import java.util.*;
public class Stacks {
    public static void main(String[] args) {
        Stack<String>soulsborne=new Stack<String>();
        soulsborne.push("Demon Souls");
        soulsborne.push("Dark Souls");
        soulsborne.push("Bloodborne");
        soulsborne.push("Sekiro");
        soulsborne.push("Elden Ring");
        System.out.println("Games in the Stack:"+soulsborne);
        System.out.println("Game at the top:"+soulsborne.peek());
        soulsborne.pop();
        System.out.println("After removing top game: "+soulsborne);
    }
}
