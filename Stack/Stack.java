// Basic Stack util !
// TODO: Modify to fancy one that works with Generics

class Stack {

    private String arr[];
    private String stackName;
    private int capacity;
    private int top;

    Stack(int size, String stackName) {
        this.stackName = stackName;
        top = -1;
        capacity = size;
        arr = new String[size];

        System.out.println("Stack created with size of " + capacity);
    }

    public void size() {
        System.out.println("The size is: " + (top + 1));
    }

    public Boolean isEmpty() {
        return (top == -1);
    }

    public Boolean isFull() {
        return (top == capacity - 1);
    }

    public void push(String inner) {
        if (isFull()) {
            System.err.println("ERROR: Your stack is full. Please clean the space");
            System.exit(1);
        }

        arr[++top] = inner;
    }

    public void pop() {
        if (isEmpty()) {
            System.err.println("ERROR: Your stack is already empty.");
            System.exit(1);
        }

        arr[top--] = null;
    }

    public void viewStack() {
        System.out.println("|---------|");
        for (String s : arr) {
            System.out.println("====>" + s);
            System.out.println("|---------|");
        }
    }

    public void printStackName() {
        System.out.println("The name of the stack is '" + stackName + "'");
    }

    public static void main(String[] args) {
        Stack stack = new Stack(6, "Some words");

        stack.push("Hello");
        stack.push("World");
        stack.pop();
        stack.printStackName();
        stack.viewStack();

    }
}