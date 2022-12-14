package test;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//ITestListener je interfejs koji implementira Testing listenere??
public class Listeners implements ITestListener{

	
	// Right click (where u have generate this interface)
	// Go to source
	// Click on overide/implement methods 
	// Select the check boxes for the ITest listener (make sure all check box inside it should be checked )...ok
//i onda psemo kod sta da radi u tim slucajevima
	
	/*obavezno u xml fajlu ispod suite nae-a  napisati putanju gde se nalazi listeners folder:
	 
					<listeners>
						<listener class-name="test.Listeners"/>
					</listeners>
	*/
	
	
	
	//ako zelim da mi napise u kom testu je osluskuvac odradio svoju metodu idemo u metodi listenera result.getName();
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	}

	
	
	//ako zelim da mi napise u kom testu je osluskuvac odradio svoju metodu idemo u metodi listenera result.getName();

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I failed in executing this test: " + result.getName());		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
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
