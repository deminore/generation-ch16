USE generation;

SELECT Students.*, idtypes.id_idTypes FROM Students INNER JOIN idtypes
ON Students.IdType_id = idtypes.id_idTypes;

SELECT * FROM idtypes;
SELECT * FROM students;


SELECT Students.*, courses_has_students.course_code FROM Students INNER JOIN courses_has_students
ON Students.idStudent = courses_has_students.students_id_student;


SELECT courses_has_students.*, courses.code, courses.name FROM courses_has_students 
INNER JOIN courses ON courses.code = courses_has_students.course_code;



