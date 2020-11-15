package prack8;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
    }

    public void remove(E element) {
       if (element == content.element()) return;
       content.remove(element);
    }

    void moveToBack(E element) {
        for (E e : content) {
            if (element == e){
                content.remove(element);
                content.add(element);
                return;
            }
        }
    }
}
