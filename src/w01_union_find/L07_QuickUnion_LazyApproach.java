package w01_union_find;

public class L07_QuickUnion_LazyApproach {
	private static int N = 25;
	private int[] id;
	
	public L07_QuickUnion_LazyApproach(int[] id) {
		id = new int[N];
		for (int i = 0; i < N; i++){
			id[i] = i;
		}
	}
	
	// my own 
	public int root(int p){
		return id[p] == p ? p : root(id[p]);
	}
	
	public void union(int p, int q){
		id[root(p)] = id[root(q)];
	}
	
	public int[] getResult(){
		return id;
	}
}
