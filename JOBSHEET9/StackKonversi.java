package JOBSHEET9;
public class StackKonversi {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi() {
        this.size = 32; //asumsi 32 bit
        tumpukanBiner = new int[size];
        top = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh! Tidak bisa menambahkan data.");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada data untuk diambil.");
            return -1; 
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
