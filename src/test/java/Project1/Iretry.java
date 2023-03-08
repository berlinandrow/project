package Project1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Iretry  implements IRetryAnalyzer{
int count =0;
int limit = 2;
	@Override
	public boolean retry(ITestResult result) {
		if(count<limit) {
			count++;
			return true;
		}
		return false;
	}

	
}
