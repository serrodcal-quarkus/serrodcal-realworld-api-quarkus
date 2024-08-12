package dev.serrodcal.application.web.model.response;

import java.util.List;

public record CommentsResponse(
    List<CommentResponse> comments
) { }
