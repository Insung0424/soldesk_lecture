package hund;

public class stack {
	int top;
	Object[] s = {};
	
	Object[] arr;
	
	stack(){
		top=0;
		arr = s;
	}
	
	public void push(int x) {
		s[top] = x;
		top++; 
	}
	
	public int pop() {
		if(isEmpty() == 1) {
			return -1;
		}
		else {
			return (int) s[top--];
		}
	}
	
	public int size() {
		return top+1;
	}
	
	public int isEmpty() {
		if(top == -1) {
			return 1;
		}
		return 0;
	}
	
	public int top() {
		if(isEmpty() == 1) {
			return -1;
		}
		else {
			return (int) s[top];
		}
	}
}
