package dev.serrodcal.domain.model.tag;

import java.util.UUID;

public record Tag(
    UUID uuid,
    String name
) { }
