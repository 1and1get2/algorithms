package w02_stacks_queues;


interface L00_Queue {
	class Node {
		String item;
		Node next;
	}
	public boolean isEmpty();
//	public abstract <T> void push(T t);
//	public <T> T pop();
	void enqueue(String t);
	String dequeue();
}
