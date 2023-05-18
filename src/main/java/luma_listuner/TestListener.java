package luma_listuner;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import luma_Base_page.Super_class;
import luma_genaric_functions.CommonMethods;

public class TestListener extends Super_class implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Will start" + result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Will success" + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Will fail and take screenshot" + result.getName());

		CommonMethods.captureScreenshot(driver, "fail test cases");
			}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
