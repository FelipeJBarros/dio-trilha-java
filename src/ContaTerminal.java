public class ContaTerminal {
    private int number;
    private String agency;
    private String clientName;
    private double balance;

    public ContaTerminal(
            int number,
            String agency,
            String clientName,
            double balance
    ) {
        this.number = number;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }

    public String toString() {
        return "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque"
                .formatted(this.clientName, this.agency, this.number, this.balance);
    }
}
