package external;

import service.implementations.OtpService;

public class LocalSmsService {
    public void otpBhejDo() {
        System.out.println("Generating OTP");
        int otp = OtpService.generateOtp();

        System.out.println("local serivce login send logi -> no + message");
    }
}
