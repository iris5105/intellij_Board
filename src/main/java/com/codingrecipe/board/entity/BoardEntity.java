package com.codingrecipe.board.entity;


import com.codingrecipe.board.dto.BoardDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

//DB의 테이블 역할을 하는 클래스
@Entity
@Getter
@Setter
@Table(name="board_table")
public class BoardEntity extends  BaseEntity{
    @Id //pk컬럼 지정. 필수
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
    private Long id;

    @Column(length = 20, nullable = false)//크기 제한은 20이고 NotNull지정  //특별한 지정이 없다면 크기는 255 null가능
    private String boardWriter;


    @Column
    private String boardPass;

    @Column
    private String boardTitle;

    @Column(length = 500)
    private String boardContents;

    @Column
    private int boardHtis;

    public static BoardEntity toSaveEntity(BoardDTO boardDTO){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setBoardWriter(boardDTO.getBoardWriter());
        boardEntity.setBoardPass(boardDTO.getBoardPass());
        boardEntity.setBoardTitle(boardDTO.getBoardTitle());
        boardEntity.setBoardContents(boardDTO.getBoardContents());
        boardEntity.setBoardHtis(0);
        return boardEntity;
    }

}
