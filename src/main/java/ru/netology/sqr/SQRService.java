package ru.netology.sqr;

public class SQRService {

    public int counter(int minLimit, int maxLimit) {

        //int minLimit = 200;
        //int maxLimit = 300;
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minLimit && i * i <= maxLimit) {
                count = count + 1;

            }

        }
        return count;
    }
}