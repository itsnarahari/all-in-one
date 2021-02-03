package com.allinone.practice;

import hu.alphabox.spamc.*;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.InetAddress;

public class SpamChecker {

    public static void main(String[] args) throws IOException, SAException {
        SARequest request = new SARequest();
        //GTUBE message string
        request.setMessage(" controller advice allows you to use exactly the same exception handling techniques but apply them across the whole application, not just to an individual controller. You can think of them as an annotation driven interceptor.");
        request.useCompression(false);
        SAClient client = new SAClient(InetAddress.getByName("localhost"), 783);
        request.setCommand(SACommand.REPORT);
        request.addHeader("To","abc@gmail.com");
        request.addHeader("Subject","mail conformation");
        SAResponse response = client.sendRequest(request);
        System.out.println(response);
    }
}

