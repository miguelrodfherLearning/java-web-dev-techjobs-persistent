## Part 1: Test it with SQL
SELECT isc.TABLE_NAME, isc.COLUMN_NAME, isc.COLUMN_TYPE
 FROM INFORMATION_SCHEMA.COLUMNS isc
WHERE TABLE_SCHEMA='techjobs'
AND TABLE_NAME IN ('job', 'skill', 'employer');
## Part 2: Test it with SQL
USE techjobs;
SELECT name FROM employer
WHERE location = 'Saint Louis';

## Part 3: Test it with SQL
drop table job;
## Part 4: Test it with SQL
USE techjobs;
SELECT name, description FROM skill order by name;