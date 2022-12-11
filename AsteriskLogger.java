package week05Assignment;

public class AsteriskLogger implements Logger {

	
	
	@Override
	public void log(String log) {
System.out.println("***" + log + "***");		
	}

	@Override
	public void error(String error) {
System.err.println("****************"+ "\n" + "***error:" + error + "***" + "\n****************");		
	}

}
