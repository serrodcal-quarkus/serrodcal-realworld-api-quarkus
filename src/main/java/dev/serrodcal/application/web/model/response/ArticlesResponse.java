package dev.serrodcal.application.web.model.response;

import java.util.List;

public record ArticlesResponse(
    List<ArticleResponse> articles,
    long articlesCount
) { }
