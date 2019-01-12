-- Table: public.shop

-- DROP TABLE public.shop;

CREATE TABLE public.shop
(
  shop_id integer NOT NULL,
  name character varying NOT NULL,
  district character varying NOT NULL,
  comission character varying(1),
  CONSTRAINT shop_pkey PRIMARY KEY (shop_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.shop
  OWNER TO postgres;
