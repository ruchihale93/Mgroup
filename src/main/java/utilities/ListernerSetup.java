package utilities;


	
	

	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;



	public class ListernerSetup  implements ITestListener  {

		@Override
		public void onTestStart(ITestResult result) {
			System.out.println("Test case execution started - "+result.getName());
			
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("Test case execution completed - "+result.getName());
		}

		@Override
		public void onTestFailure(ITestResult result) {
			System.out.println("Test case execution failed - "+result.getName());
			ScreenshotCode.takeSS(result.getName()+"-"+ System.currentTimeMillis());
			System.out.println("Take Screenshot");
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			System.out.println("Test case execution skipped - "+result.getName());
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
		}

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			
		}

		@Override
		public void onStart(ITestContext context) {
			
		}

		@Override
		public void onFinish(ITestContext context) {
			
		}
	}



