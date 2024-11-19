public class Stack {
    
    private int arr[];
    private int size;
    private int index = 0;
    
    // Constructor to initialize the stack with a given size
    public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    // Pushing an element to the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
            return; // Exit the function if stack is full
        }
        arr[index] = element;
        index++;
    }

    // Popping an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Return a sentinel value to indicate empty stack
        }
        return arr[--index];
    }

    // Checking whether the stack is empty
    public boolean isEmpty() {
        return index == 0;
    }

    // Checking whether the stack is full
    public boolean isFull() {
        return index == size;
    }

    // Getting the current size of the stack (number of elements)
    public int size() {
        return index;
    }
}

class StackClient {
    public static void main(String[] args) {
        Stack stack = new Stack(5);  // Create a stack of size 5
        stack.push(8);
        stack.push(11);
        stack.push(13);
        stack.push(20);
        stack.push(11);
        
        // Print the size of the stack after push operations
        System.out.println("1. Size of stack after push operations: " + stack.size());
        
        System.out.println("2. Popping elements from stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        
        // Print the size of the stack after pop operations
        System.out.println("\n3. Size of stack after pop operations: " + stack.size());
    }
}
