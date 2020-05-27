alter table DUMMY_SPORTSMAN add constraint FK_DUMMY_SPORTSMAN_ON_TEAM foreign key (TEAM_ID) references DUMMY_TEAM(ID);
alter table DUMMY_SPORTSMAN add constraint FK_DUMMY_SPORTSMAN_ON_ID foreign key (ID) references DUMMY_COMPETITOR(ID) on delete CASCADE;
create index IDX_DUMMY_SPORTSMAN_ON_TEAM on DUMMY_SPORTSMAN (TEAM_ID);
