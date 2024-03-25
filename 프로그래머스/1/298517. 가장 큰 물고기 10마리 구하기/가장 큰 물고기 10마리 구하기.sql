-- 코드를 작성해주세요

select id, length
from fish_info 
where id not in ('4','5')
ORDER by length desc LIMIT 0, 10;
