package defPackage;
import java.util.*;
interface DataStructure {
	public void push(int m);
	public int pop();
	public boolean isEmpty();
	public boolean isFull();
}
class Stack implements DataStructure{
	private int a[];
	private int stackTop, n;
	Stack(int n){
		a = new int[n];
		this.n = n;
		stackTop = -1;
	}
	public void push(int m) {
		if(this.isFull()) {
			System.out.println("FULL");
			return;
		}
		a[++stackTop]=m;
	}
	public int pop() {
		if(this.isEmpty()) {
			System.out.println("EMPTY");
			return -1;
		}
		return a[stackTop--];
	}
	public boolean isEmpty() {
		return (stackTop==-1?true:false);
	}
	public boolean isFull() {
		return (stackTop>=n-1?true:false);
	}
}
class Queue implements DataStructure{
	private int a[];
	private int front, rear, n;
	Queue(int n){
		a = new int[n];
		this.n = n;
		front=-1;
		rear=-1;
	}
	public void push(int m) {
		if(this.isFull()) {
			System.out.println("FULL");
			return;
		}
		a[++rear]=m;
	}
	public int pop() {
		if(this.isEmpty()) {
			System.out.println("EMPTY");
			return -1;
		}
		return a[++front];
	}
	public boolean isEmpty() {
		return (front==rear?true:false);
	}
	public boolean isFull() {
		return (rear>=n-1?true:false);
	}
}
public class d1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Stack and 2 for Queue: ");
		int c = sc.nextInt();
		if(c==1) {
			System.out.println("Enter size of stack: ");
			Stack s = new Stack(sc.nextInt());
			while(true) {
				System.out.println("\n1.PUSH\n2.POP\n3.EXIT");
				int a = sc.nextInt();
				if(a==1) {
					System.out.println("Enter element: ");
					s.push(sc.nextInt());
				}
				else if(a==2) 
					System.out.println("Popped element: "+s.pop());
				else
					break;
			}
		}
		else {
			System.out.println("Enter size of queue: ");
			Queue q = new Queue(sc.nextInt());
			while(true) {
				System.out.println("\n1.ENQUEUE\n2.DEQUEUE\n3.EXIT");
				int a = sc.nextInt();
				if(a==1) {
					System.out.println("Enter element: ");
					q.push(sc.nextInt());
				}
				else if(a==2) 
					System.out.println("Popped element: "+q.pop());
				else
					break;
		}
	}
	}
}
//ref:www.github.com/narenchandra859