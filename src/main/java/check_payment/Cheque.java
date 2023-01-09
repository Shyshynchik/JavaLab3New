package check_payment;

public class Cheque {
    private Order order;
    private double chequeCost;
    private boolean chequePaid;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double getChequeCost() {
        return chequeCost;
    }

    public void setChequeCost(double chequeCost) {
        this.chequeCost = chequeCost;
    }

    public boolean isChequePaid() {
        return chequePaid;
    }

    public void setChequePaid(boolean chequePaid) {
        this.chequePaid = chequePaid;
    }
}
