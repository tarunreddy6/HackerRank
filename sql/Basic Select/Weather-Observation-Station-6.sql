# Author: Tarun Reddy Kalluri

Select distinct(city)
from station
where left(city,1) in ('a','e','i','o','u');
