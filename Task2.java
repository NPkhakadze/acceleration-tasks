import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
    int ans = minSplit(51);
    System.out.println(ans);
    }

    public static int minSplit(int amount){
        if(amount <= 0 ){
            return 0;
        }

        int coins[] = {1,5,10,20,50};
        int cnt = 0;

        do {
            while (amount - coins[4] >= 0) {
                amount -= coins[4];
                cnt++;
            }
            while (amount - coins[3] >= 0) {
                amount -= coins[3];
                cnt++;
            }
            while (amount - coins[2] >= 0) {
                amount -= coins[2];
                cnt++;
            }
            while (amount - coins[1] >= 0) {
                amount -= coins[1];
                cnt++;
            }
            while (amount - coins[0] >= 0) {
                amount -= coins[0];
                cnt++;
            }
        } while (amount != 0);
        return cnt;
    }
 }
