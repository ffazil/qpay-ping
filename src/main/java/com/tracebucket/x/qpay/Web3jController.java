package com.tracebucket.x.qpay;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

/**
 * @author firoz
 * @since 24/07/17
 */
@Controller
@RequiredArgsConstructor
public class Web3jController {

    @NonNull
    private final Web3jService web3jService;

    @RequestMapping(path = "/ping", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> ping() throws IOException {
        return ResponseEntity.ok(web3jService.getClientVersion());
    }

}
