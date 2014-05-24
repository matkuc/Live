# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table company (
  id                        bigint not null,
  name                      varchar(255),
  constraint pk_company primary key (id))
;

create table computer (
  id                        bigint not null,
  name                      varchar(255),
  introduced                timestamp,
  discontinued              timestamp,
  company_id                bigint,
  constraint pk_computer primary key (id))
;

create table match1 (
  id                        bigint not null,
  result_a                  bigint,
  result_b                  bigint,
  constraint pk_match1 primary key (id))
;

create table player (
  id                        bigint not null,
  team_id                   bigint,
  lastname                  varchar(255),
  firstname                 varchar(255),
  date_birth                timestamp,
  status                    integer,
  photo                     varchar(255),
  height                    integer,
  weight                    integer,
  position                  varchar(255),
  number                    integer,
  constraint pk_player primary key (id))
;

create table referee (
  id                        bigint not null,
  lastname                  varchar(255),
  firstname                 varchar(255),
  city                      varchar(255),
  constraint pk_referee primary key (id))
;

create table team (
  id                        bigint not null,
  name                      varchar(255),
  crest                     varchar(255),
  constraint pk_team primary key (id))
;

create sequence company_seq;

create sequence computer_seq;

create sequence match1_seq;

create sequence player_seq;

create sequence referee_seq;

create sequence team_seq;

alter table computer add constraint fk_computer_company_1 foreign key (company_id) references company (id) on delete restrict on update restrict;
create index ix_computer_company_1 on computer (company_id);
alter table player add constraint fk_player_team_2 foreign key (team_id) references team (id) on delete restrict on update restrict;
create index ix_player_team_2 on player (team_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists company;

drop table if exists computer;

drop table if exists match1;

drop table if exists player;

drop table if exists referee;

drop table if exists team;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists company_seq;

drop sequence if exists computer_seq;

drop sequence if exists match1_seq;

drop sequence if exists player_seq;

drop sequence if exists referee_seq;

drop sequence if exists team_seq;

