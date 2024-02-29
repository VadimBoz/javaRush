import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Main {

    public static void printFilteredAccounts(List<Account> accounts) {
        Predicate<Account> predicate = s -> s.getBalance() > 0;
        Predicate<Account> predicate2 = s -> s.getBalance() >= 100_000_000 && !s.isLocked();
        List<Account> nonEmptyAccounts = filter(accounts, predicate);
                // write your code here
        List<Account> accountsWithTooMuchMoney = filter(accounts, predicate2);
//                .stream().filter()
//                .collect(Collectors.toList());// write your code here
//        2
//        111-1 15000 false
//        111-2 999999999 true
//
//        1
//        111-1 100000 true

//        8
//        111-1 15000 false
//        111-2 999999999 true
//        111-3 0 false
//        111-4 320000 false
//        111-5 22000 false
//        111-6 100000001 false
//        111-7 100000000 false
//        111-8 0 false




        // Don't change the code below
        nonEmptyAccounts.forEach(a -> System.out.print(a.getNumber() + " "));
        accountsWithTooMuchMoney.forEach(a -> System.out.print(a.getNumber() + " "));
    }

    public static <T> List<T> filter(List<T> elems, Predicate<T> predicate) {
        return elems.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final int n = Integer.parseInt(scanner.nextLine());
        final List<Account> accounts = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            final String[] values = scanner.nextLine().split("\\s+");
            final Account acc = new Account(
                    values[0], Long.parseLong(values[1]), Boolean.parseBoolean(values[2])
            );
            accounts.add(acc);
        }

        printFilteredAccounts(accounts);
    }

    static class Account {
        private String number;
        private long balance;
        private boolean locked;

        public Account(String number, long balance, boolean locked) {
            this.number = number;
            this.balance = balance;
            this.locked = locked;
        }

        public long getBalance() {
            return balance;
        }

        public void setBalance(long balance) {
            this.balance = balance;
        }

        public boolean isLocked() {
            return locked;
        }

        public void setLocked(boolean locked) {
            this.locked = locked;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "number='" + number + '\'' +
                    ", balance=" + balance +
                    ", isLocked=" + locked +
                    '}';
        }
    }
}