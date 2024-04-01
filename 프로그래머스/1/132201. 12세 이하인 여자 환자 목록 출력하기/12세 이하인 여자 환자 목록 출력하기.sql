-- 코드를 입력하세요
SELECT PT_NAME, PT_NO, GEND_CD, AGE, ifnull(tlno, 'NONE')as TNLO
from patient
WHERE AGE <= '12' and gend_cd in ('W')
order by age desc, PT_NAME asc;