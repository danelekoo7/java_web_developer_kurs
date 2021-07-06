package bazy_danych.exam;

public class VIPUser extends User {
    public VIPUser(String name, String lastName, String email, Integer vipCardNumber) {
        super(name, lastName, email);
        if (checkCard(vipCardNumber)) {
            this.vipCardNumber = vipCardNumber;
        } else vipCardNumber = null;
    }

    private Integer vipCardNumber;

    private boolean checkCard(int newNumber) {
        boolean result = false;
        if (newNumber % 2 == 0 && newNumber > 999) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public void setVipCardNumber(Integer vipCardNumber) {
        if (checkCard(vipCardNumber)) {
            this.vipCardNumber = vipCardNumber;
        }
    }

    public Integer getVipCardNumber() {
        return vipCardNumber;
    }
}
