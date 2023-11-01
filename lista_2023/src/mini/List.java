package mini;

public class List<T> {

    private class node<T> {
        private T data;
        private node<T> next;

    }

    private node<T> head;

    public List() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        node<T> temp = head;

        while (temp != null) {
            if (temp != null) {
                count++;
                temp = temp.next;
            }
        }
        return count;
    }

    public T first() {
        return head.data;
    }

    public void pushFront(T data) {
        node<T> n = new node<>();
        n.data = data;
        n.next = head;
        head = n;
    }

    public void popFront() {
        if (isEmpty()) {
            return;
        }
        head = head.next;
    }

    public void pushBack(T data) {
        node<T> n = new node<>();
        n.data = data;
        if (head == null) {
            head = n;
            return;
        }

        node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;

    }

    public void popBack() {
        if (head == null) {
            return;
        }

        node<T> temp = head;
        node<T> temp2 = head.next;

        while (temp2.next != null) {
            temp = temp.next;
            temp2 = temp2.next;
        }
        temp.next = null;
    }

    public int find(T data) {
        int n = 0;
        node<T> temp = this.head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return n;
            }
            temp = temp.next;
            n++;
        }
        return -1;
    }

    public node findNode(node node) {
        node<T> temp = this.head;
        while (temp != null) {
            if (temp.equals(node)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void insertBefore(T beforeData, T data) {
        node<T> newNode = new node<>();
        newNode.data = data;
        int ind = this.find(beforeData) - 1;
        int n = 0;
        node<T> temp = head;

        while (temp != null) {
            if (n == ind) {
                node<T> after = temp.next;
                temp.next = newNode;
                newNode.next = after;
                return;
            }
            temp = temp.next;
            n++;
        }

    }

    public void insertAfter(T afterData, T data) {
        node<T> newNode = new node<>();
        newNode.data = data;
        int ind = this.find(afterData);
        int n = 0;
        node<T> temp = head;

        while (temp != null) {
            if (n == ind) {
                if (temp.next == null){
                    temp.next = newNode;
                } else {
                    node<T> nodeAfter = temp.next;
                    temp.next = newNode;
                    newNode.next = nodeAfter;
                }
                return;
            }
            temp = temp.next;
            n++;
        }
    }

    @Override
    public String toString() {
        String string = "Lista: ";
        node<T> temp = head;

        while (temp != null) {
            string += temp.data + " ";
            temp = temp.next;
        }
        return string;
    }
}
