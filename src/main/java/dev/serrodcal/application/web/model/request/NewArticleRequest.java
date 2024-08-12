package dev.serrodcal.application.web.model.request;

import java.util.List;

public record NewArticleRequest(
    String title,
    String description,
    String body,
    List<String> tags
) { }
