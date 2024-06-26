package exercise_3;

public class ContoCorrente {
    private final int maxMovimenti = 50;
    private String titolare;
    private int nMovimenti;
    private double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.setTitolare(titolare);
        this.setSaldo(saldo);
        this.nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) {
            if (x > saldo) throw new BancaException("Il tuo conto è in rosso");
            else saldo = saldo - x;
        } else {
            if (x > saldo) throw new BancaException("Il tuo conto è in rosso");
            else saldo = saldo - x - 0.50;
        }
        nMovimenti++;
    }

    public int getMaxMovimenti() {
        return maxMovimenti;
    }

    public String getTitolare() {
        return titolare;
    }

    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }

    public void setnMovimenti(int nMovimenti) {
        this.nMovimenti = nMovimenti;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
