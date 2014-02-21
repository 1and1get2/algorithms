package w02_stacks_queues;

public class L02_StackOfString_Array_Resizing extends L00_Stack{
	
	private String[] s;
	private int N = 0;

	
	public L02_StackOfString_Array_Resizing(int capacity) {
		super();
		s = new String[capacity];
	}

	@Override
	public boolean isEmpty() {
		return N == 0;
	}

//	@Override
	public void push(String t) {
		s[N++] = t;
	}

	
	@Override
	/*
	// loitering: hold a reference to an object when it is no longer needed
	public String pop() {
		return s[N--];
	}
	*/
	public String pop() {
		String item = s[--N];
		s[N] = null;
		return item;
	}

	@Override
	public void push(Object t) {
		// TODO Auto-generated method stub
		
	}

}
