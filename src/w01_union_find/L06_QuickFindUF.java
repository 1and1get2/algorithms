package w01_union_find;

import java.util.Arrays;

public class L06_QuickFindUF {
	private static int N = 25; //default length
	private int numbers;
	private int[] id;

	public L06_QuickFindUF(int[] id) {
		if (id != null){
			this.numbers = id.length;
			this.id = id;
		}
	}
	public L06_QuickFindUF() {
		this(N);
	}
	public L06_QuickFindUF(int numbers) {
		this.numbers = numbers;
		id = new int[numbers];
		for (int i = 0; i < numbers; i++){
			id[i] = i;
		}
	}
	
	public boolean connected(int p, int q){
		return id[p] == id[q];
	}
	
	public void union(int p, int q){
		for (int i = 0; i < this.numbers; i++){
			if (id[i] == id[q]) id[i] = id[p];
		}
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
