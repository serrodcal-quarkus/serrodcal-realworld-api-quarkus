package dev.serrodcal.domain.model.tag;

import dev.serrodcal.domain.model.validator.ModelValidator;

import java.util.UUID;

public class TagBuilder {

    private final ModelValidator modelValidator;

    public TagBuilder(ModelValidator modelValidator) {
        this.modelValidator = modelValidator;
    }

    public Tag build(String name) {
        return modelValidator.validate(new Tag(UUID.randomUUID(), name));
    }

    public Tag build(UUID id, String name) {
        return modelValidator.validate(new Tag(id, name));
    }

}
