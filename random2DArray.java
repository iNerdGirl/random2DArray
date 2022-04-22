public class randomArray {
    public static void main(String[] args) {
        int[][] randomArray = new int[10][10];
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                randomArray[i][j] = randomNumber();
            }
        }
        print2DArray(randomArray);
    }

    private static int randomNumber() {
        return (int)(Math.random() * 100);
    }

    private static void print2DArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
