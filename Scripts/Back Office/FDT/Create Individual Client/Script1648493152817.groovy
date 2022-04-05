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

WebUI.callTestCase(findTestCase('Back Office/FDT/Login (Positive)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Dashboard  1st Digital Trust/span_Choose the function that you would lik_8bbc3a'))

WebUI.click(findTestObject('Object Repository/Page_CRM  1st Digital Trust/span_Clients'))

WebUI.click(findTestObject('Object Repository/Page_Clients  1st Digital Trust/button_New Client'))

WebUI.click(findTestObject('Object Repository/Page_Clients  1st Digital Trust/a_Individual'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_1st Digital Trust/h4_New Individual Client Application'), 
    'New Individual Client Application')

WebUI.setText(findTestObject('Object Repository/Page_1st Digital Trust/input_First name_form-control ng-untouched _7830ed'), 
    'Individual')

WebUI.setText(findTestObject('Object Repository/Page_1st Digital Trust/input_(if any)_form-control ng-untouched ng-pristine ng-valid'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Page_1st Digital Trust/input_Last  Family Name_form-control ng-untouched ng-pristine ng-invalid'), 
    'Creating')

WebUI.sendKeys(findTestObject('Object Repository/Page_1st Digital Trust/input_Last  Family Name_form-control ng-untouched ng-pristine ng-invalid'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_1st Digital Trust/div_Please correct validation errors on the_86a02b'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_1st Digital Trust/span_Date of Birth is required'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_1st Digital Trust/span_Gender is required'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_1st Digital Trust/span_Citizenship is required'), 30)

WebUI.setText(findTestObject('Object Repository/Page_1st Digital Trust/input_Date of Birth_dp'), '01.01.2000')

WebUI.sendKeys(findTestObject('Object Repository/Page_1st Digital Trust/input_Date of Birth_dp'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_1st Digital Trust/span_Gender_ng-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/Page_1st Digital Trust/div_Male'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_1st Digital Trust/span_Gender is required'), 30)

