import org.w3c.dom.Node;

/**
 * MyCustomHashMap
 */
class MyCustomHashMap<K, V> {

    static class Node<K, V> {
        K key;
        V value;
        Node next;
        int hash;

        public Node(K key, V value, int hash) {
            this.key = key;
            this.value = value;
            this.hash = hash;

        }

    }

    private Node<K, V>[] table;

    public MyCustomHashMap() {
        this.table = new Node[16];
    }

    private int hash(K key) {
        return (key == null) ? 0 : key.hashCode();
    }

    private int index(int hash) {
        return Math.abs(hash) % table.length;
    }


    public void put(K key , V value)
    {
        int hash = hash(key);
        int index = index(hash);


        Node<K,V> currNode = table[index];

        //no collission
        if (currNode == null) {
            table[index] = new Node<K, V>(key, value, hash);
            return;
        }


        while (true) {
            

            if (currNode.key == key && currNode.hash== hash) {
                currNode.value = value;
                return;
            }


            if (currNode.next == null) {
                break;
            }


            currNode = currNode.next;
        }

        currNode.next = new Node<K,V>(key, value, hash);


    }


    public V get(K key){
        int hash = hash(key);
        int index = index(hash);

        Node<K,V> cuNode = table[index];
      


        while (cuNode != null) {
            if (cuNode.hash == hash && cuNode.key ==key) {
                return cuNode.value;  
            }
            cuNode = cuNode.next;
        }

        return null;
    }
}

public class HashMapImple {

   public static void main(String[] args) {
     MyCustomHashMap<String, Integer>  hashMap = new MyCustomHashMap();
     hashMap.put("ayush",12);
     hashMap.put("ayush",15);
     hashMap.put("ayushre",12);


     System.out.println(hashMap.get("ayushre"));
   } 
}