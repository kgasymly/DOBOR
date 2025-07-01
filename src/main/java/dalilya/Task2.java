package dalilya;

public class Task2 {
    static class Islands {
        public int howMuchlands(char[][] matrix) {
            if (matrix == null || matrix.length == 0)
                return 0;

            int numIslands = 0;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == '1') {
                        numIslands++;
                        markIsland(matrix, i, j);
                    }
                }
            }
            return numIslands;
        }

        private void markIsland(char[][] matrix, int i, int j) {
            if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[i].length || matrix[i][j] == '0')
                return;

            matrix[i][j] = '0';

            markIsland(matrix, i, j + 1);
            markIsland(matrix, i + 1, j);
            markIsland(matrix, i, j - 1);
            markIsland(matrix, i - 1, j);
        }
    }

    public static void main(String[] args) {
        Islands islandsCounter = new Islands();

        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println("Количество островов: " + islandsCounter.howMuchlands(grid1));

        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println("Количество островов: " + islandsCounter.howMuchlands(grid2));
    }
}