public class Stack {
	private int arr[];
	private int top;
	private int capacity;
	public Stack(int size) {
		arr=new int[size];
		capacity=size;
		top=-1;
	}
	public void push(int x) {
		if(isFull()) {

System.out.println("stack overflow");
			System.exit(1);
		}
System.out.println("inserting"+x);
		arr[++top]=x;
	}
	public int pop() {
		if(isEmpty()) {
System.out.println("stack empty");
			System.exit(1);
		}
		return arr[top--];
	}
	public boolean isFull() {
		returntop==capacity-1;
	}
	public void printStack() {
		for(int i=0;i<=top;i++) {
system.out.print(arr[i]+",");
		}
	}
	public static void main(String[] args) {
		Stack stack=new stack(5);
		statk.push(1);
		stack.push(2);
		stack.push(3);
System.out.print("Stack");
	stack.printStack();
	stack.pop();
System.out.println("\n after poping out");
		Stack.printStack();
	}
}
