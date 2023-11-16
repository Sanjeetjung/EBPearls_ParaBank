package register;

import ExcelSheet.ReadDataFromExcel;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegisterPage;

import java.io.File;
import java.io.IOException;

public class RegisterTest extends BaseTests {

    @Test
    public void testSuccessfulRegister() throws IOException {
        RegisterPage registerPage = loginPage.clickRegister();
        ReadDataFromExcel read_data_from_excel = new ReadDataFromExcel();


        File file = new File("E:\\F\\EB Pearl\\ExcelSheetData.xlsx");
        int sheetIndex = 0;

        String FirstName = read_data_from_excel.readDataFromExcel(file, sheetIndex, 2, 0);
        String LastName = read_data_from_excel.readDataFromExcel(file, sheetIndex, 2, 1);
        String Address = read_data_from_excel.readDataFromExcel(file, sheetIndex, 2, 2);
        String City = read_data_from_excel.readDataFromExcel(file, sheetIndex, 2, 3);
        String State = read_data_from_excel.readDataFromExcel(file, sheetIndex, 2, 4);
        String ZipCode = read_data_from_excel.readDataFromExcel(file, sheetIndex, 2, 5);
        String PhoneNumber = read_data_from_excel.readDataFromExcel(file, sheetIndex, 2, 6);
        String SSNumber = read_data_from_excel.readDataFromExcel(file, sheetIndex, 2, 7);
        String UserName = read_data_from_excel.readDataFromExcel(file, sheetIndex, 2, 8);
        String Password = read_data_from_excel.readDataFromExcel(file, sheetIndex, 2, 9);
        String ConfirmPassword = read_data_from_excel.readDataFromExcel(file, sheetIndex, 2, 10);

        /*
        String FirstName = "Sanjeet";
        String LastName = "Test";
        String Address = "Itahari";
        String City = "Sunsari";
        String State = "Koshi";
        String ZipCode = "123";
        String PhoneNumber = "1234";
        String SSNumber = "123445";
        String UserName = "Sanjeet1";
        String Password = "!@#$";
        String ConfirmPassword = "!@#$";
        */

        registerPage.setFirstName(FirstName);
        registerPage.setLastName(LastName);
        registerPage.setAddress(Address);
        registerPage.setCity(City);
        registerPage.setState(State);
        registerPage.setZipCode(ZipCode);
        registerPage.setPhoneNumber(PhoneNumber);
        registerPage.setSsnumber(SSNumber);
        registerPage.setUserName(UserName);
        registerPage.setPassword(Password);
        registerPage.setConfirmPassword(ConfirmPassword);

        LoginPage loginPage1 = registerPage.clickRegisterButton();

    }
}
