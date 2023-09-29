public class BankApplication {
    public static void main(String[] args) {
        // a. Assign instance of MMBankFactory to BankFactory reference.
        BankFactory factory = new MMBankFactory();

        // b. Instantiate MMSavingAcc and refer it through reference SavingAcc.
        SavingAcc savingAcc = factory.getNewSavingAcc(1, "John", 2000.0f, true);

        // c. Instantiate MMCurrentAcc and refer it through reference CurrentAcc.
        CurrentAcc currentAcc = factory.getNewCurrentAcc(2, "Alice", 5000.0f, 2000.0f);

        // d. Invoke withdraw() method.
        savingAcc.withdraw(1500.0f);
        currentAcc.withdraw(7000.0f);

        // e. Invoke toString() method.
        System.out.println(savingAcc.toString());
        System.out.println(currentAcc.toString());
    }
}
