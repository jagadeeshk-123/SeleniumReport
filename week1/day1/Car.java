package week1.day1;

public class Car {
	public static void main(String[] args) {
		Car Rollsroyce=new Car();
		Rollsroyce.ApplyBreak();
		Rollsroyce.SoundHorn();
		Rollsroyce.TurnonAC();
		
	}
	
	public void ApplyBreak() {
		System.out.println("Apply Break");
	}
	public void SoundHorn() {
		System.out.println("SoundHorn");
}
	public  void TurnonAC() {
		System.out.println("TurnonAC");
	}
}