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
