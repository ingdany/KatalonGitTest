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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Receive Samples/Page_Avera/span_samplemanagement'))

WebUI.click(findTestObject('Receive Samples/Page_Avera/span_receivesamples'))

WebUI.click(findTestObject('Receive Samples/Page_Avera/div_option'))

WebUI.click(findTestObject('Receive Samples/Page_Avera/li_Other'))

WebUI.delay(1)

WebUI.setText(findTestObject('Receive Samples/Page_Avera/txt_tube1'), 'IJ8176680700')

WebUI.scrollToElement(findTestObject('Receive Samples/Page_Avera/btn_verify'), 10)

WebUI.click(findTestObject('Receive Samples/Page_Avera/btn_verify'))

WebUI.verifyTextPresent('Successfully verified task Receive Samples', false)

