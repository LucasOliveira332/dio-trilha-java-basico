package Account;

public class Account {
    private int number;
    private String agency;
    private String clientName;
    private double balance;

    public Account(int number, String agency, String clientName, double balance) {
        this.number = number;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }

    public void displayDetails() {
        System.err.println("Olá " + this.clientName + ", obrigado por criar uma conta em nosso banco sua agencia é " 
        + this.agency + ", conta " + this.number + " e seu saldo " + this.balance + " ja está disponivel.");
    }

}
