package dev.serrodcal.application.web.model.response;

import java.util.List;

public record TagsResponse(
    List<String> tags
) { }
