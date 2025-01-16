package com.brihaspathee.sapphire.controllers.interfaces;

import com.brihaspathee.sapphire.web.dto.WelcomeDto;
import com.brihaspathee.sapphire.web.response.SapphireAPIResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 1/15/25
 * Time: 6:07 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.controllers.interfaces
 * To change this template use File | Settings | File and Code Template
 */
@RequestMapping("/api/v1/sapphire/account")
@Validated
public interface WelcomeAPI {

    /**
     * Welcome endpoint to check for connectivity
     * @return - Welcome message
     */
    @GetMapping("/welcome")
    ResponseEntity<SapphireAPIResponse<WelcomeDto>> getWelcomeMessage();
}
