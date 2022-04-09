import controller.RegisterController;
import controller.SmsFactory;

public class SmsGatewayServiceTest {
    public static void main(String[] args) {
        new RegisterController(SmsFactory.getInstance(Config.SMS_GATEWAY))
                .createUser();
    }
}
