--  https://leetcode.com/problems/duplicate-emails/

SELECT Email from Person group by Email having count(Email) > 1;

