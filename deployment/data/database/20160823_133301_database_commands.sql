CREATE TABLE "myfirstmodule$stations" (
	"id" int8 NOT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name")
 VALUES ('3b705b2f-f610-4f9c-a6b4-4fe4aae14e49', 
'MyFirstModule.Stations', 
'myfirstmodule$stations');
CREATE TABLE "myfirstmodule$station" (
	"id" int8 NOT NULL,
	"name" varchar(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name")
 VALUES ('8e1c1198-6872-4d53-8ec1-731eae1c5df9', 
'MyFirstModule.Station', 
'myfirstmodule$station');
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('9feb1e4c-b63c-4c06-9052-a48215002eff', 
'8e1c1198-6872-4d53-8ec1-731eae1c5df9', 
'Name', 
'name', 
30, 
200, 
'', 
FALSE);
CREATE TABLE "myfirstmodule$station_stations" (
	"myfirstmodule$stationid" int8 NOT NULL,
	"myfirstmodule$stationsid" int8 NOT NULL,
	PRIMARY KEY("myfirstmodule$stationid","myfirstmodule$stationsid"));
CREATE INDEX "idx_myfirstmodule$station_stations" ON "myfirstmodule$station_stations" ("myfirstmodule$stationsid","myfirstmodule$stationid");
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('52945fde-30b3-4e05-982c-da843035bf81', 
'MyFirstModule.Station_Stations', 
'myfirstmodule$station_stations', 
'8e1c1198-6872-4d53-8ec1-731eae1c5df9', 
'3b705b2f-f610-4f9c-a6b4-4fe4aae14e49', 
'myfirstmodule$stationid', 
'myfirstmodule$stationsid', 
'idx_myfirstmodule$station_stations');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.0.7', 
"lastsyncdate" = '20160823 12:33:00';
