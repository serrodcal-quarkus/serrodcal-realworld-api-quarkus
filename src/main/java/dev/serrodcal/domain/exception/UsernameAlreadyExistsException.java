package dev.serrodcal.domain.exception;

public class UsernameAlreadyExistsException extends BusinessException {

    public UsernameAlreadyExistsException() {
        super(2, "username already exists");
    }

}
