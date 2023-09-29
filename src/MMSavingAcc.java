public class MMSavingAcc extends SavingAcc {
    private static final float MINBAL = 1000.0f;

    public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal, isSalaried);
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() - amount < MINBAL) {
            System.out.println("Withdrawal not allowed. Minimum balance not maintained.");
        } else {
            setAccBal(getAccBal() - amount);
            System.out.println("Withdrawal successful. Remaining balance: " + getAccBal());
        }
    }

    @Override
    public String toString() {
        return "Account No: " + getAccNo() + ", Name: " + getAccNm() + ", Balance: " + getAccBal();
    }
}
