package Aug.ex_24082024.collectionFramework;

import java.util.Stack;

public class Lab_237 {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.add("Deepa");
        stack.add("Vilas");
        stack.push("Chavan");           //push is internally calling add() only
        System.out.println(stack.peek());       //Chavan    // last which was added to the stack
        stack.add("Hellloww");
        System.out.println(stack);              //[Deepa, Vilas, Chavan]
        System.out.println(stack.peek());       //Hellloww    // last which was added to the stack
        System.out.println(stack);              //[Deepa, Vilas, Chavan, Hellloww]
        System.out.println(stack.pop());        //Hellloww    // last which was added to the stack is removed
        System.out.println(stack);              //[Deepa, Vilas, Chavan]
    }
}
