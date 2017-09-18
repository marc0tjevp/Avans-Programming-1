public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if (balance >= 2.5) {
            this.balance = this.balance - 2.5;
        } else {
            System.out.println("Not enough money...");
        }
    }

    public void payGourmet() {
        if (balance >= 4) {
            this.balance = this.balance - 4;
        } else {
            System.out.println("Not enough money...");
        }
    }

    public void loadMoney(double amount) {
        // Check if amount is positive
        if (amount > 0){
            // Truncate amount
            if (amount > 150) {
                amount = 150;
            }

            if (balance + amount > 150) {
                this.balance = 150;
            } else {
                // Add amount to balance
                this.balance = this.balance + amount;
            }
        }
    }

}
