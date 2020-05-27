-- start init DUMMY_COUNTRY

insert into DUMMY_COUNTRY
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME)
values ('f147345f-d9f3-ac37-4e02-bbe35486ac6f', 1, '2020-02-29 12:13:47', 'admin', '2020-02-29 12:13:47', null, null, null, 'Australia');

insert into DUMMY_COUNTRY
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME)
values ('2e9f3c7f-d727-eeed-3772-f15600631df8', 1, '2020-02-29 12:12:40', 'admin', '2020-02-29 12:12:40', null, null, null, 'Russian Federation');

insert into DUMMY_COUNTRY
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME)
values ('0cc59899-a47c-0a6a-441d-a84a40fce502', 1, '2020-02-29 12:18:15', 'admin', '2020-02-29 12:18:15', null, null, null, 'United Kingdom of Great Britain');

insert into DUMMY_COUNTRY
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME)
values ('5b1e09aa-f28d-98e6-7d05-87e53650581b', 1, '2020-02-29 12:19:15', 'admin', '2020-02-29 12:19:15', null, null, null, 'Spain');

insert into DUMMY_COUNTRY
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME)
values ('093cc29e-eb38-035f-2910-6cc99c4b1dd0', 1, '2020-02-29 12:13:41', 'admin', '2020-02-29 12:13:41', null, null, null, 'Japan');

-- end init DUMMY_COUNTRY

-- start init DUMMY_SPORT

insert into DUMMY_SPORT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME)
values ('518c6410-fee9-8175-8e5e-50d7bfd0b95a', 3, '2020-03-01 10:18:42', 'admin', '2020-03-01 10:19:26', 'admin', null, null, 'Soccer');

insert into DUMMY_SPORT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME)
values ('29efdd7f-22e0-d435-05d9-710794d34a3f', 1, '2020-03-01 10:21:14', 'admin', '2020-03-01 10:21:14', null, null, null, 'Chess');

insert into DUMMY_SPORT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, ADDITIONAL_INFO)
values ('867d27ad-539b-f2fe-1432-c91580ff73e3', 2, '2020-03-01 11:13:14', 'admin', '2020-03-01 11:13:22', 'admin', null, null, 'Running100Men', '<sport>
    <kind>running</kind>
    <distance>100</distance>
    <gender>MAN</gender>
</sport>');

insert into DUMMY_SPORT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, ADDITIONAL_INFO)
values ('d022c648-dd35-f78d-6d1c-2ced0837bf6d', 1, '2020-03-01 11:14:22', 'admin', '2020-03-01 11:14:22', null, null, null, 'Running100Women', '<sport>
    <kind>running</kind>
    <distance>100</distance>
    <gender>WOMAN</gender>
</sport>');

-- end init DUMMY_SPORT

-- start init  SEC_GROUP

insert into SEC_GROUP
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, NAME)
values ('e590618a-ddbc-9246-f101-9f253775b70a', 1, current_timestamp, 'admin', current_timestamp, 'admin', 'Competitor');

-- end init SEC_GROUP

-- start init SEC_CONSTRAINT

insert into SEC_CONSTRAINT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, CHECK_TYPE, OPERATION_TYPE, ENTITY_NAME, WHERE_CLAUSE, IS_ACTIVE, GROUP_ID)
values ('6378ac21-b2d3-19eb-12a1-e5aa3fcc3aff', 1, current_timestamp, 'admin', current_timestamp, 'db', 'all', 'dummy$Competitor', '{E}.createdBy = :session$userLogin', true, 'e590618a-ddbc-9246-f101-9f253775b70a');

-- end init SEC_CONSTRAINT

-- start init SEC_USER

insert into SEC_USER
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS,  LOGIN, LOGIN_LC, PASSWORD, PASSWORD_ENCRYPTION, LANGUAGE_, ACTIVE, CHANGE_PASSWORD_AT_LOGON, GROUP_ID)
values ('6a2e2d84-0dac-05a5-9f96-19c6709050ff', 1, current_timestamp, 'admin', current_timestamp, 'superUser', 'superuser', '$2a$10$IKtCY88rYLVofS8W14a6TeSapOzx1ZEN4FDVW6IsuZrd2dO7heaIa', 'bcrypt', 'ru',  true, false, '0fa2b1a5-1d68-4d69-9fbd-dff348347f93');

insert into SEC_USER
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, LOGIN, LOGIN_LC, PASSWORD, PASSWORD_ENCRYPTION, LANGUAGE_, ACTIVE, CHANGE_PASSWORD_AT_LOGON, GROUP_ID)
values ('3867d9c2-fe25-d5b5-9e0b-cab5fb7a8df5', 1, current_timestamp, 'admin', current_timestamp, 'limitedUser', 'limiteduser', '$2a$10$ogsr13lKB17PnWxRsPjMfuyLjTXlTd8fhx2Lces4jYFpGG6gtf9BS', 'bcrypt', 'ru', true, false, 'e590618a-ddbc-9246-f101-9f253775b70a');

-- end init SEC_USER
