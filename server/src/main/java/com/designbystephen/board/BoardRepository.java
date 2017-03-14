package com.designbystephen.board;

import com.designbystephen.board.Board;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by birdie on 3/14/2017.
 */
public interface BoardRepository extends CrudRepository<Board, Long> {
}
