/* Usage example
 *
 *        CustomQueue<Integer> queue = new CustomQueue<>();
 *
 *        queue.enqueue(50);  // 1st
 *        queue.enqueue(100); // 2nd
 *        queue.enqueue(150); // 3rd
 *        queue.enqueue(200); // 4th
 *
 *        queue.dequeue(); // 50,  {100, 150, 200} | 1st step
 *        queue.dequeue(); // 100, {150, 200}      | 2nd step
 *        queue.dequeue(); // 150, {200}           | 3rd step
 *        queue.dequeue(); // 200, {null}          | 4th step
 *
 *        // All elements are gone
 *        System.out.println(queue.size()); // 0
 * */

public class CustomQueue<T>
{
    private Node first = null, last = null;

    private class Node
    {
        T e;
        Node next;
    }

    // O(1)
    public boolean isEmpty()
    {
        return first == null;
    }

    // O(1)
    public void enqueue(T e)
    {
        if (isEmpty())
        {
            last = new Node();
            last.e = e;
            first = last;
        }
        else
        {
            Node newLast = new Node();
            newLast.e = e;
            last.next = newLast;
            last = last.next;
        }
    }

    // O(1)
    public T dequeue()
    {
        if (!isEmpty())
        {
            T item = first.e;

            first = first.next;

            return item;
        }

        return null;
    }

    // O(n)
    public int size()
    {
        if (isEmpty())
            return 0;

        Node element = first;
        int size = 1;

        while (element.next != null)
        {
            element = element.next;
            size++;
        }

        return size;
    }
}