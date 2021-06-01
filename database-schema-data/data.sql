INSERT INTO openings (id, "name") VALUES(1, 'Italian Game');
INSERT INTO openings (id, "name") VALUES(2, 'Gioco Piano');

INSERT INTO relations (id, parent_opening_id, child_opening_id) VALUES(1, 1, 2);

INSERT INTO moves (id, opening_id, move_number, color, piece, column_from, line_from, column_to, line_to) VALUES(1, 1, 1, 'W', 'P', 'e', '2', 'e', '4');
INSERT INTO moves (id, opening_id, move_number, color, piece, column_from, line_from, column_to, line_to) VALUES(2, 1, 1, 'B', 'P', 'e', '7', 'e', '5');
INSERT INTO moves (id, opening_id, move_number, color, piece, column_from, line_from, column_to, line_to) VALUES(3, 1, 2, 'W', 'N', 'g', '1', 'f', '3');
INSERT INTO moves (id, opening_id, move_number, color, piece, column_from, line_from, column_to, line_to) VALUES(4, 1, 2, 'B', 'N', 'b', '8', 'c', '6');
INSERT INTO moves (id, opening_id, move_number, color, piece, column_from, line_from, column_to, line_to) VALUES(5, 1, 3, 'W', 'B', 'f', '1', 'c', '4');
