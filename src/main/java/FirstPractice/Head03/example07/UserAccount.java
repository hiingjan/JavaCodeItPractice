package FirstPractice.Head03.example07;

// 커스텀 예외 1: 음수 금액 예외
class NegativeAmountException extends IllegalArgumentException {
    public NegativeAmountException(String message) {
        super(message);
    }
}

// 커스텀 예외 2: 잔액 부족 예외
class InsufficientBalanceException extends IllegalStateException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class UserAccount {
    private final String accountId;  // 불변 필드
    private double balance;

    public UserAccount(String accountId) {
        this.accountId = accountId;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new NegativeAmountException("입금 금액은 0보다 커야 합니다.");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new NegativeAmountException("출금 금액은 0보다 커야 합니다.");
        if (balance < amount) throw new InsufficientBalanceException("잔액 부족: 현재 잔액은 " + balance + "원입니다.");
        balance -= amount;
    }

    public double getBalance() { // read-only getter
        return balance;
    }

    public String getAccountId() { // accountId도 getter만
        return accountId;
    }
}