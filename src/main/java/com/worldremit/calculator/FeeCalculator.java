package com.worldremit.calculator;

import com.worldremit.calculator.domain.TransferData;

public interface FeeCalculator {
    default Integer calculateFee(TransferData transferData) {
        return -1;
    }
}
