alter table DUMMY_TEAM add constraint FK_DUMMY_TEAM_ON_ID foreign key (ID) references DUMMY_COMPETITOR(ID) on delete CASCADE;
