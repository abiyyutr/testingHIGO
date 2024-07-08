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

WebUI.navigateToUrl('https://blog.higo.id/')

//WebUI.click(findTestObject('Halaman blog HIGO/tutup_iklan'))
//WebUI.click(findTestObject('Object Repository/Halaman blog HIGO/a_HIGOes Update'))
//
//WebUI.click(findTestObject('Object Repository/Halaman blog HIGO/a_Hangout'))
//
//WebUI.click(findTestObject('Object Repository/Halaman blog HIGO/a_Lifestyle'))
//
//WebUI.click(findTestObject('Object Repository/Halaman blog HIGO/a_Tech  Social Media'))
//
//WebUI.click(findTestObject('Object Repository/Halaman blog HIGO/a_Business Tips'))
//
//WebUI.click(findTestObject('Object Repository/Halaman blog HIGO/input_Business Tips_w-1012 px-1 focusoutlin_d9af88'))
//
//WebUI.setText(findTestObject('Object Repository/Halaman blog HIGO/input_Business Tips_w-1012 px-1 focusoutlin_d9af88'), 
//    'evoria')
//
//WebUI.click(findTestObject('Object Repository/Halaman blog HIGO/button_Business Tips_w-312'))
//
//WebUI.click(findTestObject('Object Repository/Halaman blog HIGO/h2_Evoria 2024 Hadir dengan 4 Sub-culture'))
WebUI.closeBrowser()

