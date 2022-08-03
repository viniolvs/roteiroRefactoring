public abstract class Statement {
    // Template
    public String value(Customer aCustomer) {
        return getResultString(aCustomer);
    }

    public abstract String getResultString(Customer aCustomer);
}
