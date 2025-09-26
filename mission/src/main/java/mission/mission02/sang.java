package mission.mission02;

public class sang {
    public static void main(String[] args) {

        System.out.println("[마방진 판별결과]");

        int[][] arr = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}};

        int n = arr.length;
        int[] rowSums = new int[n];
        int[] colSums = new int[n];
        int cross1 = 0;
        int cross2 = 0;

        // 합 계산
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSums[i] += arr[i][j];
                colSums[j] += arr[i][j];
                if (i == j) cross1 += arr[i][j];           // 정대각선
                if (i + j == n - 1) cross2 += arr[i][j];   // 역대각선
            }
        }

        // 합 출력
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "행의 합: " + rowSums[i]);
        }
        for (int j = 0; j < n; j++) {
            System.out.println((j + 1) + "열의 합: " + colSums[j]);
        }
        System.out.println("정대각선의 합: " + cross1);
        System.out.println("역대각선의 합: " + cross2);

        // 마방진 판별
        boolean isMagic = true;
        int magicSum = rowSums[0]; // 기준 합
        for (int i = 0; i < n; i++) {
            if (rowSums[i] != magicSum || colSums[i] != magicSum) {
                isMagic = false;
                break;
            }
        }
        if (cross1 != magicSum || cross2 != magicSum) {
            isMagic = false;
        }

        System.out.println(isMagic ? "→ 마방진입니다!" : "→ 마방진이 아닙니다.");
    }
}




