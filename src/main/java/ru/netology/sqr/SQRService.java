package ru.netology.sqr;

public class SQRService {

    public int calcAmountSquare(int minValue, int maxValue) {

        int amount = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= minValue)
                if (i * i <= maxValue) {
                    amount = amount + 1;
                }
        }
        return amount;
    }
}
