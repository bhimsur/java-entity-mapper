package io.bhimsur.rnd.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class DepositAccountDTO {
    private String productType;
    private String productCode;
    private String accountNumber;
    private Date createdDate;
    private BigDecimal balanceAvailable;
    private BigDecimal balanceHold;
    private int term;
    private String termCode;
    private double interestRate;

    public DepositAccountDTO(String productType, String productCode, String accountNumber, Date createdDate, BigDecimal balanceAvailable, BigDecimal balanceHold, int term, String termCode, double interestRate) {
        this.productType = productType;
        this.productCode = productCode;
        this.accountNumber = accountNumber;
        this.createdDate = createdDate;
        this.balanceAvailable = balanceAvailable;
        this.balanceHold = balanceHold;
        this.term = term;
        this.termCode = termCode;
        this.interestRate = interestRate;
    }

    public DepositAccountDTO() {
    }

    @Override
    public String toString() {
        return "DepositAccountDTO{" +
                "productType='" + productType + '\'' +
                ", productCode='" + productCode + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", createdDate=" + createdDate +
                ", balanceAvailable=" + balanceAvailable +
                ", balanceHold=" + balanceHold +
                ", term=" + term +
                ", termCode='" + termCode + '\'' +
                ", interestRate=" + interestRate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepositAccountDTO that = (DepositAccountDTO) o;
        return term == that.term && Double.compare(that.interestRate, interestRate) == 0 && Objects.equals(productType, that.productType) && Objects.equals(productCode, that.productCode) && Objects.equals(accountNumber, that.accountNumber) && Objects.equals(createdDate, that.createdDate) && Objects.equals(balanceAvailable, that.balanceAvailable) && Objects.equals(balanceHold, that.balanceHold) && Objects.equals(termCode, that.termCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productType, productCode, accountNumber, createdDate, balanceAvailable, balanceHold, term, termCode, interestRate);
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public BigDecimal getBalanceAvailable() {
        return balanceAvailable;
    }

    public void setBalanceAvailable(BigDecimal balanceAvailable) {
        this.balanceAvailable = balanceAvailable;
    }

    public BigDecimal getBalanceHold() {
        return balanceHold;
    }

    public void setBalanceHold(BigDecimal balanceHold) {
        this.balanceHold = balanceHold;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public String getTermCode() {
        return termCode;
    }

    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
