package com.brihaspathee.sapphire.mapper.impl;

import com.brihaspathee.sapphire.domain.node.Account;
import com.brihaspathee.sapphire.mapper.interfaces.AccountMapper;
import com.brihaspathee.sapphire.model.AccountDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 1/15/25
 * Time: 7:03 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.mapper.impl
 * To change this template use File | Settings | File and Code Template
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class AccountMapperImpl implements AccountMapper {

    /**
     * Convert from account dto to account entity
     * @param accountDto - the dto to be converted
     * @return - return the converted entity
     */
    @Override
    public Account toAccount(AccountDto accountDto) {
        if (accountDto == null) {
            return null;
        }
        Account account = Account.builder()
                .accountId(accountDto.getAccountId())
                .accountNumber(accountDto.getAccountNumber())
                .lineOfBusinessTypeCode(accountDto.getLineOfBusinessTypeCode())
                .build();
        return account;
    }

    /**
     * Convert from account entity to dto
     * @param account - entity to be converted
     * @return - the converted entity
     */
    @Override
    public AccountDto toAccountDto(Account account) {
        if (account == null) {
            return null;
        }
        AccountDto accountDto = AccountDto.builder()
                .accountId(account.getAccountId())
                .accountNumber(account.getAccountNumber())
                .lineOfBusinessTypeCode(account.getLineOfBusinessTypeCode())
                .build();
        return accountDto;
    }

    /**
     * Convert the dtos to entities
     * @param accountDtos - dtos to be converted
     * @return - return the converted entities
     */
    @Override
    public List<Account> toAccounts(List<AccountDto> accountDtos) {
        return List.of();
    }

    /**
     * Convert entities to dtos
     * @param accounts - entities to be converted
     * @return - the converted dtos
     */
    @Override
    public List<AccountDto> toAccountDtos(List<Account> accounts) {
        return List.of();
    }
}
