create table event (
  id               bigserial primary key,
  name             varchar(255)  not null,
  contact          varchar(255),
  date             timestamp     not null,
  details          varchar(1024) not null,
  location         varchar(255)  not null,
  max_participants integer       not null
);

create table participant (
  id                 bigserial primary key,
  name               varchar(255),
  email              varchar(255) not null,
  verification_token varchar(255) not null,
  event_id           bigserial    not null references event (id)
);

create table mailing_list (
  id            bigserial primary key,
  affiliation   varchar(255),
  email         varchar(255) not null,
  first_name    varchar(255) not null,
  last_name     varchar(255) not null,
  created       timestamp    not null default now(),
  receives_mail boolean      not null
);
