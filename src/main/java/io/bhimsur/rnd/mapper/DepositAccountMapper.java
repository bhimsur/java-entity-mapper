package io.bhimsur.rnd.mapper;

import io.bhimsur.rnd.domain.DepositAccount;
import io.bhimsur.rnd.dto.DepositAccountDTO;
import io.bhimsur.rnd.util.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepositAccountMapper extends EntityMapper<DepositAccount, DepositAccountDTO> {
    default DepositAccount fromAccountNumber(String accountNumber) {
        if (null == accountNumber) {
            return null;
        }
        DepositAccount depositAccount = new DepositAccount();
        depositAccount.setAccountNumber(accountNumber);
        return depositAccount;
    }
}
