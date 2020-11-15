package prack8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * The implementation of the list WaitList
 *
 * @author
 * @version
 * @param <E>   generic
 */
public class WaitList<E> implements IWaitList<E> {

    /** List of items. */
    protected ConcurrentLinkedQueue<E> content;

    /**
     * Constructor - create a new object.
     */
    public WaitList() {
        this.content = new ConcurrentLinkedQueue<>();
    }

    /**
     * Constructor - create a new object.
     *
     * @param content - list of elements for add in internal list.
     */
    public WaitList(Collection<E> content) {
        this.content = new ConcurrentLinkedQueue<>();
        this.content.addAll(content);
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.remove();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
