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

WebUI.click(findTestObject('Object Repository/Pages/Ralali search product/Page_Wholesale Marketplace - Pusat Toko Gro_f9f862/button_Masuk  Daftar'))

WebUI.setText(findTestObject('Object Repository/Pages/Ralali search product/Page_Wholesale Marketplace - Pusat Toko Gro_f9f862/input_Masuk Akun Ralali_username'), 
    'hafezdeldaffa@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Pages/Ralali search product/Page_Wholesale Marketplace - Pusat Toko Gro_f9f862/input_Masuk Akun Ralali_TextInput__Input-jf_5c5240'), 
    'v84jiRvO0hVbO+e8WTrrvA==')

WebUI.click(findTestObject('Object Repository/Pages/Ralali search product/Page_Wholesale Marketplace - Pusat Toko Gro_f9f862/button_Masuk'))

WebUI.setText(findTestObject('Object Repository/Pages/Ralali search product/Page_Wholesale Marketplace - Pusat Toko Gro_f9f862/input_Hafezd El Daffa_SearchBar__Input-wo5b_1e885e'), 
    'bor')

WebUI.click(findTestObject('Object Repository/Pages/Ralali search product/Page_Wholesale Marketplace - Pusat Toko Gro_f9f862/div_bor_SearchBar__SearchButtonWrapper-wo5b_f8e7ef'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali search product/Page_Daftar Harga Bor - Agustus 2022  Ralali.com/button_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali search product/Page_Daftar Harga Bor - Agustus 2022  Ralali.com/button_Batal'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali search product/Page_Daftar Harga Bor - Agustus 2022  Ralali.com/div_J.LD Mesin bor set bor 13 mm bor tembok_9b102f'))

WebUI.switchToWindowTitle('Lengkapedia - Jual J.LD Mesin bor set bor 13 mm bor tembok beton bor tangan | Ralali.com')

WebUI.click(findTestObject('Object Repository/Pages/Ralali search product/Page_Lengkapedia - Jual J.LD Mesin bor set _7743d2/div_'))

