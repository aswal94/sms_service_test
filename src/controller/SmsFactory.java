package controller;

import service.ISmsService;
import adapter.LocalSmsServiceAdapter;
import adapter.TwilioSmsServiceAdapter;

public class SmsFactory {

    public static ISmsService getInstance(String smsService){
        ISmsService service = null;

        switch (smsService) {
            case "twilio":
                service = new TwilioSmsServiceAdapter();
                break;

            case "local":
                service = new LocalSmsServiceAdapter();
                break;
        }

        return service;
    }
}
