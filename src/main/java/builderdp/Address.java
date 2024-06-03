package builderdp;

public class Address {

	private final String state;
	private final Integer pin;

	public Address(AddressBuilder builder) {
		this.state = builder.state;
		this.pin = builder.pin;
	}

	public int getPin() {
		return pin;
	}

	public String getState() {
		return state;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", pin=" + pin + "]";
	}

	public static class AddressBuilder {

		private final String state;
		private Integer pin;

		public AddressBuilder(String state) {
			this.state = state;
		}

		public AddressBuilder pin(int pin) {
			this.pin = pin;
			return this;
		}

		public Address build() {
			return new Address(this);
		}
	}
}
