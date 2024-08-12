package dev.serrodcal.application.web.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.List;

public record ArticleResponse(
    String slug,
    String title,
    String description,
    String body,
    List<String> tags,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'") LocalDateTime createdAt,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'") LocalDateTime updatedAt,
    boolean favorited,
    long favoritedCount,
    ProfileResponse author
) { }
