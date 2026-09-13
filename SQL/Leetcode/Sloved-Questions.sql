197. Rising Temperature

select w1.id
from Weather w1
join weather w2
 ON w2.recordDate = DATE_SUB(w1.recordDate, INTERVAL 1 DAY)
where w1.temperature > w2.temperature;

