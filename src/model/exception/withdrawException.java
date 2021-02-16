package model.exception;

public class withdrawException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public withdrawException(String msg) {
		super(msg);
	}
}
