import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class HashTableTest {

	
	public HashTableTest() {
		
	}

	public static void main(String[] args) {
		
		double loadF = Double.parseDouble(args[1]);
		TwinPrimeGenerator prime = new TwinPrimeGenerator();
			
		try {
			if(args[0].equals("1")) {
				
				Random rand = new Random();
				rand.nextInt();
				
				Linear<Integer> L = new Linear<Integer>(prime.getPrime());
				DoubleHashing<Integer> H = new DoubleHashing<Integer>(prime.getPrime());
				
				int i = 0;
				
				while(L.getLoad() < loadF) {
					int j = rand.nextInt();
					
					L.HashInsert(j);
					H.HashInsert(j);
					i++;
				}
				
				if(args.length < 3) {
					
					System.out.println("HashtableTest: Twin prime table size found in the range [95500..96000]: " + prime.getPrime());
					System.out.println();
					System.out.println("HashtableTest: Data source type --> java.util.Random");
					System.out.println();
					System.out.println("HashtableTest: Using Linear Hashing....");
					System.out.println("HashtableTest: Input "+ i +" elements, of which "+ L.getDuplicates() +" duplicates");
					System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ L.getAvg());
					System.out.println("");
					System.out.println("HashtableTest: Using Double Hashing....");
					System.out.println("HashtableTest: Input "+ i +" elements, of which "+ H.getDuplicates() +" duplicates");
					System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ H.getAvg());
					
				} else {
					
					if(args[2].equals("0")) {
						
						System.out.println("HashtableTest: Twin prime table size found in the range [95500..96000]: " + prime.getPrime());
						System.out.println();
						System.out.println("HashtableTest: Data source type --> java.util.Random");
						System.out.println();
						System.out.println("HashtableTest: Using Linear Hashing....");
						System.out.println("HashtableTest: Input "+ i +" elements, of which "+ L.getDuplicates() +" duplicates");
						System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ L.getAvg());
						System.out.println("");
						System.out.println("HashtableTest: Using Double Hashing....");
						System.out.println("HashtableTest: Input "+ i +" elements, of which "+ H.getDuplicates() +" duplicates");
						System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ H.getAvg());
						
					} else if(args[2].equals("1")) {
						
						System.out.println("HashtableTest: Twin prime table size found in the range [95500..96000]: " + prime.getPrime());
						System.out.println();
						System.out.println("HashtableTest: Data source type --> java.util.Random");
						System.out.println();
						System.out.println("HashtableTest: Using Linear Hashing....");
						System.out.println("HashtableTest: Input "+ i +" elements, of which "+ L.getDuplicates() +" duplicates");
						System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ L.getAvg());
						System.out.println("");
						System.out.println("HashtableTest: Using Double Hashing....");
						System.out.println("HashtableTest: Input "+ i +" elements, of which "+ H.getDuplicates() +" duplicates");
						System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ H.getAvg());
						
						L.dump("linear-dump.txt");
						H.dump("double-dump.txt");
						
					} else if(args[2].equals("2")) {
						
						for(int num = 0; num < prime.getPrime(); num++) {
							
							if(L.array[num] != null) {
								System.out.println("linear table["+ num +"]: " + L.array[num].toString() );
							}
							
							if(H.array[num] != null) {
								System.out.println("double hashing table["+ num +"]: " + H.array[num].toString() );
							}
							
						}
						
					}
				}
				
			}
			
			if(args[0].equals("2")) {
				
				Linear<Long> L = new Linear<Long>(prime.getPrime());
				DoubleHashing<Long> H = new DoubleHashing<Long>(prime.getPrime());
				
				int i = 0;
				
				while(L.getLoad() < loadF) {
					Long j = System.currentTimeMillis();
					L.HashInsert(j);
					H.HashInsert(j);
					Thread.sleep(1);
					i++;
				}
				
				if(args.length < 3) {
					
					System.out.println("HashtableTest: Twin prime table size found in the range [95500..96000]: " + prime.getPrime());
					System.out.println();
					System.out.println("HashtableTest: Data source type --> System.currentTimeMillis()");
					System.out.println();
					System.out.println("HashtableTest: Using Linear Hashing....");
					System.out.println("HashtableTest: Input "+ i +" elements, of which "+ L.getDuplicates() +" duplicates");
					System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ L.getAvg());
					System.out.println("");
					System.out.println("HashtableTest: Using Double Hashing....");
					System.out.println("HashtableTest: Input "+ i +" elements, of which "+ H.getDuplicates() +" duplicates");
					System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ H.getAvg());
					
				} else {
					
					if(args[2].equals("0")) {
						
						System.out.println("HashtableTest: Twin prime table size found in the range [95500..96000]: " + prime.getPrime());
						System.out.println();
						System.out.println("HashtableTest: Data source type --> System.currentTimeMillis()");
						System.out.println();
						System.out.println("HashtableTest: Using Linear Hashing....");
						System.out.println("HashtableTest: Input "+ i +" elements, of which "+ L.getDuplicates() +" duplicates");
						System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ L.getAvg());
						System.out.println("");
						System.out.println("HashtableTest: Using Double Hashing....");
						System.out.println("HashtableTest: Input "+ i +" elements, of which "+ H.getDuplicates() +" duplicates");
						System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ H.getAvg());
						
					} else if(args[2].equals("1")) {
						
						System.out.println("HashtableTest: Twin prime table size found in the range [95500..96000]: " + prime.getPrime());
						System.out.println();
						System.out.println("HashtableTest: Data source type --> System.currentTimeMillis()");
						System.out.println();
						System.out.println("HashtableTest: Using Linear Hashing....");
						System.out.println("HashtableTest: Input "+ i +" elements, of which "+ L.getDuplicates() +" duplicates");
						System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ L.getAvg());
						System.out.println("");
						System.out.println("HashtableTest: Using Double Hashing....");
						System.out.println("HashtableTest: Input "+ i +" elements, of which "+ H.getDuplicates() +" duplicates");
						System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ H.getAvg());
						
						L.dump("linear-dump.txt");
						H.dump("double-dump.txt");
						
					} else if(args[2].equals("2")) {
						
						for(int num = 0; num < prime.getPrime(); num++) {
							
							if(L.array[num] != null) {
								System.out.println("linear table["+ num +"]: " + L.array[num].toString() );
							}
							
							if(H.array[num] != null) {
								System.out.println("double hashing table["+ num +"]: " + H.array[num].toString() );
							}
							
						}
					}
				}
				
			}
			
			if(args[0].equals("3")) {
				File file = new File("word-list");
				Scanner scan = new Scanner(file);
				
				Linear<String> L = new Linear<String>(prime.getPrime());
				DoubleHashing<String> H = new DoubleHashing<String>(prime.getPrime());
				
				int i = 0;
				while(scan.hasNext() && L.getLoad() < loadF) {
					String str = scan.nextLine();
					L.HashInsert(str);
					H.HashInsert(str);
					i++;
				}
				
				
				if(args.length < 3) {
					
					System.out.println("HashtableTest: Twin prime table size found in the range [95500..96000]: " + prime.getPrime());
					System.out.println();
					System.out.println("HashtableTest: Data source type --> word-list");
					System.out.println();
					System.out.println("HashtableTest: Using Linear Hashing....");
					System.out.println("HashtableTest: Input "+ i +" elements, of which "+ L.getDuplicates() +" duplicates");
					System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ L.getAvg());
					System.out.println("");
					System.out.println("HashtableTest: Using Double Hashing....");
					System.out.println("HashtableTest: Input "+ i +" elements, of which "+ H.getDuplicates() +" duplicates");
					System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ H.getAvg());
					
				} else {
					
					if(args[2].equals("0")) {
						
						System.out.println("HashtableTest: Twin prime table size found in the range [95500..96000]: " + prime.getPrime());
						System.out.println();
						System.out.println("HashtableTest: Data source type --> word-list");
						System.out.println();
						System.out.println("HashtableTest: Using Linear Hashing....");
						System.out.println("HashtableTest: Input "+ i +" elements, of which "+ L.getDuplicates() +" duplicates");
						System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ L.getAvg());
						System.out.println("");
						System.out.println("HashtableTest: Using Double Hashing....");
						System.out.println("HashtableTest: Input "+ i +" elements, of which "+ H.getDuplicates() +" duplicates");
						System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ H.getAvg());
						
					} else if(args[2].equals("1")) {
						
						System.out.println("HashtableTest: Twin prime table size found in the range [95500..96000]: " + prime.getPrime());
						System.out.println();
						System.out.println("HashtableTest: Data source type --> word-list");
						System.out.println();
						System.out.println("HashtableTest: Using Linear Hashing....");
						System.out.println("HashtableTest: Input "+ i +" elements, of which "+ L.getDuplicates() +" duplicates");
						System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ L.getAvg());
						System.out.println("");
						System.out.println("HashtableTest: Using Double Hashing....");
						System.out.println("HashtableTest: Input "+ i +" elements, of which "+ H.getDuplicates() +" duplicates");
						System.out.println("HashtableTest: load factor = "+ args[1] +", Avg. no. of probes "+ H.getAvg());
						
						L.dump("linear-dump.txt");
						H.dump("double-dump.txt");
						
					} else if(args[2].equals("2")) {
						
						for(int num = 0; num < prime.getPrime(); num++) {
							
							if(L.array[num] != null) {
								System.out.println("linear table["+ num +"]: " + L.array[num].toString() );
							}
							
							if(H.array[num] != null) {
								System.out.println("double hashing table["+ num +"]: " + H.array[num].toString() );
							}
							
						}
					}
				}
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
