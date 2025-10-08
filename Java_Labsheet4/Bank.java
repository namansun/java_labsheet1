
class Bank {
    private static int totalAccounts = 0; // private static

    public static void openAccount() {
        totalAccounts++;
        System.out.println("Account opened. Total accounts: " + totalAccounts);
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {
        Bank.openAccount();
        Bank.openAccount();
        System.out.println("Final total: " + Bank.getTotalAccounts());
    }
}
