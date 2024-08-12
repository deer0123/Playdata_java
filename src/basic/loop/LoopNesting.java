package basic.loop;

public class LoopNesting {
    public static void main(String[] args) {
        for (int level = 2; level <= 9; level++) {
            System.out.println("*** 구구단 " + level + "단 ***");
            for (int row = 1; row <= 9; row++) {
                System.out.println(level + " × " + row + " = " + level * row);
            }
        }
    }
}
