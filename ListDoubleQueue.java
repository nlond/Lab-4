package com.gradescope.DoubleQueue.code;

import java.util.ArrayList;

/**ListDoubleQueueContract
 * List implementation for the double queue
 *
 * @invariant: maxListSize > 0
 *
 * @corresponds: max_queue_size = maxListSize
 *
 */
public class ListDoubleQueue<T> implements IDoubleQueue<T>
{
    private ArrayList<T> LQueue;
    private int maxListSize;

    /**ListDoubleQueueConstructorContact
     * Constructor for the double queue with arrayList backend
     *
     * @param maxSize
     *
     * @pre none
     *
     * @post self = new ArrayList<Double>() AND maxListSize = maxSize
     *
     */
    public ListDoubleQueue(int maxSize)
    {
        this.LQueue = new ArrayList<T>();
        this.maxListSize = maxSize;
    }

    /**enqueueContact
     * Enqueue adds an item to the queue
     *
     * @param val
     *
     * @pre none 
     *
     * @post [adds val to the end of the list IFF LQueue.size < maxSize]
     
     [overwrites the last double of the list with val IFF LQueue.size = maxSize]
     
      AND maxListSize = #maxListSize
     *
     */
    @Override
    public void enqueue(T val)
    {
        if(LQueue.size() == this.maxListSize)
            LQueue.set(this.maxListSize-1, val);
        else
            LQueue.add(val);
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public T dequeue()
    {
        return LQueue.remove(0);
    }


    @Override
    public int length()
    {
        return LQueue.size();
    }


    public String toString()
    {
        String ret = "";
        for(T d : LQueue)
        {
            ret += ("[" + d + "] ");
        }
        return ret;
    }

}
