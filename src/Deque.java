
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
    public void addFirst(Item item){}
    
    // insert the item at the end
    public void addLast(Item item){}
    
    // delete and return the item at the front
    public Item removeFirst(){
        return null;
    }
    
    // delete and return the item at the end
    public Item removeLast(){
        return null;
    }
    
    // return an iterator over items in order from front to end
    public java.util.Iterator<Item> iterator(){
        return null;
    }
}