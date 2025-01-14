package in.balaji;

public class Car {
	Car(){
		System.out.println("Car constructor");
	}
	private Engine eng;
	public void setEng(Engine eng) {
		this.eng = eng;
		System.out.println("Engine setter");
	}
	public void drive() {
		System.out.println("Car started");
	}
	
}
