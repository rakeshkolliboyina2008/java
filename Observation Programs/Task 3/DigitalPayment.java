package task; 
//1. PaymentService Interface
interface PaymentService {
 void pay(String receiverUPI, double amount)
         throws InvalidUPIException, InvalidAmountException,InsufficientBalanceException;
 void checkBalance();
}
//2. Custom Exception - Invalid UPI
class InvalidUPIException extends Exception {
 public InvalidUPIException(String message) {
     super(message);
 }
}
//3. Custom Exception - Invalid Amount
class InvalidAmountException extends Exception {
 public InvalidAmountException(String message) {
     super(message);
 }
}
//4. Custom Exception - Insufficient Balance
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}
//5. Wallet Class
class Wallet {
	public void deductMoney(double amount) {
	    balance = balance - amount;
	}
 // Encapsulation - private data members
 private String userName;
 private String mobileNumber;
 private String upiId;
 private double balance;
 // Constructor
 public Wallet(String userName, String mobileNumber, String upiId, double balance) {
     this.userName = userName;
     this.mobileNumber = mobileNumber;
     this.upiId = upiId;
     this.balance = balance;
 }
 // Add money
 public void addMoney(double amount)throws InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException( "Invalid amount. Amount must be greater than zero.");
     }
     balance = balance + amount;
     System.out.println("Money added successfully: Rs." + amount);
 }
 // Get balance
 public double getBalance() {
     return balance;
 }
 // Get UPI ID
 public String getUpiId() {
     return upiId;
 }
 // Display wallet details
 public void displayWalletDetails() {
     System.out.println("\n----- Wallet Details -----");
     System.out.println("User Name     : " + userName);
     System.out.println("Mobile Number : " + mobileNumber);
     System.out.println("UPI ID        : " + upiId);
     System.out.println("Balance       : Rs." + balance);
 }
}
//6. UPIPayment Class
class UPIPayment implements PaymentService {

 private Wallet wallet;

 // Constructor
 public UPIPayment(Wallet wallet) {
     this.wallet = wallet;
 }
 // Payment method
 @Override
 public void pay(String receiverUPI, double amount)
         throws InvalidUPIException,
                InvalidAmountException,
                InsufficientBalanceException {
     // Validate UPI ID using String operations
     if (receiverUPI == null ||
         !receiverUPI.contains("@") ||
         receiverUPI.startsWith("@") ||
         receiverUPI.endsWith("@")) {
         throw new InvalidUPIException( "Invalid UPI ID: " + receiverUPI);
     }
     // Validate amount
     if (amount <= 0) {
         throw new InvalidAmountException(
                 "Invalid payment amount. Amount must be greater than zero.");
     }
     // Check balance
     if (amount > wallet.getBalance()) {
         throw new InsufficientBalanceException(
                 "Insufficient balance. Available balance: Rs."
                 + wallet.getBalance());
     }
     // Deduct amount
     // Since balance is private, addMoney() cannot be used
     // for deduction. We use a separate method.
     wallet.deductMoney(amount);
     System.out.println("\nPayment successful!");
     System.out.println("Receiver UPI : " + receiverUPI);
     System.out.println("Amount paid   : Rs." + amount);
 }
 // Check balance
 @Override
 public void checkBalance() {
     System.out.println("\nAvailable Balance: Rs." + wallet.getBalance());
 }
}
public class DigitalPayment {
	    public static void main(String[] args) {

	        // Create wallet
	        Wallet wallet = new Wallet(
	                "Rahul",
	                "9876543210",
	                "rahul@upi",
	                5000
	        );
	        // Create UPIPayment object
	        UPIPayment payment = new UPIPayment(wallet);
	        // Display initial wallet details
	        wallet.displayWalletDetails();
	        // Add money
	        try {
	            wallet.addMoney(2000);
	        }
	        catch (InvalidAmountException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	        payment.checkBalance();
	        // Make payment
	        try {
	            payment.pay("arun@upi", 1500);
	            System.out.println("Transaction completed successfully.");
	        }
	        catch (InvalidUPIException e) {
	            System.out.println("UPI Error: " + e.getMessage());
	        }
	        catch (InvalidAmountException e) {
	            System.out.println("Amount Error: " + e.getMessage());
	        }
	        catch (InsufficientBalanceException e) {
	            System.out.println("Balance Error: " + e.getMessage());
	        }
	        finally {
	            System.out.println("\nTransaction process completed.");
	        }
	        // Final balance
	        payment.checkBalance();
	        // Final wallet details
	        wallet.displayWalletDetails();
	    }
	}
