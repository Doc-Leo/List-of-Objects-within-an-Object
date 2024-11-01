# List-of-Objects-within-an-Object

[Rentazida_Simulation_OOP(LAB) - Sheet1.pdf](https://github.com/user-attachments/files/17603555/Rentazida_Simulation_OOP.LAB.-.Sheet1.pdf)


![image](https://github.com/user-attachments/assets/7c80a3b1-714f-4fc4-a222-89dcdd627a05)




List of Objects within an Object

Write program StudentReport that generates a report coming from 3 input files. Studinfo.csv contains
the folowing data listing student number, last name, firstname, degree code:

1234, Smith, John, BSCS
1235, Oliveros, Sarah, BSIE
1236, Flamenio, Nancy, BSCS
1237, Bernardo, Bernard, BSECE

ParentInfo.csv consists of student’s number, parent code, and father, mother, or guardians name.
Parent code F stands for father’s name; M for mother’s name; and G for guardian’s name. A student
may or may have not listed his/her parent’s name:

1234, M, Susan Smith
1235, G, Stephanie dela Cruz
1236, F, Arnold Flamenio
1237, G, Teresita Uy
1236, M, Trisha Flamenio
1234, F, Rex Smith
1234, G, Allysa Cruz

AddressInfo.csv is composed of student’s provincial and city addresses. Code for
provincial is P and C for city.

1234, C, 9 Central ave. QC
1234, P, 356 Rizal Ave Cabanatuan City
1235, C, B8 L30 Villa Olympia Cainta Rizal
1236, C, 12 Pilapil St. San Miguel Pasig City
1237, C, 45 Maharlika Ave. Quezon City
1237, P, 143 Mahal Kita Road Bayombong Nueva Viscaya

A Student object consists of id, last name, first name, list of addresses, name of parents or guardian, and
the degree as of his/her field of study.

Address object contains address type where codes C and P are held, and the location of its address.
Parent object is composed of parent code where it may hold values F, M, or G and name that will
accommodate parent’s name.

Degree object holds the degree code and its corresponding name for that particular code.
BSCS has a description of BS Computer Science; BSIE for BS Industrial Engineering; BSCE for BS Civil Engineering; and
BSECE for BS Electronics Engineering.

StudentReport should generate the following report after processing:

Student id is 1234
Student name is SMITH, John
Studying BS Computer Science
City address is 9 Central ave. QC

Provincial address is 356 Rizal Ave Cabanatuan City
Mother's name is Susan Smith
Father's name is Rex Smith
Guardian's name is Allysa Cruz

Student id is 1235
Student name is OLIVEROS, Sarah
Studying BS Industrial Engineering
City address is B8 L30 Villa Olympia Cainta Rizal
Guardian's name is Stephanie dela Cruz

Student id is 1236
Student name is FLAMENIO, Nancy
Studying BS Computer Science
City address is 12 Pilapil St. San Miguel Pasig City
Father's name is Arnold Flamenio
Mother's name is Trisha Flamenio

Student id is 1237
Student name is BERNARDO, Bernard
Studying BS Electronics Engineering
City address is 45 Maharlika Ave. Quezon City
Provincial address is 143 Mahal Kita Road Bayombong Nueva Viscaya
Guardian's name is Teresita Uy
