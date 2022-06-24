CREATE TABLE IF NOT EXISTS Productos
(
Codigo VARCHAR(4) PRIMARY KEY,
Nombre VARCHAR (80),
Categoria VARCHAR (20),
Cantidad INT UNSIGNED,
ValorCompra INT UNSIGNED,
ValorVenta INT UNSIGNED,
Marca VARCHAR (20),
Medida VARCHAR (40),
Descripcion VARCHAR(100)
);

INSERT INTO Productos VALUES ("0101","Arena de Peña","Arena",17500,6200,8200,"Generica","40kg","Arenapanete Pega Ensacado");
INSERT INTO Productos VALUES ("0102","Arena de Rio","Arena",17500,5400,8800,"Generica","40kg","Arena Concreto Ensacado");
INSERT INTO Productos VALUES ("0103","Mixto","Arena",17500,7660,9900,"Generica","40kg","Ensacado Piedra y Arena");
INSERT INTO Productos VALUES ("0104","Gravilla","Arena",17500,6700,8900,"Generica","40kg","Gravilla Piedra Ensacado");
INSERT INTO Productos VALUES ("0105","Arena Lavada","Arena",17500,7250,9900,"Generica","40kg","Arenapanete Pega Ensacado");
INSERT INTO Productos VALUES ("0106","Piedra China","Arena",17500,6150,8200,"Generica","40kg","Uso en Concretos, Piedra N°4");

INSERT INTO Productos VALUES ("0201","Cantonera eléctrica 110v ","Bisagras",150,64000,94400,"Cisa","Placa larga","Mantiene cerrada la puerta hasta conectar con 110v DC");
INSERT INTO Productos VALUES ("0202","Cantonera eléctrica 12v ","Bisagras",150,55000,54400,"Cisa","Placa Corta","Mantiene cerrada la puerta hasta conectar con 12v DC");
INSERT INTO Productos VALUES ("0203","Bisagra Parche Mobible","Bisagras",50,2600,4900,"Generico","35mm","No incluye ningún elemento o pieza adicional");
INSERT INTO Productos VALUES ("0204","Bisagra en Riel","Bisagras",40,8650,10500,"Generico","35mm","Closet Galvanisado en acero");

INSERT INTO Productos VALUES ("0301","Cable Polipropileno 1/2","Cables",8020,1290,2000,"Ciplas","1/2","Venta por Metro");
INSERT INTO Productos VALUES ("0302","Cable Polipropileno 1/4","Cables",9500,390,500,"Ciplas","1/4","Venta por Metro");
INSERT INTO Productos VALUES ("0303","Cable Polipropileno 3/4","Cables",1040,3590,4600,"Ciplas","3/4","Venta por Metro");
INSERT INTO Productos VALUES ("0304","Cable Polipropileno 3/8","Cables",2020,1190,1200,"Ciplas","3/8","Venta por Metro");

INSERT INTO Productos VALUES ("0401","Candado Acero Especial 37rk70","Candados",30,505000,664400,"Abus","77x103cm","8 toneladas");
INSERT INTO Productos VALUES ("0402","Candado Acero Endurecido 37/55","Candados",50,304700,447599,"Abus","67x93cm","Resistencia al corte");
INSERT INTO Productos VALUES ("0403","Candado anti-cizalla 50mm","Candados",300,20100,30999,"Stanley","50x38cm","Clavija antiganzúa");
INSERT INTO Productos VALUES ("0404","Candado Especial 70mm Aleman","Candados",300,80990,91600,"Stanley","50x38cm","Clavija antiganzúa");
INSERT INTO Productos VALUES ("0405","Candado Anticorrosivo Latón","Candados",100,120490,164930,"Yale","80x96cm","Alta seguridad");

INSERT INTO Productos VALUES ("0501","Cinta Antideslizante Negra","Cintas",5600,22600,34990,"Practak","25mmx15m","Rollo antideslizante y autoadhesivo");
INSERT INTO Productos VALUES ("0502","Cinta Ductos Algodon","Cintas",680,12600,21990,"Toolcraft","48mmx45m","Para ductos y multiples sellados");
INSERT INTO Productos VALUES ("0503","Cinta Doble FAz Espuma","Cintas",500,9750,14590,"Hystik","18mmx15m","Hidrofobica, antideslizante y autoadhesivo");
INSERT INTO Productos VALUES ("0504","Cinta Empaque Transparente","Cintas",1000,7890,10990,"Startape","48mmx100m","Paqueteria de alto embalaje en carton");
INSERT INTO Productos VALUES ("0505","Cinta Empaque Transparente","Cintas",2000,2890,5390,"Startape","48mmx40m","Paqueteria de alto embalaje en carton");

INSERT INTO Productos VALUES ("0601","Puntilla De Hierro","Clavos",100,7600,9600,"Yale","12x5.5x.4.9cm","Caja 500und");
INSERT INTO Productos VALUES ("0602","Clavo con Cabeza 1/2","Clavos",307,1250,3250,"Generico","1/2pulgx18","Paquete 100und");
INSERT INTO Productos VALUES ("0603","Clavo con Cabeza 2/1","Clavos",305,1250,3250,"Generico","2pulgx11","Paquete 10und");
INSERT INTO Productos VALUES ("0604","Clavo Galvanizado","Clavos",250,2200,3250,"Generico","1pulgx18","Paquete 60und");
INSERT INTO Productos VALUES ("0605","Clavo sin Cabeza 3/4","Clavos",500,1250,3300,"Generico","3/4pulgx18","Paquete 40und");
INSERT INTO Productos VALUES ("0606","Tachuela Tapiceria No6","Clavos",550,1100,3200,"Generico","9x5.5x5cm","Paquete 20und");
INSERT INTO Productos VALUES ("0607","Chinche Plastificado","Clavos",170,10800,15900,"Skuty","5x5x9cm","Caja 500und Surtida");
INSERT INTO Productos VALUES ("0608","Clavo Acero Liso","Clavos",100,5500,7500,"Yale","9x5.5x6.4cm","Caja 500und");

INSERT INTO Productos VALUES ("0701","Destornillador inalámbrico 3,6v","Destornilladores",50,89000,98000,"Elite","3,6volt","velocidad 200rpm, uso profesional, carga 3-5h");
INSERT INTO Productos VALUES ("0702","Destornillador inalámbrico 4,8v","Destornilladores",50,65900,88200,"Elite","4,8volt","velocidad 200rpm, uso semiprofesional, carga 3-5h");
INSERT INTO Productos VALUES ("0703","Destornillador inalámbrico y atornillador","Destornilladores",15,252600,343500,"Elite","ion lit 3/8","velocidad 350rpm, uso profesional, carga 7h");

INSERT INTO Productos VALUES ("0801","Set de Herramientas","Herramientas",20,90500,130300,"Primestock","11 piezas","Cuter, pinza alicate, martillo, 2 destornilladores, un destornillador tester y 5 llaves allen");
INSERT INTO Productos VALUES ("0802","Herramientero multiproposito","Herramientas",50,31500,55500,"Primestock","19 piezas","Destornillador con 10 puntas diferentes, 4 llaves allen, 4 llaves tubo de 4 medidas");

INSERT INTO Productos VALUES ("0901","Bloque #4 estandar 15u/m2","Ladrillo",10000,750,1100,"Ceranova","10x20x30cm","Ladrillo en Arcilla");
INSERT INTO Productos VALUES ("0902","Bloque #5 estandar 15u/m2","Ladrillo",10000,850,1200,"Ceranova","12x20x30cm","Ladrillo en Arcilla");
INSERT INTO Productos VALUES ("0903","Bloque #6 estandar 15u/m2","Ladrillo",10000,1950,3100,"Ceranova","13x21x30cm","Ladrillo en Arcilla");
INSERT INTO Productos VALUES ("0904","Bloque #3 estandar 15u/m2","Ladrillo",10000,350,800,"Ceranova","40x20x7cm","Ladrillo en Arcilla");
INSERT INTO Productos VALUES ("0905","Bloquelon estandar 15u/m2","Ladrillo",10000,750,1100,"Ladrillera Santa Fe","10x20x30cm","Ladrillo en Arcilla");

INSERT INTO Productos VALUES ("1001","Curva PVC 90","PVC",705,1990,3690,"Polimex","3/4 pulg","1und en Polipropileno");
INSERT INTO Productos VALUES ("1002","Cruz PVC 90","PVC",600,4990,6490,"Polimex","3/4 pulg","1und en Polipropileno");
INSERT INTO Productos VALUES ("1003","Union PVC","PVC",540,3990,5690,"Polimex","3/4 pulg","1und inserto metalico");
INSERT INTO Productos VALUES ("1004","Adaptador PVC","PVC",520,2990,3690,"Polimex","4 pulg","1und limp metalico");
INSERT INTO Productos VALUES ("1005","Reduccion Mh PVC","PVC",500,990,1690,"Polimex","32x25mm","1und en Polipropileno");
INSERT INTO Productos VALUES ("1006","Union Universal","PVC",750,2990,4990,"Pavco","3/4 pulg","1und multifincional");
INSERT INTO Productos VALUES ("1007","Tubo Presion 1/2","PVC",1450,12990,21990,"Pavco"," 1/2pulg x 6mts","Tubo en Polipropileno");
INSERT INTO Productos VALUES ("1008","Tubo Sanitario 4","PVC",1650,32990,56090,"Pavco"," 4pulg x 6mts","Tubo en Polipropileno");
INSERT INTO Productos VALUES ("1009","Tubo Presion 1/2","PVC",980,7990,19090,"Pavco"," 1/2pulg x 3mts","Tubo en Polipropileno");
INSERT INTO Productos VALUES ("1010","Tubo Sanitario 3","PVC",450,65990,94090,"Pavco"," 3pulg x 6mts","Tubo en Polipropileno");
INSERT INTO Productos VALUES ("1011","Tubo Sanitario 2","PVC",680,30990,63090,"Pavco"," 2pulg x 6mts","Tubo en Polipropileno");
INSERT INTO Productos VALUES ("1012","Tubo Presion 1/2","PVC",1150,6990,9090,"Pavco"," 1/2pulg x 3mts","Tubo en Polipropileno");
INSERT INTO Productos VALUES ("1013","Tubo Sanitario 6","PVC",650,132990,156090,"Pavco"," 6pulg x 6mts","Tubo en Polipropileno");

INSERT INTO Productos VALUES ("1101","Lija de agua GR-60","Lijas",9000,550,1000,"Carborundum","GR-60 9x11cm","1und Premier Plus");
INSERT INTO Productos VALUES ("1102","Lija de agua GR-120","Lijas",9000,550,1000,"Carborundum","GR-120 9x11cm","1und Premier Plus");
INSERT INTO Productos VALUES ("1103","Lija de agua GR-150","Lijas",9000,550,1000,"Carborundum","GR-150 9x11cm","1und Premier Plus");
INSERT INTO Productos VALUES ("1104","Lija de agua GR-180","Lijas",9000,550,1000,"Carborundum","GR-180 9x11cm","1und Premier Plus");
INSERT INTO Productos VALUES ("1105","Lija de agua GR-220","Lijas",9000,450,800,"Carborundum","GR-220 9x11cm","1und Premier Plus");
INSERT INTO Productos VALUES ("1106","Lija de agua GR-240","Lijas",9000,450,800,"Carborundum","GR-240 9x11cm","1und Premier Plus");
INSERT INTO Productos VALUES ("1107","Lija Micro Fina GR-1000","Lijas",9000,1050,2900,"Norton","GR-1000 9x11cm","1und Micro-fina");
INSERT INTO Productos VALUES ("1108","Lija Micro Fina GR-1200","Lijas",9000,1050,2900,"Norton","GR-1200 9x11cm","1und Micro-fina");
INSERT INTO Productos VALUES ("1109","Lija Micro Fina GR-1500","Lijas",9000,1050,2900,"Norton","GR-1500 9x11cm","1und Micro-fina");
INSERT INTO Productos VALUES ("1110","Lija Premier Red GR-100","Lijas",9000,750,1900,"Carborundum","GR-100 9x11cm","1und Premier Red");
INSERT INTO Productos VALUES ("1111","Lija Premier Red GR-150","Lijas",9000,650,1800,"Carborundum","GR-150 9x11cm","1und Premier Red");

INSERT INTO Productos VALUES ("1201","Tornillo Aglomerado Autoperforante 6X1","Tornillos",10000,3650,4150,"Fixer","0.140x1 pulgadas","Caja 100und para Madera");
INSERT INTO Productos VALUES ("1202","Tornillo Aglomerado Autoperforante 6X2","Tornillos",15000,5650,6750,"Fixer","0.140x2 pulgadas","Caja 100und para Madera");
INSERT INTO Productos VALUES ("1203","Tornillo Aglomerado Autoperforante 8X1","Tornillos",11000,4650,6350,"Fixer","0.160x1-1/2 pulgadas","Caja 100und para Madera");
INSERT INTO Productos VALUES ("1204","Tornillo Aglomerado Autoperforante 6X3/4","Tornillos",12000,3650,4150,"Fixer","0.140x3/4 pulgadas","Caja 100und para Madera");
INSERT INTO Productos VALUES ("1205","Tornillo Estufa Milimétrico ","Tornillos",16000,2550,3950,"Fixer","4x12mm","Paquete 6und para la industria eléctrica");
INSERT INTO Productos VALUES ("1206","Tornillo Hexagonal 1/2pulg","Tornillos",17000,4550,6950,"Fixer","1/4 x 3-1/2 pulg","Paquete 2und para uso universal y lamina");
INSERT INTO Productos VALUES ("1207","Tornillo Hexagonal 1pulg","Tornillos",17000,3550,5950,"Fixer","1/4 x 1 pulg","Paquete 3und para uso universal y lamina");
INSERT INTO Productos VALUES ("1208","Tornillo Hexagonal 3/4pulg","Tornillos",17000,3150,5550,"Fixer","1/4 x 3/4 pulg","Paquete 3und para uso universal y lamina");