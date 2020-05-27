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
);