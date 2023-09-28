package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 *
 *
 *@initialization Ensures:
 *
 *@defines:
 *
 *@constraints:
 *
 */
public interface IDoubleQueue
{

    //This function's contracts are in the individual classes
    public void enqueue(Double val);

    /**dequeueContract
     *Removes the first double in the queue and returns it
     *
     *@return the first double in the queue that was removed
     *
     *@pre none 
     *
     *@post [self = #self, excpet the first double in the queue is removed] 
     *
     */
    public Double dequeue();

    /**lengthContract
     *
     *
     *@return integer representing the length of the queue
     *
     *@pre queueMinSize > 0
     *
     *@post self = #self 
     *
     */
    public int length();

    /**toStringContract
     *
     *
     *@return
     *
     *@pre
     *
     *@post
     *
     */
    public String toString();
}
