package dev.serrodcal.application.web.model.request;

import dev.serrodcal.domain.model.constants.ValidationMessages;
import jakarta.validation.constraints.NotBlank;

public record LoginRequest(
    @NotBlank(message = ValidationMessages.EMAIL_MUST_BE_NOT_BLANK) String email,
    @NotBlank(message = ValidationMessages.PASSWORD_MUST_BE_NOT_BLANK) String password
) { }
