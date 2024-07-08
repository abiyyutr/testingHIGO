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

WebUI.click(findTestObject('Object Repository/Halaman Annual Report/a_Annual Report'))

WebUI.click(findTestObject('Object Repository/Halaman Annual Report/button_Download Full Report'))

WebUI.setText(findTestObject('Object Repository/Halaman Annual Report/input_HIGO DIGITAL MANUAL 2024_firstname'), 'abiyyu')

WebUI.setText(findTestObject('Object Repository/Halaman Annual Report/input_HIGO DIGITAL MANUAL 2024_lastname'), 'ramadhan')

WebUI.setText(findTestObject('Object Repository/Halaman Annual Report/input_HIGO DIGITAL MANUAL 2024_email'), 'abiyyutr@gmail.com')

WebUI.setText(findTestObject('Object Repository/Halaman Annual Report/input_HIGO DIGITAL MANUAL 2024_phone'), '085271239466')

WebUI.setText(findTestObject('Object Repository/Halaman Annual Report/input_HIGO DIGITAL MANUAL 2024_company'), 'pt.abc')

WebUI.setText(findTestObject('Object Repository/Halaman Annual Report/input_HIGO DIGITAL MANUAL 2024_job'), 'qa')

WebUI.click(findTestObject('Object Repository/Halaman Annual Report/button_Download'))

