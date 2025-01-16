package com.brihaspathee.sapphire.controllers.impl;

import com.brihaspathee.sapphire.controllers.interfaces.WelcomeAPI;
import com.brihaspathee.sapphire.web.dto.WelcomeDto;
import com.brihaspathee.sapphire.web.response.SapphireAPIResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 1/15/25
 * Time: 6:26 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.controllers.impl
 * To change this template use File | Settings | File and Code Template
 */
@Slf4j
@RestController
public class WelcomeAPIImpl implements WelcomeAPI {

    /**
     * Create a welcome message to ensure connectivity
     * @return
     */
    @Override
    public ResponseEntity<SapphireAPIResponse<WelcomeDto>> getWelcomeMessage() {
        WelcomeDto welcomeDto = WelcomeDto.builder()
                .welcomeMessage("Welcome to Sapphire Account Management Service. Your connection is good")
                .build();
        SapphireAPIResponse<WelcomeDto> response = SapphireAPIResponse.<WelcomeDto>builder()
                .message("API CALL SUCCESS")
                .build();
        return null;
    }
}
