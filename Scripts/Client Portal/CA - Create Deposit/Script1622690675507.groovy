import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fdt-portal.smarttrust.welton.ee/')

WebUI.click(findTestObject('Object Repository/Page_Login  Legacy Trust Company/input_E-Mail_Username'))

WebUI.click(findTestObject('Object Repository/Page_Login  Legacy Trust Company/div_E-Mail_input-group input-group-merge focus'))

WebUI.setText(findTestObject('Object Repository/Page_Login  Legacy Trust Company/input_E-Mail_Username'), 'bear.garner@welton.ee')

WebUI.setEncryptedText(findTestObject('Page_Login  Legacy Trust Company/input_Password'), 
    '9S3yURSOuAr5mT4+vExh6A==')

WebUI.click(findTestObject('Object Repository/Page_Login  Legacy Trust Company/button_Sign in'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Select Client  First Digital Trust/select_Select clientJanno JrvYellow Banana Co'), 
    '1: 1', true)

WebUI.click(findTestObject('Object Repository/Page_Select Client  First Digital Trust/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_First Digital Trust/span_Janno Jrv'))

WebUI.verifyElementText(findTestObject('Page_First Digital Trust/span_Janno Jrv'), 'Janno Järv')

