
public class HashObject<T> {

	protected int frequency;
	protected int count;
	protected T key;
	
	public HashObject( int count, T key) {
		this.frequency = 0;
		this.count = count;
		this.key = key;
	}
	
	/*
	 * this returns the key
	 * @return T
	 */
	public T getKey() {
		
		return this.key;
	}
	
	
	/*
	 * this returns the frequency
	 */
	public int getFrequency() {
		return this.frequency;
	}
	
	/*
	 * this returns the probe count
	 */
	public int getCount() {
		return this.count;
	}
	
	/*
	 * this increments the frequency
	 */
	public void increaseF() {
		this.frequency++;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(this.key.equals(o)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		return String.valueOf(key) +" "+ String.valueOf(frequency) +" "+ String.valueOf(count);
	}
}
