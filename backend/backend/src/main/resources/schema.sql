
CREATE TABLE backend.instructordetail
(
  id integer NOT NULL DEFAULT nextval('backend.instructor_detail_id_seq'::regclass),
  youtube_channel text,
  hobby text,
  CONSTRAINT id PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE backend.instructordetail
  OWNER TO postgres;



CREATE TABLE backend.instructor
(
  id serial NOT NULL,
  first_name text,
  last_name text,
  email text,
  instructor_detail_id integer,
  CONSTRAINT instructor_pkey PRIMARY KEY (id),
  CONSTRAINT fk9hbcfrgu352g0yrha7nw95ujk FOREIGN KEY (instructor_detail_id)
      REFERENCES backend.instructordetail (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT instructor_id_fkey FOREIGN KEY (instructor_detail_id)
      REFERENCES backend.instructordetail (id) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT instructor_instructor_detail_id_key UNIQUE (instructor_detail_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE backend.instructor
  OWNER TO postgres;

CREATE TABLE backend.courses
(
  id serial NOT NULL,
  title text,
  instructor_id integer,
  CONSTRAINT courses_pkey PRIMARY KEY (id),
  CONSTRAINT courses_instructor_id_fkey FOREIGN KEY (instructor_id)
      REFERENCES backend.instructor (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk79arv901b5gkyp2240wcm3l76 FOREIGN KEY (instructor_id)
      REFERENCES backend.instructor (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT courses_title_key UNIQUE (title)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE backend.courses
  OWNER TO postgres;
