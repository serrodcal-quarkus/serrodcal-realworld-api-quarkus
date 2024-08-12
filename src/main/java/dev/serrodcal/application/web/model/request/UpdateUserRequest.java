package dev.serrodcal.application.web.model.request;

import dev.serrodcal.domain.model.constants.ValidationMessages;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

public record UpdateUserRequest(
        @Pattern(regexp = "\\A(?!\\s*\\Z).+", message = ValidationMessages.USERNAME_MUST_BE_NOT_BLANK) String username,
        String bio,
        String image,
        @Email String email
) { }
