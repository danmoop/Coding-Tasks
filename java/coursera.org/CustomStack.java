import java.util.EmptyStackException;

class CustomStack<T>
{
    // First element in a stack, it is null by default
    private Node first = null;

    // a local class
    public class Node
    {
        T object;
        Node next;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public T clear()
    {
        T item = first.object;

        first = null;

        return item;
    }

    public T push(T object)
    {
        Node oldFirst = first;

        first = new Node();

        first.next = oldFirst;
        first.object = object;

        return object;
    }

    public T pop()
    {
        if (isEmpty())
            throw new EmptyStackException();

        T item = first.object;

        first = first.next;

        return item;
    }

    public int size()
    {
        if (first == null) return 0;

        int size = 1;

        Node element = first;

        // while last element is not reached
        while (element.next != null)
        {
            size++;

            element = element.next;
        }

        return size;
    }
}