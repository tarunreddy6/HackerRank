# Author: Tarun Reddy Kalluri

select city, length(city) from station
order by length(city),city limit 1;

select city, length(city) from station
order by length(city) desc
limit 1;
