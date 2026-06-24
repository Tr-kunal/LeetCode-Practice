# Write your MySQL query statement below
SELECT st.student_id,st.student_name, s.subject_name, COUNT(e.student_id) as attended_exams
FROM Students st 
CROSS JOIN Subjects s 
LEFT JOIN Examinations e 
on st.student_id = e.student_id and e.subject_name = s.subject_name
group by st.student_id,st.student_name, s.subject_name
order by st.student_id, s.subject_name;
