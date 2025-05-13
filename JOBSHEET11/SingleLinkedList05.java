package JOBSHEET11;
public class SingleLinkedList05 {
    Node05 head;
    Node05 tail;

    boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node05 tmp = head;
            System.out.print("\nIsi Linked List:\n");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next; 
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(Mahasiswa05 input) {
        Node05 ndInput = new Node05(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa05 input) {
        Node05 ndInput = new Node05(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa05 input) {
        Node05 ndInput = new Node05(input, null);
        Node05 tmp = head;
        do {
            if (tmp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = tmp.next;
                tmp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            } 
            tmp = tmp.next;    
        } while (tmp != null);
    }

    public void insertAt(int index, Mahasiswa05 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node05 tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = new Node05(input, tmp.next);
            if (tmp.next.next == null) {
                tail = tmp.next;
            }
        }
    }

    public void getData(int index) {
        Node05 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }

    public int indexOf(String key) {
        Node05 tmp = head;
        int index = 0;
        while (tmp != null) {
            if (tmp.data.nama.equalsIgnoreCase(key)) {
                return index;
            }
            tmp = tmp.next;
            index++;
        }
        return -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node05 tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            Node05 tmp = head;
            while (tmp != null) {
                if ((tmp.data.nama.equalsIgnoreCase(key)) && (tmp == head)) {
                    this.removeFirst();
                    break;
                } else if (tmp.data.nama.equalsIgnoreCase(key)) {
                    tmp.next = tmp.next.next;
                    if (tmp.next == null) {
                        tail = tmp;
                    }
                    break;
                }
                tmp = tmp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (index == 0) {
            removeFirst();   
        } else {
            Node05 tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            if (tmp.next == null) {
                tail = tmp;
            }
        }
    }
}