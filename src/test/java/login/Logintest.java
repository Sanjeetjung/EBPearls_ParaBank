package login;

import ExcelSheet.ReadDataFromExcel;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.RegisteredUserHomePage;

import java.io.File;
import java.io.IOException;

public class Logintest extends BaseTests {
    @Test
    public void testSuccessfullLogin() throws IOException {
        ReadDataFromExcel read_data_from_excel = new ReadDataFromExcel();

        File file = new File("E:\\F\\EB Pearl\\ExcelSheetData.xlsx");
        int sheetIndex = 1;

        String userName = read_data_from_excel.readDataFromExcel(file, sheetIndex, 2, 0);
        String Password = read_data_from_excel.readDataFromExcel(file, sheetIndex, 2, 1);

        /*
        String userName = "@yopmail.com";
        String Password = "12345678";
        */

        loginPage.setUserName(userName);
        loginPage.setPassword(Password);
        //RegisteredUserHomePage SignIn = loginPage.clickLogin();


    }
}
