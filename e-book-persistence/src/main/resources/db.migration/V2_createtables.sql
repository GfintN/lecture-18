CREATE TABLE review (
  id BIGINT PRIMARY KEY,
  massage VARCHAR(30),
  rating VARCHAR NOT NULL,
  book_id BEGIN NOT NULL,
  FOREIGN KEY (book_id) REFERENCES book(id),
);

CREATE TABLE book (
  id BIGINT PRIMARY KEY,
  name VARCHAR(30) NOT NULL,
);

CREATE TABLE book_and_review(
   book_name VARCHAR(30) NOT NULL,
   massage VARCHAR(30) NOT NULL,
   rating VARCHAR NOT NULL,
   FOREIGN KEY (book_name) REFERENCES book(name),
   FOREIGN KEY (massage) REFERENCES review(massage),
   FOREIGN KEY (rating) REFERENCES review(rating)
);

CREATE TABLE random_generate (
   random_id_sequence BEGIN NOT NULL UNIQUE,
   random_id_custom VARCHAR NOT NULL UNIQUE,
   random_name_uuid VARCHAR NOT NULL UNIQUE,
   );