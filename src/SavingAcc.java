public abstract class SavingAcc extends BankAcc {
    private final boolean isSalaried;
    private static final float MINBAL = 1000.0f;

    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal);
        this.isSalaried = isSalaried;
    }

    public boolean isSalaried() {
        return isSalaried;
    }

    public static float getMINBAL() {
        return MINBAL;
    }

    @Override
    public abstract void withdraw(float amount);

    @Override
    public abstract String toString();
}
