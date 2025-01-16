package com.brihaspathee.sapphire.controllers.interfaces;

import com.brihaspathee.sapphire.model.AccountDto;
import com.brihaspathee.sapphire.model.AccountList;
import com.brihaspathee.sapphire.web.response.SapphireAPIResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 1/15/25
 * Time: 7:27 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.controllers.interfaces
 * To change this template use File | Settings | File and Code Template
 */
@RequestMapping("/api/v1/sapphire/account")
public interface AccountAPI {

    /**
     * Create a new account
     * @param accountDto - details of the account to be created
     * @return - The account that was created
     */
    @PostMapping
    ResponseEntity<SapphireAPIResponse<AccountDto>> createAccount(
            @RequestBody AccountDto accountDto);

    /**
     * Get all the accounts
     * @return - all the accounts in the system
     */
    @GetMapping
    ResponseEntity<SapphireAPIResponse<AccountList>> getAllAccounts();

    /**
     * Get account that matches the account number
     * @param accountNumber - the account number of the account
     * @return - the matched account
     */
    @GetMapping("/{accountNumber}")
    ResponseEntity<SapphireAPIResponse<AccountDto>> getAccount(@PathVariable String accountNumber);
}
