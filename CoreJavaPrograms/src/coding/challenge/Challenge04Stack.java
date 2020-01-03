package coding.challenge;

public class Challenge04Stack {
	
	private int arr[];
	private int capacity;
	private int top;
	
	Challenge04Stack(int capacity){
		this.arr = new int[capacity];
		this.capacity = capacity;
		top = -1;
	}
	
	public void push(int arg) {
		
		if(top == capacity-1) {
				throw new RuntimeException("Stack is full.. ");
		}
			arr[++top]= arg;
			System.out.println("Pushed :" + arg );
	}
	public int pop() {
		if(top == -1) {
			throw new RuntimeException("Stack is empty.. ");
	}	
		return arr[top--];
	}
	
	public int peek() {
		if(top == -1) {
			throw new RuntimeException("Stack is empty.. ");
	}	
		return arr[top];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Challenge04Stack ch1 = new Challenge04Stack(3);
		//System.out.println(ch1.peek());
		ch1.push(10);
		ch1.push(5);
		System.out.println("Poped Value :"+ch1.pop());
		ch1.push(3);
		ch1.push(2);
		System.out.println("Top of stack :"+ch1.peek());
	}

}
