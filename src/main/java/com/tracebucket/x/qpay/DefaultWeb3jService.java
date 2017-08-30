package com.tracebucket.x.qpay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;

import java.io.IOException;

/**
 * Default web3j service.
 */
@Service
public class DefaultWeb3jService implements Web3jService {

    @Autowired
    private Web3j web3j;

    @Override
    public String getClientVersion() throws IOException {
        Web3ClientVersion web3ClientVersion = web3j.web3ClientVersion().send();
        return web3ClientVersion.getWeb3ClientVersion();
    }
}
