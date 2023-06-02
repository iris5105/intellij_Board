package com.codingrecipe.board.service;

import com.codingrecipe.board.dto.BoardDTO;
import com.codingrecipe.board.entity.BoardEntity;
import com.codingrecipe.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//서비스에서 주로하는 데이터 가공.
//Repository로 넘겨주고 받을 때는 Entity
//DTO -> Entity (Entity Class)
//Controller로 주고 받을 때는 DTO
//Entity -> DTO (DTO Class)


@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}
