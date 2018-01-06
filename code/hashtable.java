public class Hashtable<AnyType> {
    private AnyType[] array;
    private int tablesize;

    public Hashtable<AnyType>() {
        tablesize = 11;
        array = new AnyType[tablesize];
    }

    public Hashtable<AnyType(int tsize) {
        tablesize = tsize;
        array = new AnyType[tablesize];
    }

    // hash function takes in key and tablesize 
    public int hash(Integer key) {
        return key % tablesize;
    }

    public AnyType get(int key) {
        return array[key];
    }

    public void put(int key, AnyType val) {
       try {
            int hashval = hash(key);
            // collision handling
            while (array[hashval] != null) {
                hashval = (hashval + 1) % tablesize; //linear probing where f(i)=i
            }
            array[hashval] = val;     
       }
       catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
       }
    }
}
