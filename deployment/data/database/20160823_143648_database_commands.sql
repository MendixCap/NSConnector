ALTER TABLE "myfirstmodule$station" ADD "landcode" varchar(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('1a5532e4-3520-410c-bfe9-227d4e4a11ce', 
'8e1c1198-6872-4d53-8ec1-731eae1c5df9', 
'LandCode', 
'landcode', 
30, 
200, 
'', 
FALSE);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.0.7', 
"lastsyncdate" = '20160823 13:36:32';
