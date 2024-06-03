package protoype;

public class Address {

	private String city;
	private int pin;

	public Address(Address address) {
		this.city = address.city;
		this.pin = address.pin;
	}

	public Address(String city, int pin) {
		this.city = city;
		this.pin = pin;
	}

	public Address() {
		super();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + "]";
	}

}
