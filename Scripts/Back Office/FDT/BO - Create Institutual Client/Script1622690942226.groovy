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

WebUI.navigateToUrl('https://fdt-backoffice.smarttrust.welton.ee/', FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fdt-backoffice.smarttrust.welton.ee/')

WebUI.setText(findTestObject('Object Repository/Page_Login  Legacy Trust Company/input_E-Mail_Username'), 'admin@ltc.internal')

WebUI.setEncryptedText(findTestObject('Page_Login  Legacy Trust Company/input_Password'), 
    '9S3yURSOuAr5mT4+vExh6A==')

WebUI.click(findTestObject('Object Repository/Page_Login  Legacy Trust Company/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  1st Digital Trust/span_Choose the function that you would lik_8bbc3a'))

WebUI.click(findTestObject('Object Repository/Page_CRM  1st Digital Trust/span_Clients'))

WebUI.click(findTestObject('Object Repository/Page_Clients  1st Digital Trust/button_New Client'))

WebUI.click(findTestObject('Object Repository/Page_Clients  1st Digital Trust/a_Individual'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Clients  1st Digital Trust/a_Individual'), 'Date of birth is invalid"\nDate of birth is invalid\nDate of birth is invalid')

WebUI.setText(findTestObject('Object Repository/Page_1st Digital Trust/input_First name_form-control ng-untouched _7830ed'), 
    'Individual')

WebUI.setText(findTestObject('Object Repository/Page_1st Digital Trust/input_Date of birth_form-control date-mask _31cb38'), 
    '01.01.200')

WebUI.verifyElementText(findTestObject('Page_1st Digital Trust/span_Date of birth is invalid'), '\nDate of birth is invalid')

WebUI.click(findTestObject('Object Repository/Page_1st Digital Trust/span_Date of birth is invalid'))

WebUI.doubleClick(findTestObject('Object Repository/Page_1st Digital Trust/span_Date of birth is invalid'))

WebUI.navigateToUrl('https://fdt-backoffice.smarttrust.welton.ee/crm/clients/create-individual')

