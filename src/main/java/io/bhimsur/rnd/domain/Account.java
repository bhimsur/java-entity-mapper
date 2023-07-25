package io.bhimsur.rnd.domain;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

public class Account {
    private String name;
    private Date dateOfBirth;
    private String idCardNumber;
    private Set<DepositAccount> depositAccounts;
    private Set<SavingAccount> savingAccounts;

    public Account() {
    }

    public Account(String name, Date dateOfBirth, String idCardNumber, Set<DepositAccount> depositAccounts, Set<SavingAccount> savingAccounts) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.idCardNumber = idCardNumber;
        this.depositAccounts = depositAccounts;
        this.savingAccounts = savingAccounts;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", idCardNumber='" + idCardNumber + '\'' +
                ", depositAccounts=" + depositAccounts +
                ", savingAccounts=" + savingAccounts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(name, account.name) && Objects.equals(dateOfBirth, account.dateOfBirth) && Objects.equals(idCardNumber, account.idCardNumber) && Objects.equals(depositAccounts, account.depositAccounts) && Objects.equals(savingAccounts, account.savingAccounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth, idCardNumber, depositAccounts, savingAccounts);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Set<DepositAccount> getDepositAccounts() {
        return depositAccounts;
    }

    public void setDepositAccounts(Set<DepositAccount> depositAccounts) {
        this.depositAccounts = depositAccounts;
    }

    public Set<SavingAccount> getSavingAccounts() {
        return savingAccounts;
    }

    public void setSavingAccounts(Set<SavingAccount> savingAccounts) {
        this.savingAccounts = savingAccounts;
    }
}