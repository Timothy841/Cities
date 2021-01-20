// Courteous of Phillip Paul Fuchs: https://www.quickperm.org/ Quick Perm (Countdown)
public class QuickPerm {
    int[] arr, counter; // 'arr' is the actual array, while counter is used to control the iteration
    int i;
    int size;

    // TODO: initialize arr, counter, i, and size
    public QuickPerm(int length) {

    }

    // TODO: create end condition
    public boolean hasNext() {
        return false;
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
}