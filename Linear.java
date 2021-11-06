
public class Linear<T> extends HashTable<T>{

	public Linear(int size) {
		super(size);
	}

	@Override
	public int hashFunction(T key, int i) {
		
		return positiveMod((key.hashCode() + i), array.length);
	}
	
	

}
