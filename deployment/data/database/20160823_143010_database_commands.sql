ALTER TABLE "myfirstmodule$station" ADD "uiccode" varchar(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('4a6c1ed9-4f6f-4217-9b66-91b5c06ce2c4', 
'8e1c1198-6872-4d53-8ec1-731eae1c5df9', 
'UICCode', 
'uiccode', 
30, 
200, 
'', 
FALSE);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.0.7', 
"lastsyncdate" = '20160823 13:30:08';
