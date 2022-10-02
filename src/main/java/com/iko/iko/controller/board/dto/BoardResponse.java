package com.iko.iko.controller.board.dto;
import lombok.*;

import java.util.Date;
import java.util.List;

public class BoardResponse {
    @Getter
    @AllArgsConstructor
    @Builder
    public static class BoardMain{
        private Integer boardId;
        private String boardTitle;
        private Integer boardType;
    }

    @Getter
    @AllArgsConstructor
    @Builder
    public static class BoardDetails{
        private String boardTitle;
        private String createdBy;
        private Date updatedAt;
        private String description;

    }

}