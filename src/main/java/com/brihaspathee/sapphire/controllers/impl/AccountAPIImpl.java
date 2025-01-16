package com.brihaspathee.sapphire.controllers.impl;

import com.brihaspathee.sapphire.controllers.interfaces.AccountAPI;
import com.brihaspathee.sapphire.model.AccountDto;
import com.brihaspathee.sapphire.model.AccountList;
import com.brihaspathee.sapphire.service.interfaces.AccountService;
import com.brihaspathee.sapphire.web.response.SapphireAPIResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 1/15/25
 * Time: 7:31 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.controllers.impl
 * To change this template use File | Settings | File and Code Template
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class AccountAPIImpl implements AccountAPI {

    /**
     * Account service instance
     */
    private final AccountService accountService;

    /**
     * Create a new account
     * @param accountDto - details of the account to be created
     * @return - The account that was created
     */
    @Override
    public ResponseEntity<SapphireAPIResponse<AccountDto>> createAccount(AccountDto accountDto) {
        AccountDto savedAccount = accountService.save(accountDto);
        SapphireAPIResponse<AccountDto> response = SapphireAPIResponse.<AccountDto>builder()
                .message("The API Call was successful")
                .developerMessage("The API Call was successful")
                .reason("The account was found")
                .statusCode(200)
                .status(HttpStatus.OK)
                .response(savedAccount)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    /**
     * Get all the accounts
     * @return - all the accounts in the system
     */
    @Override
    public ResponseEntity<SapphireAPIResponse<AccountList>> getAllAccounts() {
        AccountList accountList = accountService.getAllAccounts();
        SapphireAPIResponse<AccountList> response = SapphireAPIResponse.<AccountList>builder()
                .message("The API Call was successful")
                .developerMessage("The API Call was successful")
                .reason("The account was found")
                .statusCode(200)
                .status(HttpStatus.OK)
                .response(accountList)
                .build();
        return ResponseEntity.ok(response);
    }

    /**
     * Get account that matches the account number
     * @param accountNumber - the account number of the account
     * @return - the matched account
     */
    @Override
    public ResponseEntity<SapphireAPIResponse<AccountDto>> getAccount(String accountNumber) {
        AccountDto accountDto = accountService.getAccountByAccountNumber(accountNumber);
        SapphireAPIResponse<AccountDto> response = SapphireAPIResponse.<AccountDto>builder()
                .message("The API Call was successful")
                .developerMessage("The API Call was successful")
                .reason("The account was found")
                .statusCode(200)
                .status(HttpStatus.OK)
                .response(accountDto)
                .build();
        return ResponseEntity.ok(response);
    }
}
