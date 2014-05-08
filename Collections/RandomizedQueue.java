package colections.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RandomizedQueue<Item> implements Iterable<Item> {
    
    private List<Item> queue;
    private int queueSize;

    private Random generator = new Random(10);

    //construct an empty randomized queue
    public RandomizedQueue() {
        queueSize = 0;
        queue =  new ArrayList <Item>();
    }

    //is the queue empty?
    public boolean isEmpty() {
        return queueSize == 0;
    }

    // return the number of items on the queue
    public int size() {
        return queueSize;
    }

    // add the item
    public void enqueue(Item item) {
        //if the element is null
        if (item == null)
            throw new java.lang.NullPointerException();

        queue.add(item);
        queueSize++;
    }

    //delete and return a random item
    public Item dequeue() {
        //if the queue is empty
        if (isEmpty())
            throw new java.util.NoSuchElementException();

        //generating a random element
        int i = generator.nextInt(queueSize);
        Item random = queue.get(i);

        //deleting the element
        queue.remove(i);
        queueSize--;

        return random;
    }

    // return (but do not delete) a random item
    public Item sample() {
        if (isEmpty())
            throw new java.util.NoSuchElementException();

        int i = generator.nextInt(queueSize);
        return queue.get(i);
    }

    // return an independent iterator over items in random order
    public Iterator<Item> iterator() {
        return new ListIterator();
    }


    public class ListIterator implements Iterator<Item> {

        private int current = 0;

        public ListIterator() {
            Collections.shuffle(queue);
        }

        public boolean hasNext() {
            return current < queueSize;
        }

        public Item next() {
            if (current >= queueSize || size() == 0)
                throw new java.util.NoSuchElementException();


            return queue.get(current++);
        }

        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }


    public static void main (String[] args){
        RandomizedQueue<Integer> random = new RandomizedQueue<Integer>();
        random.enqueue(5);
        random.enqueue(1);
        random.enqueue(8);
        random.enqueue(3);
        random.enqueue(0);
        random.dequeue();


        Iterator <Integer> iterator = random.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}

