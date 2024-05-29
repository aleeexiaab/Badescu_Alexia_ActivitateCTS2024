package Problem_3;

public class BankAccount {
    private String accountHolderName;
    private boolean salaryAccount;
    private boolean hasDebitCard;
    private boolean hasInternetBanking;

    private BankAccount(BankAccountBuilder builder) {
        this.accountHolderName = builder.accountHolderName;
        this.salaryAccount = builder.salaryAccount;
        this.hasDebitCard = builder.hasDebitCard;
        this.hasInternetBanking = builder.hasInternetBanking;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", salaryAccount=" + salaryAccount +
                ", hasDebitCard=" + hasDebitCard +
                ", hasInternetBanking=" + hasInternetBanking +
                '}';
    }

    // Builder class
    public static class BankAccountBuilder {
        private String accountHolderName;
        private boolean salaryAccount;
        private boolean hasDebitCard;
        private boolean hasInternetBanking;

        public BankAccountBuilder(String accountHolderName) {
            this.accountHolderName = accountHolderName;
        }

        public BankAccountBuilder setSalaryAccount(boolean salaryAccount) {
            this.salaryAccount = salaryAccount;
            return this;
        }

        public BankAccountBuilder setHasDebitCard(boolean hasDebitCard) {
            this.hasDebitCard = hasDebitCard;
            return this;
        }

        public BankAccountBuilder setHasInternetBanking(boolean hasInternetBanking) {
            this.hasInternetBanking = hasInternetBanking;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}
