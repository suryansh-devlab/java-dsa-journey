package code.Searching.LinearSearch;

public class Wealth {
    public static void main(String[] args) {

        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5, 100, 2 } };
        System.out.println(maximumWealth(accounts));

    }

    static int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // when start a new account, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }
            if (sum > ans) {
                ans = sum;
            }

        }

        return ans;
    }
}
