SELECT surname
FROM employees
WHERE experience = (
  SELECT MAX(experience)
  FROM employees
  WHERE experience < (
    SELECT MAX(experience)
    FROM employees
  )
);
