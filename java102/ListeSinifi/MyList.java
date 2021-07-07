package liste;

public class MyList<T> {
	private T[] list;
	
	public MyList() {
		list = (T[]) new Object[10];
	}
	
	public MyList(int capacity) {
		list = (T[]) new Object[capacity];
	}
	
	public int size() {
		int count = 0;
		for(T i : list) {
			if(i != null)
				count++;
		}
		return count;
	}
	
	public int getCapacity() {
		return list.length;
	}
	
	public void add(T data) {
		int index = -1;
		for(int i=0; i<list.length; i++) {
			if(list[i] == null) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			index = list.length;
			T[] temp = (T[]) new Object[2*index];
			for(int i=0; i<list.length; i++) 
				temp[i] = list[i];
			
			list = temp;
		}
		
		list[index] = data;
	}
	
	public T get(int index) {
		if(index >= 0 && index < list.length)
			return list[index];
		else
			return null;
	}
	
	public void remove(int index) {
		if(index < 0 || index >= list.length)
			return;
		
		if(index == size()-1) {
			list[index] = null;
			return;
		}
		
		while(list[index] != null && index < list.length - 1)
			list[index] = list[++index];
		
		if(index == list.length-1)
			list[index] = null;
	}
	
	public void set(int index, T data) {
		if(index >= 0 && index < list.length)
			list[index] = data;
	}
	
	public int indexOf(T data) {
//		int size = size();
//		for(int i=0; i<size; i++) {
//			if(list[i] == data)
//				return i;
//		}
//		return -1;
		
		int i=0;
		while(list[i] != null) {
			if(list[i] == data)
				return i;
			i++;
		}
		return -1;
	}
	
	public int lastIndexOf(T data) {
		int last = size()-1;
		for(int i=last; i>=0; i--) {
			if(list[i] == data)
				return i;
		}
		return -1;
	}
	
	public boolean isEmpty() {
		for(T i : list) {
			if(i != null)
				return false;
		}
		return true;
	}
	
	public T[] toArray() {
		int size = size();
		T[] arr = (T[]) new Object[size];
		for(int i=0; i<size; i++) 
			arr[i] = list[i];
		return arr;
	}
	
	public void clear() {
		this.list = (T[]) new Object[10];
	}
	
	public MyList<T> subList(int start, int finish) {
		if(start < 0 || finish > size())
			return null;
		
		MyList<T> result = new MyList<>(finish-start);
		for(int i=start; i<finish; i++)
			result.add(list[i]);
		return result;
	}

	public boolean contains(T data) {
		int size = size();
		for(int i=0; i<size; i++) {
			if(list[i] == data)
				return true;
		}
		return false;
	}
	
	public String toString() {
		int size = size();
		if(size < 1)
			return "[]";
		
		String result="[";
		for(int i=0; i<size; i++) {
				result += list[i];
				result += ", ";
		}
		result = result.substring(0, result.length()-2);
		result += "]";
		return result;
	}
}
