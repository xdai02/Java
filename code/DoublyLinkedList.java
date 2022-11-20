public class DoublyLinkedList<T> {
    private class Node<T> {
        private T data;
        private Node<T> prev;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoublyLinkedList() {
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
            node.prev = tail;
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
            head.prev = node;
            head = node;
            if (isEmpty()) {
                tail = node;
            }
        } else if (index == size) {
            tail.next = node;
            node.prev = tail;
            tail = node;
        } else {
            Node<T> prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            Node<T> next = prev.next;
            prev.next = node;
            node.prev = prev;
            node.next = next;
            next.prev = node;
        }
        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        T data;
        if (index == 0) {
            data = head.data;
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            if (size == 1) {
                tail = null;
            }
        } else if (index == size - 1) {
            data = tail.data;
            tail = tail.prev;
            tail.next = null;
        } else {
            Node<T> prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            Node<T> node = prev.next;
            data = node.data;
            Node<T> next = node.next;
            prev.next = next;
            next.prev = prev;
        }
        size--;
        return data;
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
            if (node.next != null) {
                s += ", ";
            }
            node = node.next;
        }
        s += "]";
        return s;
    }
}