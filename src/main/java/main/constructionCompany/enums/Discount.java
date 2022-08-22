package main.constructionCompany.enums;

public enum Discount {
    CUSTOMER(0), REGULAR_CUSTOMER(10), EMPLOYEE(20), ARCHITECT(25);

    private int discount;

    Discount(int discount) {
        this.discount = discount;
    }
    public int getDiscount() {
        return discount;
    }
}
