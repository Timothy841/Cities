public class Tester {
    public static void main(String[] args) {
        String path = args.length > 0 ? args[0] : "cities2.txt";
        long startTime = System.currentTimeMillis();
        System.out.println(Path.minimumDistance(path));
        long endTime = System.currentTimeMillis();
        System.out.println("Run Time: " + (endTime - startTime)/1000.0  + " seconds");
    }
}
