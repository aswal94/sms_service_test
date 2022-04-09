package adapter;

import service.ISmsService;

public class TwilioSmsServiceAdapter implements ISmsService {
    @Override
    public void sendOtp() {
        external.TwilioSmsService twilioSmsService = new external.TwilioSmsService();
        twilioSmsService.sendOtp();
    }
}
