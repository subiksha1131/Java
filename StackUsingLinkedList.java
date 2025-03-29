class stackNode {
	int data;
	stackNode next;
	stackNode(int data) {
		this.data=data;
		this.next=null;
	}
}
class Stack {
	private stackNode top;
	public Stack() {
		this.top =null;
	}
	public void push(int data) {
		stackNode newNode=new stackNode(data);
		if(top==null) {
			top=newNode;
		} else {
			newNode.next=top;
			top=newNode;
		}
		System.out.println(data+"pushed to stack");
	}
	public int pop() {
		if(isEmpty()) {
	System.out.println("stack overflow");
			return-1;
			}
			int poppedData=top.data;
			top=top.next;
			return poppedData;
	}
	public int peek() {
		if(isEmpty()) {
	System.out.println("Stack is empty");
			return-1;
			}
			return top.data;
	}
	public Boolean isEmpty() {
		return top==null;
	}
	public void display() {
		if(isEmpty()) {
	System.out.println("Stack is empty");
			return;
			}
			stackNode current=top;
			System.out.print("Stack element:");
			while(current!=null)
			{
	System.out.print(current.data+" ");
		current=current.next;
		}
		System.out.println();
}
}
public class StackUsingLinkedList {
		public static void main(String[] args) {
			Stack stack=new Stack();
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.display();
			System.out.println("top  element is:"+stack.peek());
			System.out .println(stack.pop()+"popped from stack");
			stack.display();
		}
}

		
 
		
