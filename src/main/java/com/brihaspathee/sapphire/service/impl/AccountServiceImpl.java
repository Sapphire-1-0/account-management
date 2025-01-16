package com.brihaspathee.sapphire.service.impl;

import com.brihaspathee.sapphire.domain.node.Account;
import com.brihaspathee.sapphire.domain.repository.AccountRepository;
import com.brihaspathee.sapphire.exception.AccountNotFoundException;
import com.brihaspathee.sapphire.mapper.interfaces.AccountMapper;
import com.brihaspathee.sapphire.model.AccountDto;
import com.brihaspathee.sapphire.model.AccountList;
import com.brihaspathee.sapphire.service.interfaces.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 1/15/25
 * Time: 7:14 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.service.impl
 * To change this template use File | Settings | File and Code Template
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    /**
     * Account repository instance
     */
    private final AccountRepository accountRepository;

    /**
     * Account mapper instance
     */
    private final AccountMapper accountMapper;

    /**
     * Save the account
     * @param accountDto - The account that needs to be saved
     * @return - The saved account
     */
    @Override
    public AccountDto save(AccountDto accountDto) {
        Account account = accountMapper.toAccount(accountDto);
        account = accountRepository.save(account);
        return accountMapper.toAccountDto(account);
    }

    /**
     * Get all the accounts
     * @return - List of all the accounts
     */
    @Override
    public AccountList getAllAccounts() {
        List<Account> accounts = accountRepository.findAll();
        List<AccountDto> accountDtos = accountMapper.toAccountDtos(accounts);
        return AccountList.builder()
                .accounts(accountDtos)
                .build();
    }

    /**
     * Get account by account number
     * @param accountNumber - the account number to be searched
     * @return - the account that matches the account number
     */
    @Override
    public AccountDto getAccountByAccountNumber(String accountNumber) {
        Account account = accountRepository.findAccountByAccountNumber(accountNumber)
                .orElseThrow(() -> new AccountNotFoundException(accountNumber));
        return accountMapper.toAccountDto(account);
    }
}
