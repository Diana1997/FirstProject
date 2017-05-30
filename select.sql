SELECT * FROM C_Currency ORder by currency offset 3 row
SELECT * FROM C_Currency ORder by currency offset 3 rows Fetch next 2 rows only
select @@VERSION

SELECT * FROM C_Currency Where CurrencyID = 5 OR CurrencyID = 6
SELECT * From ProjectLocation

--1
Select ProjectName, StartDate, EndDate, ProjectDescription From Project WHere ProjectID>3
--2
Select ProjectID, ProjectName, StartDate From Project WHere ProjectID>3 and ProjectID<5
--3
Select * From Project  Where ProjectID = 7 OR ProjectID = 9
--4
Select * From Project Where not exists 
 (Select ProjectID From ProjectLocation)
--4
 Select * From Project Where ProjectID not in
 (Select ProjectID From ProjectLocation)
--5
Select ProjectName, StartDate, EndDate From Project Where ProjectID = 3 and exists (
	Select ProjectID FROm ProjectLocation Where ProjectID = 3
)
--5
Select ProjectName, StartDate, EndDate From Project Where ProjectID in (
	Select ProjectID FROm ProjectLocation Where ProjectID = 3
)
--6
Select Top(3) * From  Project Order by StartDate asc

--7
Select top(10)  percent * From Project Order By EndDate asc

--8
SELECT * FROM Project Order by ProjectID offset 1 rows Fetch next 1 rows only

--9
GO
Create view ProjectView
As 
Select ProjectName, StartDate, EndDate From Project Where SubsectorID is not null
GO
--10
Select distinct FirstName, lastname From ProjectContact

--13
Delete FRom Project Where SubsectorID = 3

--11
Update Project 
Set StartDate = '2014-05-05'
where ProjectID = 1
--12
Update ProjectContact
Set FirstName= '222' + FirstName 
Where OrganisationID = 2