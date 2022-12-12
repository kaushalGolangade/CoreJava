package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener{
@Override
public void onTestStart(ITestResult result) {
	
	System.out.println("On test start");
}

@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("On test Syuccess");
}

@Override
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("On test failure");
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("On test skipped");
}


}