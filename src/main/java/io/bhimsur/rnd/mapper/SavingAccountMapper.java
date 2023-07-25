package io.bhimsur.rnd.mapper;

import io.bhimsur.rnd.domain.SavingAccount;
import io.bhimsur.rnd.dto.SavingAccountDTO;
import io.bhimsur.rnd.util.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SavingAccountMapper extends EntityMapper<SavingAccount, SavingAccountDTO> {
    default SavingAccount fromAccountNumber(String accountNumber) {
        if (null == accountNumber) {
            return null;
        }
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setAccountNumber(accountNumber);
        return savingAccount;
    }
}
