package com.codingrecipe.board.dto;

import lombok.*;

import java.io.File;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor  //기본생성자
@AllArgsConstructor //모든필드를 매개변수로 하는 생성자
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits;
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;
}
