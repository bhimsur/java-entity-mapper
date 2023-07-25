package io.bhimsur.rnd.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class SavingAccount {
    private String productType;
    private String productCode;
    private String accountNumber;
    private Date createdDate;
    private BigDecimal balanceAvailable;
    private BigDecimal balanceHold;

    public SavingAccount(String productType, String productCode, String accountNumber, Date createdDate, BigDecimal balanceAvailable, BigDecimal balanceHold) {
        this.productType = productType;
        this.productCode = productCode;
        this.accountNumber = accountNumber;
        this.createdDate = createdDate;
        this.balanceAvailable = balanceAvailable;
        this.balanceHold = balanceHold;
    }

    public SavingAccount() {
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "productType='" + productType + '\'' +
                ", productCode='" + productCode + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", createdDate=" + createdDate +
                ", balanceAvailable=" + balanceAvailable +
                ", balanceHold=" + balanceHold +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SavingAccount that = (SavingAccount) o;
        return Objects.equals(productType, that.productType) && Objects.equals(productCode, that.productCode) && Objects.equals(accountNumber, that.accountNumber) && Objects.equals(createdDate, that.createdDate) && Objects.equals(balanceAvailable, that.balanceAvailable) && Objects.equals(balanceHold, that.balanceHold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productType, productCode, accountNumber, createdDate, balanceAvailable, balanceHold);
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
}
