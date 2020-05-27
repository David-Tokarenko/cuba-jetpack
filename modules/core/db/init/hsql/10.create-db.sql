-- begin DUMMY_SPORT
create table DUMMY_SPORT (
    ID varchar(36) not null,
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
-- end DUMMY_SPORT
-- begin DUMMY_JUDGE
create table DUMMY_JUDGE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    COUNTRY_ID varchar(36),
    --
    primary key (ID)
)^
-- end DUMMY_JUDGE
-- begin DUMMY_COUNTRY
create table DUMMY_COUNTRY (
    ID varchar(36) not null,
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
    ID varchar(36) not null,
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
    COUNTRY_ID varchar(36),
    --
    primary key (ID)
)^
-- end DUMMY_COMPETITOR
-- begin DUMMY_COMPETITION
create table DUMMY_COMPETITION (
    ID varchar(36) not null,
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
    SPORT_ID varchar(36),
    --
    primary key (ID)
)^
-- end DUMMY_COMPETITION
-- begin DUMMY_TEAM
create table DUMMY_TEAM (
    ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end DUMMY_TEAM
-- begin DUMMY_SPORTSMAN
create table DUMMY_SPORTSMAN (
    ID varchar(36) not null,
    --
    BIRTH_DATE date,
    TEAM_ID varchar(36),
    --
    primary key (ID)
)^
-- end DUMMY_SPORTSMAN
