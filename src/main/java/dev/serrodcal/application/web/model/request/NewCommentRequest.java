package dev.serrodcal.application.web.model.request;

import dev.serrodcal.domain.model.constants.ValidationMessages;
import jakarta.validation.constraints.NotBlank;

public record NewCommentRequest(
    @NotBlank(message = ValidationMessages.BODY_MUST_BE_NOT_BLANK) String body
) { }
