package adapter;

import service.ISmsService;

public class LocalSmsServiceAdapter implements ISmsService {
    @Override
    public void sendOtp() {
        external.LocalSmsService localSmsService = new external.LocalSmsService();
        localSmsService.otpBhejDo();
    }
}
