/*Crear Propietario*/
CREATE TABLE Propietario(
   RFC        VARCHAR(13) NOT NULL 
  ,Nombre     VARCHAR(50) NOT NULL 
  ,Paterno    VARCHAR(50) NOT NULL
  ,Materno    VARCHAR(50) NOT NULL
  ,Calle      VARCHAR(16) 
  ,Numero     INTEGER  
  ,CP         CHAR(5) 
  ,Estado     VARCHAR(50) 
  ,Municipio  VARCHAR(50) 
  ,Nacimiento DATE  NOT NULL
  ,Genero     CHAR(1) NOT NULL
  ,CONSTRAINT Propietario_pkey PRIMARY KEY (RFC)
);

/*Crear Vehiculo*/
CREATE TABLE Vehiculo(
   numPlaca               VARCHAR(6) NOT NULL
  ,Modelo                 VARCHAR(50) NOT NULL
  ,Marca                  VARCHAR(50) NOT NULL
  ,CapTanque              INTEGER  NOT NULL
  ,Pasajeros              INTEGER  NOT NULL
  ,numMotor               INTEGER  NOT NULL
  ,LitrosMotor            INTEGER  NOT NULL
  ,Cilindros              INTEGER  NOT NULL
  ,Transmision            VARCHAR(20) NOT NULL
  ,CalcomaniaVerificacion INTEGER 
  ,FechaVerificacion      DATE 
  ,Anio                   INTEGER  NOT NULL
  ,CONSTRAINT Vehiculo_pkey PRIMARY KEY (numPlaca)
);

/*Crear Poseer*/
CREATE TABLE Poseer(
   numPlaca     VARCHAR(6) NOT NULL 
  ,RFC          VARCHAR(13) NOT NULL
  ,FechaCompra  DATE  NOT NULL
  ,PrecioCompra INTEGER  NOT NULL
  ,CONSTRAINT Poseer_fkey1 FOREIGN KEY (numPlaca) REFERENCES Vehiculo(numPlaca)
  ,CONSTRAINT Poseer_fkey2 FOREIGN KEY (RFC) REFERENCES Propietario(RFC)
);

/*Crear Licencia*/
CREATE TABLE Licencia(
   numLicencia CHAR(12)  NOT NULL 
  ,RFC         VARCHAR(13) NOT NULL
  ,Tipo        CHAR(1)
  ,Fecha       DATE  NOT NULL
  ,Vigencia    INTEGER  NOT NULL
  ,CONSTRAINT Licencia_pkey PRIMARY KEY (numLicencia)
  ,CONSTRAINT Licencia_fkey FOREIGN KEY (RFC) REFERENCES Propietario(RFC)
);

/*Crear TarjetaCirculacion*/
CREATE TABLE TarjetaCirculacion(
   numLicencia CHAR(12)  NOT NULL
  ,numPlaca    CHAR(6) NOT NULL
  ,Fecha       DATE  NOT NULL
  ,Vigencia    INTEGER  NOT NULL
  ,CONSTRAINT TarjetaCirculacion_pkey PRIMARY KEY (numLicencia)
  ,CONSTRAINT TarjetaCirculacion_fkey FOREIGN KEY (numPlaca) REFERENCES Vehiculo(numPlaca)
);

/*Crear Multa*/
CREATE TABLE Multa(
   numMulta   INTEGER  NOT NULL 
  ,RFC        VARCHAR(13) NOT NULL
  ,numPlaca   VARCHAR(6) NOT NULL
  ,NumAgente  INTEGER  NOT NULL
  ,Fecha      DATE  NOT NULL
  ,Calle      VARCHAR(50) NOT NULL
  ,Entre1     VARCHAR(50) 
  ,Entre2     VARCHAR(50) 
  ,CP         CHAR(5)  NOT NULL
  ,Municipio  VARCHAR(50) NOT NULL
  ,Referencia VARCHAR(150) 
  ,CONSTRAINT Multa_pkey PRIMARY KEY (numMulta)
  ,CONSTRAINT Multa_fkey1 FOREIGN KEY (RFC) REFERENCES Propietario(RFC)
  ,CONSTRAINT Multa_fkey2 FOREIGN KEY (numPlaca) REFERENCES Vehiculo(numPlaca)
);

/*Crear Articulo*/
CREATE TABLE Articulo(
   numMulta       INTEGER  NOT NULL 
  ,Articulo       VARCHAR(100) NOT NULL
  ,PrecioArticulo NUMERIC  NOT NULL
  ,CONSTRAINT Articulo_pkey PRIMARY KEY (numMulta,Articulo)
  ,CONSTRAINT Articulo_fkey FOREIGN KEY (numMulta) REFERENCES Multa(numMulta)
);