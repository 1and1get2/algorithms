package w02_stacks_queues;

public class L02_StackOfString_Array_FixedCapacity extends L00_Stack{
	
	private String[] s;
	private int N = 0;

	
	public L02_StackOfString_Array_FixedCapacity() {
		super();
		s = new String[1];
	}

	@Override
	public boolean isEmpty() {
		return N == 0;
	}

	public void push(String t) {
		if (N == s.length) resize(2 * s.length); 
		s[N++] = t;
	}
	
	private void resize(int capacity){
		String[] copy = new String[capacity];
//		for (int i = 0; i < N; i++){
//			copy[i] = s[i];
//		}
		System.arraycopy(s, 0, s, 0, N);
		s = copy;
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
		if (N > 0 && N == s.length / 4) resize(s.length/2);
		return item;
	}

	@Override
	public void push(Object t) {
		// TODO Auto-generated method stub
		
	}

}
