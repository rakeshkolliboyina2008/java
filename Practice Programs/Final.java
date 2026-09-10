package exceptions;
public class Final {
public static void main(String[] args) {
	System.out.println("1. Card inserted into the ATM.");
	try {
		boolean systemCrash = true; 

        System.out.println("2. Processing your cash withdrawal...");

        if (systemCrash) {
            throw new RuntimeException("ATM lost connection to the bank server.");
        }

        System.out.println("3. Cash dispensed successfully!");

    } catch (RuntimeException e) {
        // This runs ONLY if a crash occurs
        System.out.println("Catch: An error occurred -> " + e.getMessage());

    } finally {
        // THIS ALWAYS RUNS NO MATTER WHAT!
        System.out.println("Finally: Safely ejecting your debit card. Thank you!");
    }
}
}