ALTER TABLE "unittesting$testsuite" RENAME TO "85abf54d77d1493da6beb32cb42825f8";
ALTER TABLE "unittesting$unittest" RENAME TO "824b465333d34865a6894f9a37c926ac";
DROP INDEX "idx_unittesting$unittest_testsuite";
ALTER TABLE "unittesting$unittest_testsuite" RENAME TO "26b4cc412ed143e980628acfc41273df";
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = '1a7d3876-b20c-43bd-8af8-16d7490d292c';
DELETE FROM "mendixsystem$entityidentifier" 
 WHERE "id" = '1a7d3876-b20c-43bd-8af8-16d7490d292c';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = '1a7d3876-b20c-43bd-8af8-16d7490d292c');
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = '1a7d3876-b20c-43bd-8af8-16d7490d292c';
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = '5298d6f5-26b7-4155-9da4-8cf4675b529b';
DELETE FROM "mendixsystem$entityidentifier" 
 WHERE "id" = '5298d6f5-26b7-4155-9da4-8cf4675b529b';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = '5298d6f5-26b7-4155-9da4-8cf4675b529b');
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = '5298d6f5-26b7-4155-9da4-8cf4675b529b';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '4a9c63f3-361d-4a2c-a884-299bfae61f8d';
DROP TABLE "85abf54d77d1493da6beb32cb42825f8";
DROP TABLE "824b465333d34865a6894f9a37c926ac";
DROP TABLE "26b4cc412ed143e980628acfc41273df";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.0.7', 
"lastsyncdate" = '20160824 12:26:17';
