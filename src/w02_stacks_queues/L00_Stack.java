package w02_stacks_queues;


/*
interface L00_Stack <Item>{
	class Node {
		Item item;
		Node next;
	}
	public boolean isEmpty();
//	public abstract <T> void push(T t);
//	public <T> T pop();
	void push(String t);
	String pop();
}
*/

public abstract class L00_Stack <Item>{
	private class Node{
		Item item;
		Node next;
	}
	
	abstract public boolean isEmpty();
	abstract public Item pop();
	// something not right here
	abstract public <Item> void push(Item t);
//	abstract public void push(String t);
}