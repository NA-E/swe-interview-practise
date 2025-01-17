class MyCircularQueue {

    private int size, front = 0, rear = -1, count = 0;
    private int[] queue;
    
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        size = k;
        queue = new int[size];
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (count == size) return false;
        
        rear = ++rear % size;
        queue[rear] = value;
        count++;
        
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (count == 0) return false;
        
        front = ++front % size;
        count--;
        
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        return count == 0 ? -1 : queue[front];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        return count == 0 ? -1 : queue[rear];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return count == 0;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return count == size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */