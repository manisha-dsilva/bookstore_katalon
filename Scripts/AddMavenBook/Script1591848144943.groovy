import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/clickBooks'))
WebUI.click(findTestObject('Object Repository/booksMaven'))
WebUI.click(findTestObject('Object Repository/AddNewBook'))

WebUI.sendKeys(findTestObject('Object Repository/InputBookName'), bookName)
WebUI.sendKeys(findTestObject('Object Repository/InputBookAuthor'), bookAuthor)
WebUI.sendKeys(findTestObject('Object Repository/InputReferenceLink2'), bookLink)

WebUI.click(findTestObject('Object Repository/selectType2'))
WebUI.click(findTestObject('Object Repository/mavenType'))

WebUI.click(findTestObject('Object Repository/saveButton'))

WebUI.closeBrowser()