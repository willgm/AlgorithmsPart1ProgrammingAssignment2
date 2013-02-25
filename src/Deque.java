
public class Deque<Item> implements Iterable<Item> {
    
    private Node first, last;
    private int size = 0;
    
    // construct an empty deque
    public Deque(){}
    
    private class Node
   {
      Item item;
      Node next;
   }
    
    // is the deque empty?
    public boolean isEmpty(){
        return first==null;
    }
    
    // return the number of items on the deque
    public int size(){
        return size;
    }
    
    // insert the item at the front
    public void addFirst(Item item){
        if(item==null) throw new NullPointerException("Can't add a null Item.");
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        size++;
    }
    
    // insert the item at the end
    public void addLast(Item item){
        if(item==null) throw new NullPointerException("Can't add a null Item.");
    }
    
    // delete and return the item at the front
    public Item removeFirst(){
        if(first==null) throw new java.util.NoSuchElementException("Deque is empty.");
        Item item = first.item;
        first = first.next;
        size--;
        return item;
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