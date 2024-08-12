package dev.serrodcal.domain.model.article;

import java.util.List;

public record PageResult<T>(
    List<T> result,
    long total
) { }
