
/*
Revising the Select Query I
*/
select * from city where population>100000 and countrycode = 'USA';

/*
Revising the Select Query II
*/
Select name from city where population>120000 and countrycode='USA';

/*
Select All
*/
Select * from city;

/*
Select By ID
*/
Select * from city where id=1661;

/*
Japanese Cities' Attributes
*/
Select * from city where countrycode='JPN';

/*
Japanese Cities' Names
*/
Select name from city where countrycode='JPN';

/*
Weather Observation Station 1
*/
Select city, state from station;

/*
Weather Observation Station 3
*/
Select distinct city from station where id%2=0;

/*
Weather Observation Station 4
*/
Select count(city) - count(distinct city) from station; 


/*
Weather Observation Station 5
*/
Select city, char_length(city) from station order by char_length(city), city limit 1;
Select city, char_length(city) from station order by char_length(city) desc, city limit 1;

/*
Weather Observation Station 6
*/
Select distinct city from station where city like 'a%' or city like 'e%' or city like 'i%' or city like 'o%' or city like 'u%';
-- or
Select distinct city from station where left(city,1) in ('a','e','i','o','u');

/*
Weather Observation Station 7
*/
Select distinct city from station where city like '%a' or city like '%e' or city like '%i' or city like '%o' or city like '%u';
-- or
Select distinct city from station where right(city,1) in ('a','e','i','o','u');

/*
Weather Observation Station 8
*/
Select distinct city from station where left(city,1) in ('a','e','i','o','u') and right(city,1) in ('a','e','i','o','u');

/*
Weather Observation Station 9
*/
Select distinct city from station where left(city,1) not in ('a','e','i','o','u');

/*
Weather Observation Station 10
*/
Select distinct city from station where right(city,1) not in ('a','e','i','o','u');

/*
Weather Observation Station 11
*/
Select distinct city from station where left(city,1) not in ('a','e','i','o','u') or right(city,1) not in ('a','e','i','o','u');

/*
Weather Observation Station 12
*/
Select distinct city from station where left(city,1) not in ('a','e','i','o','u') and right(city,1) not in ('a','e','i','o','u');

/*
Higher Than 75 Marks
*/
Select name from students where marks > 75 order by substr(name, char_length(name)-2,3),id;

/*
Employee Names
*/
Select name from employee order by name;

/*
Employee Salaries
*/
Select name from employee where salary > 2000 and months < 10 order by employee_id;

/*
Revising Aggregations - Averages
*/
Select avg(population) from city where district = 'california';


/*
Type of Triangle
*/
Select case
    when !(A+B > C AND B+C > A AND A+C > B) then "Not A Triangle"
    when (A=B AND B=C) then "Equilateral"
    when (A=B OR A=C OR B=C) then "Isosceles"
    else "Scalene"
end from Triangles;

/*
**********
The PADS
********** 
*/
select concat(name,"(",left(occupation,1) ,")") from occupations order by name;
select concat("There are a total of ",count(*)," ",lower(occupation),"s.") from occupations group by occupation order by count(*),occupation;

-- or, as in discussions

select concat(Name,'(',Substring(Occupation,1,1),')') as Name from occupations Order by Name;
select concat('There are total',' ',count(occupation),' ',lower(occupation),'s.') as total from occupations group by occupation order by total;


/*
*****************
MySql Basic Joins
*****************
*/

/*
Asian Population
*/
Select sum(city.population) from city inner join country on city.countrycode = country.code where country.continent = "asia";

/*
African Cities
*/
Select city.name from city inner join country on city.countrycode = country.code where country.continent = "Africa";

/*
Average Population of Each Continent
*/
Select country.continent, floor(avg(city.population)) from city inner join country on city.countrycode=country.code group by country.continent; 

/*
The Report
*/

Select 
(case 
when g.grade>=8 then s.name
 else "NULL"
end)
,g.grade, s.marks from Students s inner join Grades g on g.min_mark <= s.marks and g.max_mark >= s.marks order by g.grade desc, s.name;

-- or
SELECT (CASE g.grade>=8 WHEN TRUE THEN s.name ELSE null END),g.grade,s.marks FROM students s INNER JOIN grades g ON s.marks BETWEEN min_mark AND max_mark ORDER BY g.grade DESC,s.name,s.marks;

/*
Top Competitors
*/
Select h.hacker_id, h.name from hackers as h 
inner join submissions s using (hacker_id)
inner join challenges c using(challenge_id)
inner join difficulty d using(difficulty_level)
where s.score = d.score group by h.hacker_id, h.name having count(*)>1 order by count(s.score) desc, h.hacker_id;

/*
Ollivander's Inventory
*/
Select w.id, wp.age, w.coins_needed, w.power from wands w inner join wands_property wp using(code) where wp.is_evil = 0 and w.coins_needed in (
	select min(coins_needed) from wands inner join wands_property using(code) where w.power = wands.power and wp.age = wands_property.age
	) order by w.power desc, wp.age desc;
