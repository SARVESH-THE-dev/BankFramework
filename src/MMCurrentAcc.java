public class MMCurrentAcc extends CurrentAcc {
    public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal, creditLimit);
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() + getCreditLimit() - amount < 0) {
            System.out.println("Withdrawal not allowed. Insufficient funds.");
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
