import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Path{
  private static String[][] path(Scanner a){
    return null;
  }

  public static int[][] parseInput(String path) throws FileNotFoundException{
    File f = new File(path);
    Scanner s = new Scanner(f);
    int[][] data = new int[9][9]; // set to 9 for now, max cities should be 9
    ArrayList<String> cities = new ArrayList<String>();

    while(s.hasNextLine()) {
      String line = s.nextLine();
      Scanner s2 = new Scanner(line);
      String[] tokens = new String[5];
      int num = 0;
      // TOKENS
      while(s2.hasNext()) {
        tokens[num] = s2.next();
        num++;
      }

      // token 0 = city a, token 2 = city b, token 4 = distance
      String cityA = tokens[0];
      String cityB = tokens[2];
      int indexA, indexB;
      int distance = Integer.parseInt(tokens[4]);

      if(cities.contains(cityA)) {
        indexA = cities.indexOf(cityA);
      } else {
        indexA = cities.size();
        cities.add(cityA);
      }

      if(cities.contains(cityB)) {
        indexB = cities.indexOf(cityB);
      } else {
        indexB = cities.size();
        cities.add(cityB);
      }

      data[indexA][indexB] = distance;

    }
    return data;
  }
}
