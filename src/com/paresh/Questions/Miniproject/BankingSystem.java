package com.paresh.Miniproject;
import java.util.*;

interface BankAccount {
    String getAccountHolderName();
    long getAccountNumber();
    double getAccountBalance();
    void deposit(double amount);
    void withdraw(double amount);
    String getBankName();
}

class SBI implements BankAccount {
    private String accountHolderName;
    private long accountNumber;
    private double accountBalance;

    SBI(String name, long accountNumber, double balance) {
        this.accountHolderName = name;
        this.accountNumber = accountNumber;
        this.accountBalance = balance;
    }

    @Override
    public String getAccountHolderName() {
        return accountHolderName;
    }

    @Override
    public long getAccountNumber() {
        return accountNumber;
    }

    @Override
    public double getAccountBalance() {
        return accountBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposit successful. Updated balance: " + accountBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + accountBalance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    public String getBankName() {
        return "SBI";
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-15d %-10.2f", getBankName(), accountHolderName, accountNumber, accountBalance);
    }
}

class BOB implements BankAccount {
    private String accountHolderName;
    private long accountNumber;
    private double accountBalance;

    BOB(String name, long accountNumber, double balance) {
        this.accountHolderName = name;
        this.accountNumber = accountNumber;
        this.accountBalance = balance;
    }

    @Override
    public String getAccountHolderName() {
        return accountHolderName;
    }

    @Override
    public long getAccountNumber() {
        return accountNumber;
    }

    @Override
    public double getAccountBalance() {
        return accountBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposit successful. Updated balance: " + accountBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + accountBalance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    public String getBankName() {
        return "BOB";
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-15d %-10.2f", getBankName(), accountHolderName, accountNumber, accountBalance);
    }
}

class HDFC implements BankAccount {
    private String accountHolderName;
    private long accountNumber;
    private double accountBalance;

    HDFC(String name, long accountNumber, double balance) {
        this.accountHolderName = name;
        this.accountNumber = accountNumber;
        this.accountBalance = balance;
    }

    @Override
    public String getAccountHolderName() {
        return accountHolderName;
    }

    @Override
    public long getAccountNumber() {
        return accountNumber;
    }

    @Override
    public double getAccountBalance() {
        return accountBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposit successful. Updated balance: " + accountBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + accountBalance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    public String getBankName() {
        return "HDFC";
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-15d %-10.2f", getBankName(), accountHolderName, accountNumber, accountBalance);
    }
}

class BankingManagement {
    private ArrayList<SBI> sbi = new ArrayList<>();
    private ArrayList<BOB> bob = new ArrayList<>();
    private ArrayList<HDFC> hdfc = new ArrayList<>();

    public void addUserInSBI(SBI user) {
        sbi.add(user);
    }

    public void addUserInBOB(BOB user) {
        bob.add(user);
    }

    public void addUserInHDFC(HDFC user) {
        hdfc.add(user);
    }

    public void listAllUsers() {
        System.out.println("\n--- All Users ---");
        if (sbi.isEmpty() && bob.isEmpty() && hdfc.isEmpty()) {
            System.out.println("No accounts in any bank.");
        } else {
            printTableHeader();
            for (SBI account : sbi) {
                System.out.println(account);
            }
            for (BOB account : bob) {
                System.out.println(account);
            }
            for (HDFC account : hdfc) {
                System.out.println(account);
            }
        }
    }

    private void printTableHeader() {
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-15s %-10s\n", "Bank", "Account Holder", "Account Number", "Balance");
        System.out.println("------------------------------------------------------------------");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        BankingManagement bankingManagement = new BankingManagement();
        boolean flag = true;

        System.out.println("Welcome to the Banking System!");

        while (flag) {
            System.out.println("\nChoose a bank to open an account:");
            System.out.println("1: SBI");
            System.out.println("2: BOB");
            System.out.println("3: HDFC");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");
            int bankChoice = scanner.nextInt();
            scanner.nextLine(); 

            if (bankChoice == 4) {
                flag = false;
                System.out.println("Exiting...");
                continue;
            }

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            long accountNumber = 100000000000L + random.nextInt(900000000);

            BankAccount account = null;
            switch (bankChoice) {
                case 1:
                    account = new SBI(name, accountNumber, 0);
                    bankingManagement.addUserInSBI((SBI) account);
                    break;
                case 2:
                    account = new BOB(name, accountNumber, 0);
                    bankingManagement.addUserInBOB((BOB) account);
                    break;
                case 3:
                    account = new HDFC(name, accountNumber, 0);
                    bankingManagement.addUserInHDFC((HDFC) account);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            System.out.println("\nAccount created successfully!");
            System.out.println("Account Details: ");
            System.out.println("----------------------------------");
            System.out.println("Account Holder Name: " + account.getAccountHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getAccountBalance());
            System.out.println("----------------------------------");


            boolean accountMenu = true;
            while (accountMenu) {
                System.out.println("\nChoose an action:");
                System.out.println("1: Deposit");
                System.out.println("2: Withdraw");
                System.out.println("3: Exit Account Menu");
                System.out.print("Enter your choice: ");
                int actionChoice = scanner.nextInt();
                scanner.nextLine(); 

                switch (actionChoice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine(); 
                        account.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine(); 
                        account.withdraw(withdrawAmount);
                        break;
                    case 3:
                        accountMenu = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        System.out.println("\nDo you want to view all accounts? (yes/no)");
        String viewChoice = scanner.nextLine().toLowerCase();
        if (viewChoice.equals("yes")) {
            bankingManagement.listAllUsers();
        }

        System.out.println("\nThank you for using the Banking System!");
        scanner.close();
    }
}