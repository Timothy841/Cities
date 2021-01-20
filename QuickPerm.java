// Courteous of Phillip Paul Fuchs: https://www.quickperm.org/ Quick Perm (Countdown)
import java.util.Scanner;
public class QuickPerm {
    int[] arr, counter; // 'arr' is the actual array, while counter is used to control the iteration
    int i;
    int size;
    boolean generatedOnce = false;

    public static void main(String[] rememberTheAlamo) {
        QuickPerm qp = new QuickPerm(3);
        while (qp.hasNext()) {
            qp.generateNext();
            System.out.println(qp);
        }
        Scanner a = new Scanner("3 4 5");
        System.out.println(a.nextInt());
    }

    public static int numCities(Scanner a){
      int tot = 0;
      while (a.hasNextLine()){
        a.nextLine();
        tot++;
      }
      int num = 0;
      while (!(tot<=0)){
        num++;
        tot-=num;
      }
      return num+1;
    }

    public QuickPerm(int size) {
        if (size <= 2) {
            throw new IllegalArgumentException("A size of " + size + " is invalid: QuickPerm's size must be >2");
        }

        this.size = size;

        arr = new int[size];
        counter = new int[size + 1];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
            counter[i] = i;
        }
        counter[size] = size;
    }

    public boolean hasNext() {
        return (i < size);
    }

    public void generateNext() {
        if (!hasNext()) {
            // not sure if this is the best exception for this, but it's the best i could find
            throw new IndexOutOfBoundsException("QuickPerm can no longer generate, use 'hasNext()' to check when to stop");
        }

        counter[i]--;
        int j = (i % 2) * counter[i]; // if i is odd, then j = counter[i] otherwise j = 0
        swap(i, j);

        i = 1;
        while (counter[i] == 0) {
            counter[i] = i;
            i++;
        }
    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
