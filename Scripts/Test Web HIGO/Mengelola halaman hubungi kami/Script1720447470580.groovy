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

WebUI.navigateToUrl('https://higo.id/')

WebUI.click(findTestObject('Object Repository/Halaman hubungi kami/a_Hubungi Kami'))

WebUI.setText(findTestObject('Object Repository/Halaman hubungi kami/input_text'), 'biyyu')

WebUI.setText(findTestObject('Object Repository/Halaman hubungi kami/input_email'), 'abiyyutr@gmail.com')

WebUI.setText(findTestObject('Object Repository/Halaman hubungi kami/input_tel'), '085271239466')

WebUI.selectOptionByValue(findTestObject('Object Repository/Halaman hubungi kami/select_Kategori                            _607ddf'), 
    'Wifi Advertising', true)

WebUI.setText(findTestObject('Object Repository/Halaman hubungi kami/input_text_1'), 'untuk test')

WebUI.setText(findTestObject('Object Repository/Halaman hubungi kami/textarea_Hubungi Kami_comment'), 'test')

WebUI.click(findTestObject('Object Repository/Halaman hubungi kami/button_Kirim'))

