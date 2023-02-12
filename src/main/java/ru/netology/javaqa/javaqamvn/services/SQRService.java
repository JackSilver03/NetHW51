package ru.netology.javaqa.javaqamvn.services;

public class SQRService {

    public int calcSqrt(int lowRangeLimit, int hiRangeLimit) {
        int score = 0;
        for (int i = 10; i <= 99; i++) {
            if (lowRangeLimit <= i * i && i * i <= hiRangeLimit) {
                score++;
            }
        }
        return score;
    }
}
