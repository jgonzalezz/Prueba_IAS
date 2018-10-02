insert into tont_aves (cdave,dsnombre_comun,dsnombre_cientifico) values ('001','Aguila Real','Aguilinus Realitys');
insert into tont_aves (cdave,dsnombre_comun,dsnombre_cientifico) values ('002','Aguilucho Palido','Aguiluchus Palidus');
insert into tont_aves (cdave,dsnombre_comun,dsnombre_cientifico) values ('003','Gavilan Gris','Gavilanus Grisacius');
insert into tont_aves (cdave,dsnombre_comun,dsnombre_cientifico) values ('004','Gavilan Pollero','Gavilanus Pollerus');


insert into tont_zonas (cdzona, dsnombre) values ('001','Zona Norte');
insert into tont_zonas (cdzona, dsnombre) values ('002','Zona Sur');
insert into tont_zonas (cdzona, dsnombre) values ('003','Zona Occidente');
insert into tont_zonas (cdzona, dsnombre) values ('004','Zona Oriente');

insert into tont_paises (cdpais,dsnombre,cdzona) values ('COL','Colombia','001');
insert into tont_paises (cdpais,dsnombre,cdzona) values ('VEN','Venezuela','004');
insert into tont_paises (cdpais,dsnombre,cdzona) values ('JPN','Japon','001');
insert into tont_paises (cdpais,dsnombre,cdzona) values ('USA','Estados Unidos','003');
insert into tont_paises (cdpais,dsnombre,cdzona) values ('ESP','ESPAÑA','004');

insert into tont_aves_pais (cdpais, cdave) values ('JPN','001');
insert into tont_aves_pais (cdpais, cdave) values ('COL','002');
insert into tont_aves_pais (cdpais, cdave) values ('USA','003');
insert into tont_aves_pais (cdpais, cdave) values ('ESP','004');