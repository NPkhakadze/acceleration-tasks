public class Task5 {
    public static void main(String[] args) {
        int ans = countVariants(4);
        System.out.println(ans);

    }

    // Dynamic Programming Approach Used Here
    public static int countVariants(int stearsCount) {
        if (stearsCount < 0) {
            System.out.println("NOT VALID INPUT");
            return -1;
        }
        if (stearsCount <= 2) {
            return stearsCount;
        }
        int[] arr = new int[stearsCount + 1];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= stearsCount; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[stearsCount];
    }
}
