package com.brihaspathee.sapphire.mapper.interfaces;

import com.brihaspathee.sapphire.domain.node.Account;
import com.brihaspathee.sapphire.model.AccountDto;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 1/15/25
 * Time: 6:59 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.mapper.interfaces
 * To change this template use File | Settings | File and Code Template
 */
public interface AccountMapper {

    /**
     * Convert from account dto to account entity
     * @param accountDto - the dto to be converted
     * @return - return the converted entity
     */
    Account toAccount(AccountDto accountDto);

    /**
     * Convert from account entity to dto
     * @param account - entity to be converted
     * @return - the converted entity
     */
    AccountDto toAccountDto(Account account);

    /**
     * Convert the dtos to entities
     * @param accountDtos - dtos to be converted
     * @return - return the converted entities
     */
    List<Account> toAccounts(List<AccountDto> accountDtos);

    /**
     * Convert entities to dtos
     * @param accounts - entities to be converted
     * @return - the converted dtos
     */
    List<AccountDto> toAccountDtos(List<Account> accounts);
}
