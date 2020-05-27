-- begin DUMMY_SPORT
create table DUMMY_SPORT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    ADDITIONAL_INFO text,
    --
    primary key (ID)
)^
-- end DUMMY_SPORT
-- begin DUMMY_JUDGE
create table DUMMY_JUDGE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    SPORT_ID uuid,
    COUNTRY_ID uuid,
    --
    primary key (ID)
)^
-- end DUMMY_JUDGE
-- begin DUMMY_COUNTRY
create table DUMMY_COUNTRY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end DUMMY_COUNTRY
-- begin DUMMY_COMPETITOR
create table DUMMY_COMPETITOR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE integer,
    --
    NAME varchar(255) not null,
    COUNTRY_ID uuid,
    --
    primary key (ID)
)^
-- end DUMMY_COMPETITOR
-- begin DUMMY_COMPETITION
create table DUMMY_COMPETITION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    DATE_ date,
    SPORT_ID uuid,
    COMPETITORS_TYPE integer,
    --
    primary key (ID)
)^
-- end DUMMY_COMPETITION
-- begin DUMMY_TEAM
create table DUMMY_TEAM (
    ID uuid,
    --
    primary key (ID)
)^
-- end DUMMY_TEAM
-- begin DUMMY_SPORTSMAN
create table DUMMY_SPORTSMAN (
    ID uuid,
    --
    BIRTH_DATE date,
    GENDER integer,
    TEAM_ID uuid,
    --
    primary key (ID)
)^
-- end DUMMY_SPORTSMAN
-- begin DUMMY_PARTICIPANT
create table DUMMY_PARTICIPANT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COMPETITION_ID uuid,
    COMPETITIOR_ID uuid,
    RESULT_ text,
    --
    primary key (ID)
)^
-- end DUMMY_PARTICIPANT
