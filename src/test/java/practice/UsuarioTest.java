package practice;

import org.testng.Assert;
import org.testng.annotations.Test;


public class UsuarioTest {

    @Test
    public void login_credentials_hash(){
        Usuario sut = new Usuario("1111","Laura");

        String actual = UsuarioService.login(sut);
        String expected = "1111/Laura";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void sendPackage_address_queue(){
        Usuario sut = new Usuario("St. Elena", 5);
        String actual = UsuarioService.SendPackageToHome(sut);
        String expected = "PackageSt. Elena Nº 5";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void sendBill_address_queue(){
        Usuario sut = new Usuario("St. Elena", 5);
        String actual = UsuarioService.SendBill(sut);
        String expected = "BillSt. Elena5";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void sendMail_emailAddress_queue(){
        Usuario sut = new Usuario("laura@gmail.com");
        String actual = UsuarioService.SendEmail(sut, "hola");
        String expected = "@laura@gmail.com: hola";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void createCustomHat_headSize_queue(){
        Usuario sut = new Usuario(58);
        String actual = UsuarioService.CreateCustomHat(sut);
        String expected = "New_Hat:58cm";
        Assert.assertEquals(actual,expected);
    }
}
