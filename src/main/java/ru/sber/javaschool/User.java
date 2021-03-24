package ru.sber.javaschool;

import lombok.Data;

@Data
/*кто пользуется банкоматом*/
public abstract class User {

    private String cardnumber;
    private int pinCode; /*валидация*/

    public User(String cardnumber, int pinCode) {

    }

    /*получаем доступ к операциям на банкомате*/
    public void verification() {

    }


}

