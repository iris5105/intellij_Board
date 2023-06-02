package com.codingrecipe.board.Controller;

import com.codingrecipe.board.dto.BoardDTO;
import com.codingrecipe.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/save")
    public String saveForm(){
        return "save";
    }

    @PostMapping("/save")
    public String saveForm(@ModelAttribute BoardDTO boardDTO) {
        System.out.println("boardDTO = " + boardDTO);
        boardService.save(boardDTO);
        return "index";
    }
}
