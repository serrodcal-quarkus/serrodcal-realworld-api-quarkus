package dev.serrodcal.domain.model.user;

import dev.serrodcal.domain.model.validator.ModelValidator;
import jakarta.inject.Named;

import java.util.UUID;

@Named
public class UserModelBuilder {

    private final ModelValidator modelValidator;

    public UserModelBuilder(ModelValidator modelValidator) {
        this.modelValidator = modelValidator;
    }

    public User build(String username, String email, String salt, String hash) {
        return modelValidator.validate(
                new User(UUID.randomUUID(), username, email, salt, hash, null, null));
    }

    public User build(UUID id, String username, String bio, String image, String salt, String hash, String email) {
        return modelValidator.validate(new User(id, username, email, salt, hash, bio, image));
    }

}
