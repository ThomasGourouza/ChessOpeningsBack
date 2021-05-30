DROP TABLE IF EXISTS openings;
DROP TABLE IF EXISTS relations;
DROP TABLE IF EXISTS moves;

create table openings (
	id BIGSERIAL NOT NULL PRIMARY KEY,
	name VARCHAR(100)
);
create table relations (
	parent_opening_id BIGINT REFERENCES openings (id) NOT NULL,
	child_opening_id BIGINT REFERENCES openings (id) NOT NULL,
);
create table moves (
	opening_id BIGINT REFERENCES openings (id) NOT NULL,
	move_number BIGINT NOT NULL,
	white_piece VARCHAR(50),
	white_column_from VARCHAR(50),
	white_line_from VARCHAR(50),
	white_column_to VARCHAR(50),
	white_line_to VARCHAR(50),
	black_piece VARCHAR(50),
	black_column_from VARCHAR(50),
	black_line_from VARCHAR(50),
	black_column_to VARCHAR(50),
	black_line_to VARCHAR(50)
);
