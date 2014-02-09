package w01_union_find;

import java.util.Arrays;

public class L07_QuickUnion_LazyApproach {
	private static int N = 25;
	private int numbers;
	private int[] id;
	
	public L07_QuickUnion_LazyApproach(int[] id) {
		if (id != null){
			this.numbers = id.length;
			this.id = id;
		}
	}
	public L07_QuickUnion_LazyApproach() {
		this(N);
	}
	public L07_QuickUnion_LazyApproach(int numbers) {
		this.numbers = numbers;
		id = new int[numbers];
		for (int i = 0; i < numbers; i++){
			id[i] = i;
		}
	}
	
	
	// my own 
	public int root(int p){
		return id[p] == p ? p : root(id[p]);
	}
	
	public void union(int p, int q){
		id[root(p)] = root(q);
	}
	
	public boolean connected(int p, int q){
		return id[root(p)] == id[root(q)];
	}
	
	public int getNumbers(){
		return this.numbers;
	}
	
	public int[] toArray(){
		return id;
	}
	
	public String toString(){
		return Arrays.toString(id);
	}
}
