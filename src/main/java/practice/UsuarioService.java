package practice;

public class UsuarioService {

    public static String login(ICredentials credentials) {
        return credentials.GetPassword() +  "/" + credentials.GetUsername();
    }

    public static String SendPackageToHome(IShipping shipping) {
        return "Package" + shipping.GetAddress() + " Nº " +  shipping.GetHouseNumber();
    }

    public static String SendBill(IShipping shipping){
        return "Bill" + shipping.GetAddress() + shipping.GetHouseNumber();
    }


    public static String SendEmail(IEmail email, String text) {
        return "@" + email.GetEmail() + ": "+ text;
    }

    public static String CreateCustomHat(IBodyMeasure sut) {
        return  "New_Hat:" + sut.GetHeadSize() + "cm";
    }
}

