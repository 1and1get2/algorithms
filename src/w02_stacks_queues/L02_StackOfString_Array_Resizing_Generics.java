package w02_stacks_queues;

public class L02_StackOfString_Array_Resizing_Generics <Item> {
	
	private Item[] s;
	private int N = 0;

	
	public L02_StackOfString_Array_Resizing_Generics(int capacity) {
//		s = new Item[capacity];
		s = (Item[]) new Object[capacity];
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public void push(Item t) {
		s[N++] = t;
	}

	
	
	/*
	// loitering: hold a reference to an object when it is no longer needed
	public String pop() {
		return s[N--];
	}
	*/
	public Item pop() {
		Item item = s[--N];
		s[N] = null;
		return item;
	}

}
