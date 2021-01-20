import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class Tester {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        try {
            int[][] data = Path.parseInput("cities.txt");
            Scanner datascan = new Scanner(new File("cities.txt"));
            QuickPerm qp = new QuickPerm(QuickPerm.numCities(datascan));
            System.out.println(Path.getLowest(qp, data));
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Run Time: " + (endTime - startTime)/1000.0  + " seconds");
    }
}
