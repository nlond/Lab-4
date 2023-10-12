package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 * IDoubleQueue represents a queue of doubles
   Indexing starts at 0
   Doubles are initialized to 0
 *
 *@initialization Ensures:
 *    Queue contains only 0s and is maxSize or smaller
 *@defines:
 *    length: Z
      
 *@constraints:
 *    0 < length <= maxSize
 */
public interface IDoubleQueue<T>
{

    //This function's contracts are in the individual classes
    public void enqueue(T val);

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
    public T dequeue();

    /**lengthContract
     * Returns an int equal to the queue's length
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
     * converts the doubles in a queue to a string and returns that string
     *
     *@return a string that will list out all of the doubles in a string format.
     *
     *@pre none
     *
     *@post self = #self
     *
     */
    public String toString();

    /**
     *
     *
     *
     */

    public default T peek() {

        T front = dequeue();

        enqueue(front);

        for (int i = 0; i < length()-1; i++) {

            enqueue(dequeue());
        }

        return front;
    }
}
