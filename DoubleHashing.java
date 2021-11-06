
public class DoubleHashing<T> extends HashTable<T>{

	public DoubleHashing(int size) {
		super(size);
	}

	@Override
	public int hashFunction(T key, int i) {
		
		int h1 = positiveMod(key.hashCode(), array.length);
		int h2 = 1 + (positiveMod(key.hashCode(), array.length - 2));
		
		return positiveMod( h1 + (i * h2), array.length);
	}

}
