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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement
import java.util.Arrays
import com.kms.katalon.core.model.FailureHandling as FailureHandling

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://mifx.com/clientarea/trade-now')

WebUI.setText(findTestObject('Page_Client Area MIFX  Raih Peluang Profit Anda/input_Email_username'), 'test1@example.com')

WebUI.setEncryptedText(findTestObject('Page_Client Area MIFX  Raih Peluang Profit Anda/input_Password_LiveTmp_password'), 
    'DwTTIjmC6TINHlIjJvfyFw==')

WebUI.click(findTestObject('Page_Client Area MIFX  Raih Peluang Profit Anda/input_Lupa Password_submit'))


WebUI.click(findTestObject('Object Repository/Page_Broker Forex Terbesar Indonesia  MIFX/input_Qty_qty'))



WebUI.setText(findTestObject('Object Repository/Page_Broker Forex Terbesar Indonesia  MIFX/input_Qty_qty'), '0.01')

TestObject qtyInput = findTestObject('Object Repository/Page_Broker Forex Terbesar Indonesia  MIFX/input_Qty_qty')
WebUI.waitForElementPresent(qtyInput, 15)

WebElement qtyElement = WebUiCommonHelper.findWebElement(qtyInput, 10)
WebUI.executeJavaScript(
	"arguments[0].value = '0.01'; arguments[0].dispatchEvent(new Event('input', { bubbles: true }));",
	Arrays.asList(qtyElement)
)








WebUI.click(findTestObject('Object Repository/Page_Broker Forex Terbesar Indonesia  MIFX/button_ORDER SEKARANG'))
WebUI.delay(4)
WebUI.closeBrowser()

