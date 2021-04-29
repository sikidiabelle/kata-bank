/*==============================================================*/
				/*INSERT INTO USERS*/
/*==============================================================*/
INSERT INTO users(address, email, name) values ('54  rue Nationale, PARIS', 'masling@outlook.org', 'Maslin G');
INSERT INTO users(address, email, name) values ('64  rue Pierre De Coubertin, TOULOUSE', 'alexandre-gilles@yahoo.fr', 'Gilles A');

/*==============================================================*/
				/*INSERT INTO ACCOUNT*/
/*==============================================================*/
INSERT INTO account(balance, id_user) values (4826.9, 1);
INSERT INTO account(balance, id_user) values (803.42, 2);

/*==============================================================*/
				/*INSERT INTO TRANSACTION*/
/*==============================================================*/
INSERT INTO transaction(date, montant, id_account) VALUES ('20210429 02:34:09 PM', -49.99, 1);
