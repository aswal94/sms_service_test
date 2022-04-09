package controller;


import service.ISmsService;

public class RegisterController {
    private ISmsService smsService;

    // DI
    public RegisterController(ISmsService smsService){
        this.smsService = smsService;
    }
    public void createUser() {
        // validate
        // persist user to db
        smsService.sendOtp();
        // return success
    }
}
