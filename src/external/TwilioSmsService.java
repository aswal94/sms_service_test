package external;

import service.implementations.OtpService;

public class TwilioSmsService {

    public boolean sendOtp() {
        System.out.println("Generating OTP");
        int otp = OtpService.generateOtp();

        System.out.println("twilio send logi -> no + message");
        return true;
    }
}
