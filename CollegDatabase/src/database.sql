create database studentData;
create table studentInfo(
	id INT NOT NULL AUTO_INCREMENT,
	firstName VARCHAR(100) NOT NULL,
    middleInitial VARCHAR(100) NOT NULL,
    lastName VARCHAR(100) NOT NULL,
    address VARCHAR(100) NOT NULL,
    major VARCHAR(100) NOT NULL,
    minor VARCHAR(100) NOT NULL,
    studentID VARCHAR(100) NOT NULL,
    studentEmail VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);
