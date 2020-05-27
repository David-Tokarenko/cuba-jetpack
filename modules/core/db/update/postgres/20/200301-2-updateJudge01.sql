alter table DUMMY_JUDGE add constraint FK_DUMMY_JUDGE_ON_SPORT foreign key (SPORT_ID) references DUMMY_SPORT(ID);
create index IDX_DUMMY_JUDGE_ON_SPORT on DUMMY_JUDGE (SPORT_ID);
