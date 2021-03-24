package ru.sber.javaschool.verification;

public interface Verification {
    VerificationType verificationType();

    static boolean isVerification() {

        boolean isVerification = true;

        return isVerification;
    }
}
