package Task8;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList <E> implements IWaitList <E> {
    protected ConcurrentLinkedDeque<E> content;

    public WaitList() {
        content = new ConcurrentLinkedDeque<>();
    }

    public WaitList(Collection<E> c) {
        content = new ConcurrentLinkedDeque<>(c);
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
