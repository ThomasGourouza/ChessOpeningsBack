INSERT INTO openings (id, "name") VALUES(1, 'Italian Game');
INSERT INTO openings (id, "name") VALUES(2, 'Gioco Piano');

INSERT INTO relations (id, parent_opening_id, child_opening_id) VALUES(1, 1, 2);

INSERT INTO moves (id, opening_id, move_number, white_piece, white_column_from, white_line_from, white_column_to, white_line_to, black_piece, black_column_from, black_line_from, black_column_to, black_line_to) VALUES(1, 1, 1, 'P', 'e', '2', 'e', '4', 'P', 'e', '7', 'e', '5');
