package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	private T[] t;
	
	public ArrayList() {
		t = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return t[loc];
		
	}	
	
	public void add(T val) {
		T[] add = (T[]) new Object[t.length + 1];
		for(int i = 0; i < t.length; i ++) {
			add[i] = t[i];
		}
		add[add.length - 1] = val;
		t = add;
		
	}
	//0 1 2 3 4
	//D I G O
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] insert = (T[]) new Object[t.length + 1];
		
		for(int i = 0; i < loc; i ++) {
			insert[i] = t[i];			
		}
		
		insert[loc] = val;
		
		for(int i = loc; i < t.length; i ++) {
			insert[i+1] = t[i];
		}
		
		t = insert;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] set = (T[]) new Object[t.length];
		
		for(int i = 0; i < loc; i ++) {
			set[i] = t[i];
		}
		set[loc] = val;
		
		for(int i = loc+1; i < t.length; i ++) {
			set[i] = t[i];
		}
		
		t = set;
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] remove = (T[]) new Object[t.length-1];
		for(int i = 0; i < loc; i ++) {
			remove[i] = t[i];
		}
		for(int i = loc; i < t.length - 1; i ++) {
			remove[i] = t[i + 1];
		}
	
		t = remove;
		
		
	}
	
	public boolean contains(T val) {
		for(int i = 0; i < t.length ; i ++) {
			if(t[i] == val) {
				return true;
			}
		}
		return false;
	}
	public int size() {
		return t.length;
	}
}