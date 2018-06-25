DROP TABLE IF EXISTS department_employee;
DROP TABLE IF EXISTS project_employee;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS  jobTitle;


CREATE TABLE jobTitle (
 jobTitleId serial not null
, jobTitle varchar(100),

constraint pk_JobTitleId primary key (jobTitleId)

);

CREATE TABLE project (
 projectId serial not null
 , projectName varchar(100) null
 , startdate DATE NOT NULL DEFAULT CURRENT_DATE,
 
 constraint pk_projectId primary key (projectId)

);

CREATE TABLE department (
 departmentId serial not null
 , departmentName varchar(100) not null,
 
  constraint pk_departmentId primary key (departmentId)

);


CREATE TABLE employee (
  employeeId serial not null
, jobTitleId int not null
, birthday DATE not null
, hireDate DATE not null DEFAULT CURRENT_DATE
, gender varchar(10) null
, firstName varchar(100)
, lastName varchar(100),

constraint pk_employeeId primary key (employeeId),
constraint fk_jobTitleId foreign key (jobTitleId) references jobTitle(jobTitleId),
constraint chk_gender
        check ((gender = 'M') 
        OR (gender = 'F')
        OR (gender IS NULL))
);


CREATE TABLE department_employee (
 departmentId serial not null
, employeeId serial not null,
 
 constraint pk_departmentId_employeeId primary key (departmentId, employeeId),
 constraint fk_departmentId foreign key (departmentId) references department(departmentId),
 constraint fk_employeeId foreign key (employeeId) references employee(employeeId)

);


CREATE TABLE project_employee (
 projectId serial not null
 , employeeId serial not null,
 
  constraint pk_employeeid_projectId primary key (employeeId, projectId),
  constraint fk_projectId foreign key (projectId) references project(projectId),
  constraint fk_employeeid foreign key (employeeId) references employee(employeeId)
);

INSERT INTO jobTitle(jobTitle) Values('Super Editor');
INSERT INTO jobTitle(jobTitle) Values('Ultimate Legend');
INSERT INTO jobTitle(jobTitle) Values('The King');
INSERT INTO jobTitle(jobTitle) Values('Peasant');


INSERT INTO employee( jobTitleId, birthday, hireDate, gender, firstName, lastName) VALUES (1, '1/1/1993', current_timestamp, 'M', 'Zach', 'Groves');
INSERT INTO employee( jobTitleId, birthday, hireDate, gender, firstName, lastName) VALUES (2, '1/1/1931', current_timestamp, 'M', 'Greg', 'Ugby');
INSERT INTO employee( jobTitleId, birthday, hireDate, gender, firstName, lastName) VALUES (2, '1/1/1981', current_timestamp, 'M', 'George', 'Snuggles');
INSERT INTO employee( jobTitleId, birthday, hireDate, gender, firstName, lastName) VALUES (1, '1/1/1981', current_timestamp, 'F', 'Omega', 'Rampage');
INSERT INTO employee( jobTitleId, birthday, hireDate, gender, firstName, lastName) VALUES (4, '1/1/1981', current_timestamp, 'M', 'Max', 'Power');
INSERT INTO employee( jobTitleId, birthday, hireDate, gender, firstName, lastName) VALUES (3, '1/1/1781', current_timestamp, 'M', 'Bret', 'Landers');
INSERT INTO employee( jobTitleId, birthday, hireDate, gender, firstName, lastName) VALUES (4, '1/1/1986', current_timestamp, 'F', 'Jill', 'Jammin');
INSERT INTO employee( jobTitleId, birthday, hireDate, gender, firstName, lastName) VALUES (4, '1/1/1988', current_timestamp, 'F', 'Lisa', 'Lox');
INSERT INTO employee( jobTitleId, birthday, hireDate, gender, firstName, lastName) VALUES (4, '1/1/1800', current_timestamp, 'F', 'Brit', 'Boolean');

INSERT INTO project(projectName, startdate) VALUES ('World Domination', '1/1/1500');
INSERT INTO project(projectName, startdate) VALUES ('Lost Lands', '1/1/1');
INSERT INTO project(projectName, startdate) VALUES ('To Magic We Go', '1/1/1800');
INSERT INTO project(projectName, startdate) VALUES ('Mastery', '1/1/1300');

INSERT INTO department(departmentName) VALUES ('The Legion');
INSERT INTO department(departmentName) VALUES ('Dawn Squad');
INSERT INTO department(departmentName) VALUES ('Red Storm');

INSERT INTO department_employee VALUES (1, 1);
INSERT INTO department_employee VALUES (1, 2);
INSERT INTO department_employee VALUES (2, 3);
INSERT INTO department_employee VALUES (2, 4);
INSERT INTO department_employee VALUES (3, 5);
INSERT INTO department_employee VALUES (3, 6);
INSERT INTO department_employee VALUES (3, 7);
INSERT INTO department_employee VALUES (2, 8);
INSERT INTO department_employee VALUES (1, 9);

INSERT INTO project_employee Values (1,1);
INSERT INTO project_employee Values (1,2);
INSERT INTO project_employee Values (1,3);
INSERT INTO project_employee Values (2,4);
INSERT INTO project_employee Values (2,5);
INSERT INTO project_employee Values (3,6);
INSERT INTO project_employee Values (4,7);
INSERT INTO project_employee Values (3,8);
INSERT INTO project_employee Values (3,9);