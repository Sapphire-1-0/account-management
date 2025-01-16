package com.brihaspathee.sapphire.model;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 1/15/25
 * Time: 6:56 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {

    /**
     * Account id of the account
     */
    private Long accountId;

    /**
     * The 15 character account number of the account
     */
    private String accountNumber;

    /**
     * The line of business the account belongs to
     */
    private String lineOfBusinessTypeCode;
}
