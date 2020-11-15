package prack8;

import java.util.Collection;

/**
 * Main interface.
 *
 * @author      Your name
 * @version     1.0
 * @param <E>   generic
 */
public interface IWaitList<E> {

    /**
     *
     * @param element - element for add
     */
    void add(E element);

    /**
     * Function to get object.
     * @return returns the deleted object.
     */
    E remove();

    /**
     * Function to get result.
     * @param element - element for check consist.
     * @return result consist element in list or not;
     */
    boolean contains(E element);

    /**
     * Function to get result.
     * @param c - list elements for check consist.
     * @return result consist elements in list or not;
     */
    boolean containsAll(Collection<E> c);

    /**
     * Function to get result.
     * @return is empty list.
     */
    boolean isEmpty();
}
