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

