--6 a)
select NumAgente, 
	extract('year' from fecha) as Año, 
	extract('quarter' from fecha) as Trimestre,
	count(numMulta) "NumMultas"
from Multa
group by NumAgente, extract('year' from fecha), extract('quarter' from fecha)
order by 1,2,3;

--6 b)
select numMulta,nombre,paterno,materno,nacimiento,fecha as fechaMulta
from multa natural join propietario
where extract('day' from nacimiento) = extract('day' from fecha) and
	extract('month' from nacimiento) = extract('month' from fecha);
	
--6 c)
select b.RFC, b.numplaca, c.numLicencia, a.nombre, 
		a.paterno, a.materno, c.Vigencia
from propietario a join poseer b on a.rfc = b.rfc join
	tarjetaCirculacion c on b.numPlaca = c.numPlaca
where Vigencia <= 2022
order by 4,5,6;

 /*6 c) (opcion 2) ---> para visualizar solamente los nombres de los propietarios 
 con tc vencida sin repeticion (pues un propietario puede tener 2 o mas vehiculos 
 y por tanto, 2 o mas tc vencidas al 07/12/2022*/
select distinct b.RFC, a.nombre, 
		a.paterno, a.materno
from propietario a join poseer b on a.rfc = b.rfc join
	tarjetaCirculacion c on b.numPlaca = c.numPlaca
where Vigencia <= 2022
order by 2,3,4;  

--6 d)
select fecha as fechamulta, numagente, a.numplaca, modelo, marca, capTanque, 
	pasajeros, numMotor, litrosMotor, Cilindros, transmision, calcomaniaVerificacion,
	FechaVerificacion, anio
from multa a join vehiculo b on a.numPlaca = b.numPlaca
where extract('quarter' from fecha) = 4 and extract('year' from fecha) = 2020
order by fecha,numagente;

--6 e)
select estado, municipio, genero, paterno, materno, nombre, count(RFC) as numautos
from propietario natural join poseer
group by estado, municipio, genero, nombre, paterno, materno
order by 1,2,3;

--6 f)
select nummulta, a.RFC, genero, paterno, materno, nombre, numero, a.cp,
		a.estado, a.municipio
from propietario a left join multa b on a.RFC = b.RFC
where b.nummulta is null and genero = 'H'
order by a.RFC;

--6 g)
select Vigencia as Vigencia_licencia,
	numPlaca, modelo, marca, captanque, pasajeros, nummotor, 
	litrosmotor,cilindros, transmision, calcomaniaverificacion,
	fechaverificacion,anio
from vehiculo natural join poseer natural join propietario natural join licencia
where vigencia <= 2022;

--6 h)
select nummulta, a.RFC, genero, paterno, materno, nombre, numero, a.cp,
		a.estado, a.municipio
from propietario a left join multa b on a.RFC = b.RFC
where b.nummulta is not null and paterno = 'Molina' and estado = 'Chiapas'
order by a.RFC;

--6 j)
select a.marca, nummulta, rfc, b.numplaca, numagente, fecha, calle, entre1,
		entre2, cp, municipio, referencia
from vehiculo a right join multa b on a.numplaca = b.numplaca 
where b.nummulta is not null and extract(year from b.fecha) = 2022 and marca = 'VW';

--6 k)
select d.*, c.calcomaniaverificacion
from (vehiculo a full join poseer b on a.numplaca = b.numplaca) c
		full join propietario d on c.rfc  =  d.rfc
where d.genero = 'M' and c.calcomaniaverificacion = 0;

--6 n)
select a.*, b.fechacompra 
from vehiculo a right join poseer b on a.numplaca = b.numplaca
where a.transmision = 'automatico' and extract(year from b.fechacompra) > 2021;

--6 p)
select c.marca,c.nummulta,d.*
from (vehiculo a full join multa b on a.numplaca = b.numplaca) c
		full join propietario d on c.rfc = d.rfc
where c.marca = 'Ford' and c.nummulta is not null 
		and extract(year from d.nacimiento) <= 1987 
		and extract(year from d.nacimiento) >= 1967;

--6 q)
SELECT Propietario.*, Vehiculo.* FROM (Propietario JOIN Multa ON Multa.RFC=Propietario.RFC)
JOIN Vehiculo ON Multa.numPlaca=Vehiculo.numPlaca
WHERE (Multa.numMulta is not null AND Multa.numPlaca LIKE '%ALV%');


--6 w)
select marca ,articulo.nummulta, count(articulo) "Articulo"
from (articulo join multa on articulo.nummulta = multa.nummulta)
		join vehiculo on multa.numplaca = vehiculo.numplaca
where marca = 'Kia'
group by articulo.nummulta,marca
order by 1;


--INSERT INTO Vehiculo(numPlaca,Modelo,Marca,CapTanque,Pasajeros,numMotor,LitrosMotor,Cilindros,Transmision,CalcomaniaVerificacion,FechaVerificacion,Anio) VALUES ('ALV349','Boxster','Porsche',66,4,44199514,13,5,'automatico',7,'2022-07-26',2018);
--INSERT INTO Vehiculo(numPlaca,Modelo,Marca,CapTanque,Pasajeros,numMotor,LitrosMotor,Cilindros,Transmision,CalcomaniaVerificacion,FechaVerificacion,Anio) VALUES ('ALV690','LX','Lexus',33,8,41413496,4,5,'estandar',4,'2022-11-01',2015);
--INSERT INTO Vehiculo(numPlaca,Modelo,Marca,CapTanque,Pasajeros,numMotor,LitrosMotor,Cilindros,Transmision,CalcomaniaVerificacion,FechaVerificacion,Anio) VALUES ('ALV301','3 Series','BMW',43,9,26078276,8,9,'automatico',3,'2022-09-03',2012);
--INSERT INTO Vehiculo(numPlaca,Modelo,Marca,CapTanque,Pasajeros,numMotor,LitrosMotor,Cilindros,Transmision,CalcomaniaVerificacion,FechaVerificacion,Anio) VALUES ('ALV381','Diablo','Lamborghini',58,5,90728579,6,3,'estandar',3,'2022-01-18',2019);
--INSERT INTO Vehiculo(numPlaca,Modelo,Marca,CapTanque,Pasajeros,numMotor,LitrosMotor,Cilindros,Transmision,CalcomaniaVerificacion,FechaVerificacion,Anio) VALUES ('ALV985','Savana 3500','GMC',63,7,91769626,9,6,'automatico',9,'2022-07-06',2013);

--INSERT INTO Multa(numMulta,RFC,numPlaca,NumAgente,Fecha,Calle,Entre1,Entre2,CP,Municipio,Referencia) VALUES (6565698,'BOFL861227YRF','ALV349',141,'2021-10-08','Mariners','Mayer','Nobel',81799,'Nochistlan de Mejia','Future-proofed optimal methodology');
--INSERT INTO Multa(numMulta,RFC,numPlaca,NumAgente,Fecha,Calle,Entre1,Entre2,CP,Municipio,Referencia) VALUES (1545955,'RIVP770306GOI','ALV690',114,'2020-07-28','Jazmin Cove','Quincy','Barby',21499,'Temoac','Multi-lateral bi-directional monitoring');
--INSERT INTO Multa(numMulta,RFC,numPlaca,NumAgente,Fecha,Calle,Entre1,Entre2,CP,Municipio,Referencia) VALUES (4142568,'FUMJ950122MUB','ALV301',119,'2019-04-26','Mendonta','Melvin','Claremont',91805,'El Fuerte','Team-oriented systematic customer loyalty');
--INSERT INTO Multa(numMulta,RFC,numPlaca,NumAgente,Fecha,Calle,Entre1,Entre2,CP,Municipio,Referencia) VALUES (0827262,'PHHA950116VCM','ALV381',140,'2020-12-11','Homewood','Rieder','1st',81374,'Tamuin','Monitored didactic architecture');
--INSERT INTO Multa(numMulta,RFC,numPlaca,NumAgente,Fecha,Calle,Entre1,Entre2,CP,Municipio,Referencia) VALUES (0076757,'REGC691020VOG','ALV985',217,'2019-07-28','Andres','1st','Arkansas',15477,'Apaseo el Alto','Optimized analyzing interface');