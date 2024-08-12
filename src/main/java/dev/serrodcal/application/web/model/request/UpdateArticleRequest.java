package dev.serrodcal.application.web.model.request;

public record UpdateArticleRequest(
    String title,
    String description,
    String body
) { }
