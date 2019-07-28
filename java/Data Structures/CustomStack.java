import org.jetbrains.annotations.NotNull;

import java.util.EmptyStackException;
import java.util.Iterator;

public class CustomStack<Item> implements Iterable<Item>
{
    private Node first = null;

    class Node
    {
        Item item;
        Node next;
    }

    @NotNull
    @Override
    public Iterator<Item> iterator()
    {
        return new Iterator<Item>()
        {
            Node current = first;

            @Override
            public boolean hasNext()
            {
                return current != null;
            }

            @Override
            public Item next()
            {
                Item item = current.item;

                current = current.next;

                return item;
            }
        };
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public void push(Item item)
    {
        Node oldFirst = first;

        first = new Node();
        first.next = oldFirst;
        first.item = item;
    }

    public Item pop()
    {
        if (isEmpty())
            throw new EmptyStackException();
        
        Item item = first.item;

        first = first.next;

        return item;
    }

    public int size()
    {
        if (isEmpty())
            return 0;

        int size = 1;

        Node element = first;

        while (element.next != null)
        {
            size++;

            element = element.next;
        }

        return size;
    }
}