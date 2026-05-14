# Write your MySQL query statement below
-- select score, dense_rank() over (order by score desc) as 'rank' from scores order by score desc;
# t.c - o(n log n) , .sc - o(n)
select s1.score, (select count(distinct s2.score) from scores s2 where s2.score >= s1.score) as `rank` from scores s1 order by s1.score desc;
#t.c- o(n2) s.c- o(1)
