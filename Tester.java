import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class Tester {
    public static void main(String[] args) {
        try {
            int[][] data = Path.parseInput("cities.txt");
            Scanner datascan = new Scanner(new File("cities.txt"));
            QuickPerm qp = new QuickPerm(QuickPerm.numCities(datascan));
            int distance = 0;
            int lowest = 0;
            while (qp.hasNext()) {
                qp.generateNext();
                Scanner a = new Scanner(qp.toString());
                int start = a.nextInt();
                while(a.hasNext()){
                  int next = a.nextInt();
                  int hold = start;
                  int hold2 = next;
                  if (next<start){
                    start = next;
                    next = hold;
                  }
                  distance += data[start][next];
                  start = hold2;
                }
                if (lowest == 0){
                  lowest = distance;
                }
                if (distance < lowest){
                  lowest = distance;
                }
                distance = 0;
            }
            System.out.println(lowest);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
