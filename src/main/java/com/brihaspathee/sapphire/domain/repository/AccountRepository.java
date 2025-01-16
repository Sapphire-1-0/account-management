package com.brihaspathee.sapphire.domain.repository;

import com.brihaspathee.sapphire.domain.node.Account;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Optional;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 1/15/25
 * Time: 6:56 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.domain.repository
 * To change this template use File | Settings | File and Code Template
 */
public interface AccountRepository extends Neo4jRepository<Account, Long> {

    /**
     * Find account by the account number
     * @param accountNumber - The account number of the account to be found
     * @return - the matched account
     */
    Optional<Account> findAccountByAccountNumber(String accountNumber);
}
