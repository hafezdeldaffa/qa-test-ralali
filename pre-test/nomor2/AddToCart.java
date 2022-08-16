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

WebUI.click(findTestObject('Object Repository/Pages/Ralali add to cart/Page_Wholesale Marketplace - Pusat Toko Gro_f9f862/button_Masuk  Daftar'))

WebUI.setText(findTestObject('Object Repository/Pages/Ralali add to cart/Page_Wholesale Marketplace - Pusat Toko Gro_f9f862/input_Masuk Akun Ralali_username'), 
    'hafezdeldaffa@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Pages/Ralali add to cart/Page_Wholesale Marketplace - Pusat Toko Gro_f9f862/input_Masuk Akun Ralali_TextInput__Input-jf_5c5240'), 
    'v84jiRvO0hVbO+e8WTrrvA==')

WebUI.click(findTestObject('Object Repository/Pages/Ralali add to cart/Page_Wholesale Marketplace - Pusat Toko Gro_f9f862/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali add to cart/Page_Wholesale Marketplace - Pusat Toko Gro_f9f862/div_KENMASTER Tool kit BLACK Box - Eclusive_644722'))

WebUI.switchToWindowTitle('Kenmaster Official - Jual KENMASTER Tool kit BLACK Box - Eclusive 100 Pcs | Ralali.com')

WebUI.click(findTestObject('Object Repository/Pages/Ralali add to cart/Page_Kenmaster Official - Jual KENMASTER To_b9d0e7/div_'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali add to cart/Page_Kenmaster Official - Jual KENMASTER To_b9d0e7/button_Batal'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali add to cart/Page_Kenmaster Official - Jual KENMASTER To_b9d0e7/button_Beli Sekarang'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali add to cart/Page_Kenmaster Official - Jual KENMASTER To_b9d0e7/button_Lanjutkan Berbelanja'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali add to cart/Page_Kenmaster Official - Jual KENMASTER To_b9d0e7/article_Gratis OngkirKRISBOW KW1000533 Safe_debf4d'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali add to cart/Page_Kenmaster Official - Jual KENMASTER To_b9d0e7/article_Gratis OngkirKRISBOW KW1000533 Safe_debf4d'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali add to cart/Page_Kenmaster Official - Jual KENMASTER To_b9d0e7/article_Gratis OngkirKRISBOW KW1000533 Safe_debf4d'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali add to cart/Page_Kenmaster Official - Jual KENMASTER To_b9d0e7/span_Cari_icon sprite-header-footer icon-he_10c114'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali add to cart/Page_Kenmaster Official - Jual KENMASTER To_b9d0e7/span_Cari_icon sprite-header-footer icon-he_10c114'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali add to cart/Page_Kenmaster Official - Jual KENMASTER To_b9d0e7/i_Keluar_sprite-header-footer logo-ralali h_5c6d16'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali add to cart/Page_Wholesale Marketplace - Pusat Toko Gro_f9f862/div_Bor Beton Listrik 13mm SacchaPer UnitRp_e5537d'))

WebUI.switchToWindowTitle('T4murah - Jual Bor Beton Listrik 13mm Saccha | Ralali.com')

WebUI.click(findTestObject('Object Repository/Pages/Ralali add to cart/Page_T4murah - Jual Bor Beton Listrik 13mm _86c2b7/div_'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali add to cart/Page_T4murah - Jual Bor Beton Listrik 13mm _86c2b7/button_Beli Sekarang'))

WebUI.click(findTestObject('Object Repository/Pages/Ralali add to cart/Page_T4murah - Jual Bor Beton Listrik 13mm _86c2b7/button_Lanjutkan Berbelanja'))

