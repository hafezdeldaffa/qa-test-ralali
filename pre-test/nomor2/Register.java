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

WebUI.navigateToUrl('https://www.ralali.com/')

WebUI.click(findTestObject('Object Repository/Pages/Ralali Daftar/Page_Wholesale Marketplace - Pusat Toko Gro_f9f862/button_Masuk  Daftar'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali Daftar/Page_Wholesale Marketplace - Pusat Toko Gro_f9f862/a_Daftar'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali Daftar/Page_Daftar  Register  Ralali.com/div_IndividuBelanja sebagai individu'))

WebUI.setText(findTestObject('Object Repository/Pages/Ralali Daftar/Page_Daftar  Register  Ralali.com/input_Masuk_fullname'), 
    'Hafezd El Daffa')

WebUI.setText(findTestObject('Object Repository/Pages/Ralali Daftar/Page_Daftar  Register  Ralali.com/input_Masuk_username'), 
    'hafezdeldaffa@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Pages/Ralali Daftar/Page_Daftar  Register  Ralali.com/input_Masuk_TextInput__Input-jfrtn4-5 fDezq_b65191'), 
    'v84jiRvO0hVbO+e8WTrrvA==')

WebUI.click(findTestObject('Object Repository/Pages/Ralali Daftar/Page_Daftar  Register  Ralali.com/span'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali Daftar/Page_Daftar  Register  Ralali.com/button_Daftar'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali Daftar/Page_Daftar  Register  Ralali.com/div_Melalui Emailke hafezdeldag.c'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali Daftar/Page_Wholesale Marketplace - Pusat Toko Gro_f9f862/span_Keluar'))

