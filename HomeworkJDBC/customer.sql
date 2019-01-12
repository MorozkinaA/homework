-- Table: public.customer

-- DROP TABLE public.customer;

CREATE TABLE public.customer
(
  customer_id integer NOT NULL,
  surname character varying NOT NULL,
  district character varying NOT NULL,
  discount integer,
  CONSTRAINT customer_pkey PRIMARY KEY (customer_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.customer
  OWNER TO postgres;
