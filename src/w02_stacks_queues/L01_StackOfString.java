package w02_stacks_queues;

public class L01_StackOfString implements L00_Stack_Queues{
	private Node first = null;
	
	private class Node{
		String item;
		Node next;
	}
	
	public boolean isEmpty(){
		return first == null;
	}

	@Override
	public void push(String t) {
		// TODO Auto-generated method stub
		Node oldFirst = first;
		first = new Node();
		first.item = t;
		first.next = oldFirst;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		String oldFirstStr = first.item;
		first = first.next;
		return oldFirstStr;
	}


}
