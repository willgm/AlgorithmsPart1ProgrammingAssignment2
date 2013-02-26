
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
        first.next = oldfirst;
        if(oldfirst!=null)
            oldfirst.befo = first;
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
        last.befo = oldlast;
        if(oldlast!=null)
            oldlast.next = last;
        if(first==null)
            first = last;
        size++;
    }
    
    // delete and return the item at the front
    public Item removeFirst(){
        if(isEmpty())
            throw new java.util.NoSuchElementException("Deque is empty.");
        
        Node oldFirst = first;
        Item item = oldFirst.item;
        first = oldFirst.next;
        if(first==null)
            last = first;
        size--;
        
        cleanRefTo(oldFirst);
        
        return item;
    }
    
    // delete and return the item at the end
    public Item removeLast(){
        if(isEmpty())
            throw new java.util.NoSuchElementException("Deque is empty.");
        
        Node oldLast = last;
        Item item = oldLast.item;
        last = oldLast.befo;
        if(last==null)
            first = last;
        size--;
        
        cleanRefTo(oldLast);
        
        return item;
    }
    
    private void cleanRefTo(Node n){
        if(n.befo!=null){
            n.befo.next = null;
            n.befo = null;
        }
        if(n.next!=null){
            n.next.befo = null;
            n.next = null;
        }
        n.item = null;
    }
    
    // return an iterator over items in order from front to end
    public java.util.Iterator<Item> iterator(){
        return new DequeIterator();
    }
    
    private class DequeIterator implements java.util.Iterator<Item>
    {
        private Node current = first;
        public boolean hasNext(){
            return current != null;
        }
        public void remove(){
            throw new UnsupportedOperationException();
        }      
        public Item next(){
            Item item = current.item;
            current   = current.next; 
            return item;
        }
    }
}