package ProgrammingForTT;
class Stack {

    private int size ;
    private int[] stack = new int[size];
    private int top ;

    Stack(int size){

            this.size = size;
            this.stack = new int[size];
            this.top = -1;

    }


    public void push(int x) {

        if (top == stack.length - 1) {

            System.out.println("Stack is overflow");

        } else {

            stack[++top] = x;

        }

    }

    public void pop() {

        if (top == -1) {

            System.out.println("Stack is underflow");

        } else {

            System.out.println("popped value is : " + stack[top--]);

        }
    }

    public int peek() {

        if (top == -1) {

            System.out.println("Stack is empty");

            return -1;

        } else {

            return stack[top];

        }
    }

    public void display() {

        if (top == -1) {

            System.out.println("Stack is empty");

        }

        else {

            for (int i = top; i >= 0; i--) {

                System.out.print(stack[i] + " ");

            }

            System.out.println();

        }

    }

}
public class StackTest {

    public static void main(String[] args){

        Stack s = new Stack(5);   // Object creation (OOP)

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();
        s.display();

        System.out.println("Top element: " + s.peek());
    }
}
