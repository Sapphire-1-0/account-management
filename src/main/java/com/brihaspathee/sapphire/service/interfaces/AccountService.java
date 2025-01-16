package com.brihaspathee.sapphire.service.interfaces;

import com.brihaspathee.sapphire.model.AccountDto;
import com.brihaspathee.sapphire.model.AccountList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 1/15/25
 * Time: 7:09 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.service.interfaces
 * To change this template use File | Settings | File and Code Template
 */
public interface AccountService {

    /**
     * Save the account
     * @param accountDto - The account that needs to be saved
     * @return - The saved account
     */
    AccountDto save(AccountDto accountDto);

    /**
     * Get all the accounts
     * @return - List of all the accounts
     */
    AccountList getAllAccounts();

    /**
     * Get account by account number
     * @param accountNumber - the account number to be searched
     * @return - the account that matches the account number
     */
    AccountDto getAccountByAccountNumber(String accountNumber);
}
