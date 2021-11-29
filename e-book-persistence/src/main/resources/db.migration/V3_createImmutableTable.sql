CREATE TABLE constant_rating (
  rating SMALLINT NOT NULL UNIQUE
);

INSERT INTO constant_rating (rating)
VALUE (1,2,3,4,5);