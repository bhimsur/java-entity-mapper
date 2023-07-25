package io.bhimsur.rnd.mapper;

import io.bhimsur.rnd.domain.Account;
import io.bhimsur.rnd.dto.AccountDTO;
import io.bhimsur.rnd.util.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {DepositAccountMapper.class, SavingAccountMapper.class})
public interface AccountMapper extends EntityMapper<Account, AccountDTO> {
    @Mapping(source = "name", target = "accountName")
    AccountDTO toDto(Account account);

    Account toEntity(AccountDTO accountDTO);

    default Account fromIdCardNumber(String idCardNumber) {
        if (null == idCardNumber) {
            return null;
        }
        Account account = new Account();
        account.setIdCardNumber(idCardNumber);
        return account;
    }
}
