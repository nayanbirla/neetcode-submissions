
class Solution {
    static class Pair {
        int i;
        int j;

        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        Queue<Pair> que = new LinkedList<>();

        // Add boundary O's to the queue
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                que.add(new Pair(i, 0));
                board[i][0] = '#';
            }

            if (board[i][n - 1] == 'O') {
                que.add(new Pair(i, n - 1));
                board[i][n - 1] = '#';
            }
        }

        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                que.add(new Pair(0, j));
                board[0][j] = '#';
            }

            if (board[m - 1][j] == 'O') {
                que.add(new Pair(m - 1, j));
                board[m - 1][j] = '#';
            }
        }

        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // Preserve all O's connected to the boundary
        while (!que.isEmpty()) {
            Pair curr = que.poll();

            for (int[] d : dir) {
                int nr = curr.i + d[0];
                int nc = curr.j + d[1];

                if (nr < 0 || nc < 0 || nr >= m || nc >= n
                        || board[nr][nc] != 'O') {
                    continue;
                }

                board[nr][nc] = '#';
                que.add(new Pair(nr, nc));
            }
        }

        // Flip enclosed O's and restore safe cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}
