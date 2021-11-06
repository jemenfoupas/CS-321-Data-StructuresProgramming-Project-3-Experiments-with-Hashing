import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public abstract class HashTable<T> {
	
	protected HashObject<T>[] array;
	protected int size;
	
	@SuppressWarnings("unchecked")
	public HashTable(int size) {
		this.array = new  HashObject[size];
		this.size = 0;
	}
	
	/*
	 * this method add the key to the table
	 */
	public int HashInsert(T key) {
		
		int i = 0;
		int m = array.length;
		int j;
		
		while(i < m) {
			
			j = hashFunction(key, i);
			
			if(array[j] == null) {
				array[j] = new HashObject<T>( i + 1, key);
				size++;
				return j;
			} else if(array[j].equals(key)){
				array[j].increaseF();
				return j;
			} else {
				i++;
			}
		}
		
		return -1;
	}
	
	public abstract int hashFunction(T key, int i);
	
	public double getLoad() {
		return (double)size/array.length;
	}
	
	public int positiveMod(int dividend, int divisor) {
		int value = dividend % divisor;
		
		if(value < 0) {
			value += divisor;
		}
		
		return value;
	}
	
	/*
	 * this returns the number of duplicates they are for every key
	 */
	public int getDuplicates() {
		int duplicate = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null) duplicate += array[i].getFrequency();
		}
		
		return duplicate;
	}
	
	public double getAvg() {
		double av = 0;
		
		for(int i = 0;  i < array.length; i++) {
			if(array[i] != null) av += array[i].getCount();
		}
		
		return av / size;
	}
	
	public void dump(String fileName) throws FileNotFoundException {
		
		PrintStream ps = new PrintStream(new File(fileName));
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] != null) {
				ps.append("table["+ i +"]: " + array[i].toString() +"\n");
			}
		}
		
		System.setOut(ps);
		ps.close();
	}
}