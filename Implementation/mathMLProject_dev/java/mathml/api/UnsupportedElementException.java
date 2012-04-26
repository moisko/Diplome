package mathml.api;

public class UnsupportedElementException extends Exception {
	private static final long serialVersionUID = 1L;

	public UnsupportedElementException() {
		super();
	}

	public UnsupportedElementException(String message) {
		super(message);
	}

	public UnsupportedElementException(String message, Exception exception) {
		super(message, exception);
	}
}
