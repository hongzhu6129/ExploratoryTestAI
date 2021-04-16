package ClassifierExperiments;


public class TwoD {
	public double x;
	public double y;
	
	public TwoD() {
		x=0; y=0;  
	}
	
	public TwoD(double a, double b) {
		x=a; y=b;
	}
	
	public String toString() {
		String str = "<"+x+"|"+y+">";
		return str;
	}
	
	public void valueOf(String str) {
		String xStr = str.split("\\|")[0].substring(1);
		x = Double.parseDouble(xStr);
		String yStr = str.split("\\|")[1];
		yStr = yStr.substring(0,yStr.length()-1);
		y = Double.parseDouble(yStr);
	}
}