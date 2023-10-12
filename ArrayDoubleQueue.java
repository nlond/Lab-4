/*
Team Member Names:
James Moore
Owen Merwarth
Micheaux Simmons
Nathan Londhe
*/


package com.gradescope.DoubleQueue.code;

/**ArrayDoubleQueueContract
 * Array implementation for the Double queue.
 *
 * @invariant: queueMaxSize > 0
 *
 * @corresponds: max_queue_size = queueMaxSize
 *
 */
public class ArrayDoubleQueue<T> implements IDoubleQueue<T>
{
    private T[] queue;
    private int queueMaxSize;
    private int index = 0;


    /**ArrayDoubleQueueConstructorContact
     * Constructor for the arrayListDouble queue.
     *
     * @param maxSize max size of the array
     *
     * @pre maxSize > 0
     *
     * @post queueMaxSize = maxSize AND self = new Double[queueMaxSize].
     *
     */
    public ArrayDoubleQueue(int maxSize)
    {
        this.queueMaxSize = maxSize;

        this.queue = (T[]) new Object[queueMaxSize];

    }

    /**enqueueContact
     * Enqueue adds an item to the queue.
     *
     * @param val the Double to be added
     *
     * @pre |self| < queueMaxSize
     *
     * @post [self = #self with val added to left-most unoccupied index] AND queueMaxSize = #queueMaxSize
     *
     */
    @Override
    public void enqueue(T val)
    {
        queue[index] = val;
        index++;
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public T dequeue()
    {
        if (index == 0) {
            return null;
        }

        T removedElement = queue[0];

        for (int i = 1; i < index; i++)  {

            queue[i-1] = queue[i];
        }
        queue[index - 1] = null;

        index--;

        return removedElement;
    }

    @Override
    public int length()
    {
        return index;
    }

    public String toString()
    {
        String result = "";

        for (int i = 0; i < queueMaxSize; i++) {

            result += ("[" + queue[i] + "] ");

        }
        return result;
    }

    //-----------------Ignore the functions below this line-----------------------
    public int getQueueMaxSize()
    {
        return this.queueMaxSize;
    }

    public T[] getQueue()
    {
        return this.queue;
    }
}
