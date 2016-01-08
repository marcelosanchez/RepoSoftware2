package ec.edu.espol;

public class CallService {
	
	
	
	public ICalculator getCal() {
		return cal;
	}

	public void setCal(ICalculator cal) {
		this.cal = cal;
	}

	ICalculator cal;
	
	public int addTwoNumbers(int x, int y) {
		return cal.add(x, y);
	}
}
