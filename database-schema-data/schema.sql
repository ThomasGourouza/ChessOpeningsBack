DROP TABLE IF EXISTS moves;
DROP TABLE IF EXISTS relations;
DROP TABLE IF EXISTS openings;

create table openings (
	id BIGSERIAL NOT NULL PRIMARY KEY,
	name VARCHAR(100),
	UNIQUE(name)
);
create table relations (
	id BIGSERIAL NOT NULL PRIMARY KEY,
	parent_opening_id BIGINT REFERENCES openings (id) NOT NULL,
	child_opening_id BIGINT REFERENCES openings (id) NOT NULL
);
create table moves (
	id BIGSERIAL NOT NULL PRIMARY KEY,
	opening_id BIGINT REFERENCES openings (id) NOT NULL,
	move_number BIGINT NOT NULL,
	color VARCHAR(50),
	piece VARCHAR(50),
	column_from VARCHAR(50),
	line_from VARCHAR(50),
	column_to VARCHAR(50),
	line_to VARCHAR(50)
);
