// Courteous of Phillip Paul Fuchs: https://www.quickperm.org/ Quick Perm (Countdown)
public class QuickPerm {
    int[] arr, counter; // 'arr' is the actual array, while counter is used to control the iteration
    int i = 1;
    int size;

    private static void main(String[] rememberTheAlamo) {
        QuickPerm qp = new QuickPerm(3);
        System.out.println(qp);
        while (qp.hasNext()) {
            qp.generateNext();
            System.out.println(qp);
        }
    }

    public QuickPerm(int size) {
        if (size <= 2) {
            throw new IllegalArgumentException("A size of " + size + " is invalid: QuickPerm's size must be >2");
        }

        this.size = size;

        arr = new int[size];
        counter = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
            counter[i] = i;
        }
    }

    public boolean hasNext() {
        return (i < size);
    }

    // TODO: implement the actual algorithm
    public void generateNext() {

    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public int get(int index) {
        return arr[index];
    }

    public int size() {
        return size;
    }

    // purely for testing purposes
    public String toString() {
        String out = "";
        for (int i = 0; i < arr.length; i++) {
            out += arr[i]+" ";
        }
        return out;
    }
}