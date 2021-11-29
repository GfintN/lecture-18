CREATE TABLE test_constant_rating (
  rating SMALLINT NOT NULL
  FOREIGN KEY rating REFERENCES constant_rating(rating)
);