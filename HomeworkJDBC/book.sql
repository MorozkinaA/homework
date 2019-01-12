-- Table: public.book

-- DROP TABLE public.book;

CREATE TABLE public.book
(
  title character varying NOT NULL,
  price double precision NOT NULL,
  storehouse character varying,
  qty integer,
  book_id integer NOT NULL,
  CONSTRAINT book_pkey PRIMARY KEY (book_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.book
  OWNER TO postgres;
