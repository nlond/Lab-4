/*
Team Member Names:
James Moore
Owen Merwarth
Michaeux
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
public class ArrayDoubleQueue implements IDoubleQueue
{
    private Double[] queue;
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

        this.queue = new Double[queueMaxSize];

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
    public void enqueue(Double val)
    {
        queue[index] = val;
        index++;

    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public Double dequeue()
    {

        return (double) 0;
    }

    @Override
    public int length()
    {

        return index;
    }

    public String toString()
    {
        String result = "";

        for (int i = 0; i < index; i++) {

            result += "[" + queue[i] + "] ";
            //System.out.println(queue[i]);

        }
        return result;
    }

    //-----------------Ignore the functions below this line-----------------------
    public int getQueueMaxSize()
    {
        return this.queueMaxSize;
    }

    public Double[] getQueue()
    {
        return this.queue;
    }
}
