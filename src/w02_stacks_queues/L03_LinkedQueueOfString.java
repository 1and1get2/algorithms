package w02_stacks_queues;

public class L03_LinkedQueueOfString implements L00_Queue {
	
//	private class Node{
//		
//	}
	
	private Node first, last;
	
	@Override
	public boolean isEmpty() {
		return first == null;
	}
	
	//TODO: understand
	@Override
	public void enqueue(String t) {
		Node oldLast = last; 
		last = new Node();
		last.item = t;
		last.next = null;
		if (isEmpty()) first = last;
		else oldLast.next = last;
	}

	@Override
	public String dequeue() {
		String item = first.item;
		first = first.next;
		//
		if (isEmpty()) last = null;
		return item;
	}

	
}
