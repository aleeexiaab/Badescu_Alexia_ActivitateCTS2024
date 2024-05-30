package Problem_7;

public class AccountCreationFacade {
    private AgeVerification ageVerification;
    private PoliceCheck policeCheck;
    private DebtCheck debtCheck;

    public AccountCreationFacade() {
        ageVerification = new AgeVerification();
        policeCheck = new PoliceCheck();
        debtCheck = new DebtCheck();
    }

    public boolean createAccount(String personName, int age) {
        if (!ageVerification.isAgeValid(age)) {
            System.out.println("Age verification failed.");
            return false;
        }
        if (!policeCheck.isClearOfPoliceRecords(personName)) {
            System.out.println("Police check failed.");
            return false;
        }
        if (!debtCheck.hasNoDebts(personName)) {
            System.out.println("Debt check failed.");
            return false;
        }
        System.out.println("Account successfully created for " + personName);
        return true;
    }
}
