public class RandomizedQueue<Item> implements Iterable<Item> {
    
    // construct an empty randomized queue
    public RandomizedQueue(){}
    
    // is the queue empty?
    public boolean isEmpty(){
        return true;
    }
    
    // return the number of items on the queue
    public int size(){
        return 0;
    }
    
    // add the item
    public void enqueue(Item item){
        if(item==null)
            throw new NullPointerException("Can't add a null Item.");
    
    }
    
    // delete and return a random item
    public Item dequeue(){
        if(isEmpty())
            throw new java.util.NoSuchElementException("RandomizedQueue is empty.");
        return null;
    }
    
    // return (but do not delete) a random item
    public Item sample(){
        if(isEmpty())
            throw new java.util.NoSuchElementException("RandomizedQueue is empty.");
        return null;
    }
    
    // return an independent iterator over items in random order
    public java.util.Iterator<Item> iterator(){
        return null;
    }
    
}