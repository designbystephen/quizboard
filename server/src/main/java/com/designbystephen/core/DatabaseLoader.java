package com.designbystephen.core;

import com.designbystephen.board.Board;
import com.designbystephen.board.BoardRepository;
import com.designbystephen.category.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by birdie on 3/14/2017.
 */
@Component
public class DatabaseLoader implements ApplicationRunner {
    private final BoardRepository boards;

    @Autowired
    public DatabaseLoader(BoardRepository boards) {
        this.boards = boards;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Board board = new Board(1);
        boards.save(board);

        String[] titles = {
                "Words",
                "Buzz Words",
                "Buzzy Words",
                "Buzzier Words",
                "Buzziest Words"
        };

        IntStream.range(0, 4)
            .forEach(i -> {
                String title = titles[i];
                board.addCategory(new Category(title)));
        });

    }
}
