package com.worldremit.calculator.domain;

public final class TransferData {
    private final String sourceCountry;
    private final String targetCountry;
    private final int transferAmount;
    private final String comment;

    public TransferData(String sourceCountry, String targetCountry, int transferAmount, String comment) {
        this.sourceCountry = sourceCountry;
        this.targetCountry = targetCountry;
        this.transferAmount = transferAmount;
        this.comment = comment;
    }

    public String getSourceCountry() {
        return sourceCountry;
    }

    public String getTargetCountry() {
        return targetCountry;
    }

    public int getTransferAmount() {
        return transferAmount;
    }

    public String getComment() {
        return comment;
    }
}
