
public class Deque<Item> implements Iterable<Item> {
    
    // construct an empty deque
    public Deque(){}
    
    // is the deque empty?
    public boolean isEmpty(){
        return true;
    }
    
    // return the number of items on the deque
    public int size(){
        return 0;
    }
    
    // insert the item at the front
    public void addFirst(Item item){
        if(item==null) throw new NullPointerException("Can't add a null Item.");
    }
    
    // insert the item at the end
    public void addLast(Item item){
        if(item==null) throw new NullPointerException("Can't add a null Item.");
    }
    
    // delete and return the item at the front
    public Item removeFirst(){
        throw new java.util.NoSuchElementException("Deque is empty.");
    }
    
    // delete and return the item at the end
    public Item removeLast(){
        throw new java.util.NoSuchElementException("Deque is empty.");
    }
    
    // return an iterator over items in order from front to end
    public java.util.Iterator<Item> iterator(){
        return null;
    }
}