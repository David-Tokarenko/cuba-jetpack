alter table DUMMY_COMPETITION add constraint FK_DUMMY_COMPETITION_ON_SPORT foreign key (SPORT_ID) references DUMMY_SPORT(ID);
create index IDX_DUMMY_COMPETITION_ON_SPORT on DUMMY_COMPETITION (SPORT_ID);
