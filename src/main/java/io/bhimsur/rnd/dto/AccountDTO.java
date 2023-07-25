package io.bhimsur.rnd.dto;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

public class AccountDTO {
    private String accountName;
    private Date dateOfBirth;
    private String idCardNumber;
    private Set<SavingAccountDTO> savingAccounts;
    private Set<DepositAccountDTO> depositAccounts;

    public AccountDTO() {
    }

    public AccountDTO(String accountName, Date dateOfBirth, String idCardNumber, Set<SavingAccountDTO> savingAccounts, Set<DepositAccountDTO> depositAccounts) {
        this.accountName = accountName;
        this.dateOfBirth = dateOfBirth;
        this.idCardNumber = idCardNumber;
        this.savingAccounts = savingAccounts;
        this.depositAccounts = depositAccounts;
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
                "accountName='" + accountName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", idCardNumber='" + idCardNumber + '\'' +
                ", savingAccounts=" + savingAccounts +
                ", depositAccounts=" + depositAccounts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountDTO that = (AccountDTO) o;
        return Objects.equals(accountName, that.accountName) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(idCardNumber, that.idCardNumber) && Objects.equals(savingAccounts, that.savingAccounts) && Objects.equals(depositAccounts, that.depositAccounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName, dateOfBirth, idCardNumber, savingAccounts, depositAccounts);
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public Set<SavingAccountDTO> getSavingAccounts() {
        return savingAccounts;
    }

    public void setSavingAccounts(Set<SavingAccountDTO> savingAccounts) {
        this.savingAccounts = savingAccounts;
    }

    public Set<DepositAccountDTO> getDepositAccounts() {
        return depositAccounts;
    }

    public void setDepositAccounts(Set<DepositAccountDTO> depositAccounts) {
        this.depositAccounts = depositAccounts;
    }
}