package com.brihaspathee.sapphire.domain.node;

import lombok.*;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 1/15/25
 * Time: 6:52 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.domain.node
 * To change this template use File | Settings | File and Code Template
 */
@Node("Account")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    /**
     * The primary key of the user node
     */
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private Long accountId;

    /**
     * The 15 character account number
     */
    private String accountNumber;

    /**
     * The line of business the account belongs to.
     */
    private String lineOfBusinessTypeCode;
}
