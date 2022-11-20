public class SinglyLinkedList<T> {
    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(T item) {
        Node<T> node = new Node<T>(item);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void add(int index, T item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> node = new Node<T>(item);
        if (index == 0) {
            node.next = head;
            head = node;
            if (isEmpty()) {
                tail = node;
            }
        } else if (index == size) {
            tail.next = node;
            tail = node;
        } else {
            Node<T> prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            node.next = prev.next;
            prev.next = node;
        }
        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        T item;
        if (index == 0) {
            item = head.data;
            head = head.next;
            if (isEmpty()) {
                tail = null;
            }
        } else {
            Node<T> prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            item = prev.next.data;
            prev.next = prev.next.next;
            if (index == size - 1) {
                tail = prev;
            }
        }
        size--;
        return item;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.data;
    }

    public void set(int index, T item) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        node.data = item;
    }

    public int indexOf(T item) {
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            if (node.data.equals(item)) {
                return i;
            }
            node = node.next;
        }
        return -1;
    }

    public boolean contains(T item) {
        return indexOf(item) != -1;
    }

    @Override
    public String toString() {
        String s = "[";
        Node<T> node = head;
        while (node != null) {
            s += node.data;
            if (node != tail) {
                s += ", ";
            }
            node = node.next;
        }
        s += "]";
        return s;
    }
}