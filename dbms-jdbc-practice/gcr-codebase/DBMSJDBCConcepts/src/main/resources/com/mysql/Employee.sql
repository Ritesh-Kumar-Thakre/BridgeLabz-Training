-- data base created
create database employee;

-- useing the db
use employee;

-- employeeData tabel created
create table employeeData(
ID int primary key,
name varchar(50) not null,
age int not null,
salary double not null);

-- inserting data into table
insert into employeeData values(142,"Ritesh",22,150000);
insert into employeeData values(175,"Raj",21,50000);
insert into employeeData values(152,"Ram",29,350000);
insert into employeeData values(536,"Ravi",42,60000);
insert into employeeData values(734,"Rohan",34,80000);

-- show all data for the tabe
select * from employeeData;

-- update salary 
update employeeData 
set salary = 450000 
where ID = 175;

-- delete employee
delete from employeeData where ID = 734;

-- search employee by name
select * from employeeData where name = "Ritesh";