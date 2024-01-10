import java.util.Scanner;

public class TestClass {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int accountType = 0;
            SavingAccount savingAccount = new SavingAccount(0);
             CheckingAccount checkingAccount = new CheckingAccount(0);
             while (accountType != 3) {

            System.out.println("Bank Account");
            System.out.println("1. Saving");
            System.out.println("2. Checking");
            System.out.println("3. Exit");
            System.out.print("Choose your option: ");
            accountType = scanner.nextInt();

                        
            int savingOptions = -1;
            int checkingOption = -1;
            do{
                
                
                switch (accountType) {
                    case 1:
                        
                        

                        System.out.println("1. Deposit");
                        System.out.println("2. Balance");
                        System.out.println("3. Withdraw");
                        System.out.println("4. Main Menu");
                        System.out.print("Choose your option: ");
                        savingOptions = scanner.nextInt();

                        switch (savingOptions) {
                        case 1:
                            System.out.print("Amount: RM ");
                            double depositAmount = scanner.nextDouble();
                            savingAccount.deposit(depositAmount);
                            break;
                        case 2:
                            System.out.println("Balance: RM " + savingAccount.getBalance());
                            break;
                        case 3:
                            System.out.print("Amount: RM ");
                            double withdrawAmount = scanner.nextDouble();
                            savingAccount.withdraw(withdrawAmount);
                            break;
                        case 4:
                        
                            break ;
                            
                        default:
                            System.out.println("Invalid option");
                            break;
                        }
                        break;
                    case 2:
                       
                        

                        System.out.println("1. Deposit");
                        System.out.println("2. Balance");
                        System.out.println("3. Withdraw");
                        System.out.println("4. Main Menu");
                        System.out.print("Choose your option: ");
                        checkingOption = scanner.nextInt();

                        switch (checkingOption) {
                            case 1:
                                System.out.print("Amount: RM ");
                                double depositAmount = scanner.nextDouble();
                                checkingAccount.deposit(depositAmount);
                                break;
                            case 2:
                                System.out.println("Balance: RM " + checkingAccount.getBalance());
                                break;
                            case 3:
                                System.out.print("Amount: RM ");
                                double withdrawAmount = scanner.nextDouble();
                                checkingAccount.withdraw(withdrawAmount);
                                break;
                            case 4:
                                break ;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                        break;
                    case 3:
                        // Exit the program
                        checkingOption = 4;
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }

                                }while (!(checkingOption == 4 || savingOptions == 4));

            }

            scanner.close();
        }
    }