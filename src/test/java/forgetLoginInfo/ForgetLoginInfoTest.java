package forgetLoginInfo;

import ExcelSheet.ReadDataFromExcel;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgetLoginInfoPage;
import pages.RegisteredUserHomePage;

import java.io.File;
import java.io.IOException;


public class ForgetLoginInfoTest extends BaseTests {
    @Test
    public void forgetLoginInfoTest() throws IOException {

        ForgetLoginInfoPage forgetLoginInfoPage = loginPage.forgetLoginInfoPage();
        ReadDataFromExcel read_data_from_excel = new ReadDataFromExcel();

        File file = new File("E:\\F\\EB_Pearl\\ExcelSheetData.xlsx");
        int sheetIndex = 2;

        String FirstName = read_data_from_excel.readDataFromExcel(file, sheetIndex, 1, 0);
        String LastName = read_data_from_excel.readDataFromExcel(file, sheetIndex, 1, 1);
        String Address = read_data_from_excel.readDataFromExcel(file, sheetIndex, 1, 2);
        String City = read_data_from_excel.readDataFromExcel(file, sheetIndex, 1, 3);
        String State = read_data_from_excel.readDataFromExcel(file, sheetIndex, 1, 4);
        String ZipCode = read_data_from_excel.readDataFromExcel(file, sheetIndex, 1, 5);
        String SSNumber = read_data_from_excel.readDataFromExcel(file, sheetIndex, 1, 6);

        /*
        String FirstName = "Sanjeet";
        String LastName = "Test";
        String Address = "Itahari";
        String City = "Sunsari";
        String State = "Koshi";
        String ZipCode = "123";
        String SSNumber = "123445";
        */
        forgetLoginInfoPage.setFirstName(FirstName);
        forgetLoginInfoPage.setLastName(LastName);
        forgetLoginInfoPage.setAdress(Address);
        forgetLoginInfoPage.setCity(City);
        forgetLoginInfoPage.setState(State);
        forgetLoginInfoPage.setZipCode(ZipCode);
        forgetLoginInfoPage.setSSNumber(SSNumber);

        RegisteredUserHomePage SignIn = loginPage.clickLogin();
    }
}
