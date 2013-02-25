
public class Deque<Item> implements Iterable<Item> {
    
    private Node first, last;
    private int size = 0;
    
    // construct an empty deque
    public Deque(){}
    
    private class Node
   {
      Item item;
      Node next;
      Node befo;
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
        if(item==null)
            throw new NullPointerException("Can't add a null Item.");
        
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.befo = oldfirst;
        if(oldfirst!=null)
            oldfirst.next = first;
        if(last==null)
            last = first;
        size++;
    }
    
    // insert the item at the end
    public void addLast(Item item){
        if(item==null)
            throw new NullPointerException("Can't add a null Item.");
        
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = oldlast;
        if(oldlast!=null)
            oldlast.befo = last;
        if(first==null)
            first = last;
        size++;
    }
    
    // delete and return the item at the front
    public Item removeFirst(){
        if(isEmpty())
            throw new java.util.NoSuchElementException("Deque is empty.");
        
        Item item = first.item;
        first = first.befo;
        if(first==null)
            last = first;
        size--;
        
        return item;
    }
    
    // delete and return the item at the end
    public Item removeLast(){
        if(isEmpty())
            throw new java.util.NoSuchElementException("Deque is empty.");
        
        Item item = last.item;
        last = last.next;
        if(last==null)
            first = last;
        size--;
        
        return item;
    }
    
    // return an iterator over items in order from front to end
    public java.util.Iterator<Item> iterator(){
        return null;
    }
}