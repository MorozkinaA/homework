-- Table: public.purchase

-- DROP TABLE public.purchase;

CREATE TABLE public.purchase
(
  purchase_id integer NOT NULL,
  date date NOT NULL,
  seller integer NOT NULL,
  customer integer NOT NULL,
  book integer NOT NULL,
  qty integer NOT NULL,
  price double precision,
  CONSTRAINT purchase_pkey PRIMARY KEY (purchase_id),
  CONSTRAINT purchase_book_fkey FOREIGN KEY (book)
      REFERENCES public.book (book_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT purchase_customer_fkey FOREIGN KEY (customer)
      REFERENCES public.customer (customer_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT purchase_seller_fkey FOREIGN KEY (seller)
      REFERENCES public.shop (shop_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.purchase
  OWNER TO postgres;
