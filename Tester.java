import java.io.FileNotFoundException;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        try {
            int[][] data = Path.parseInput("cities.txt");
            for(int i = 0; i < data.length; i++) {
                System.out.println(Arrays.toString(data[i]));
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
