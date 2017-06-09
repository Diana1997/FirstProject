--use MateritHospital
Create Table Workplace
(
	id int primary key identity,
	name nvarchar(45),
	cnt int,
)
Create table Worker
(
	id int primary key identity,
	name nvarchar(30),
	WorkplaceID int not null,
	Constraint FK_Worker_Workplace Foreign Key(WorkplaceID) References Workplace(id)

)

GO
Create Trigger dbo.WorkerInsert ON dbo.Worker
After Insert
As
	Begin
		Update Workplace SET cnt = cnt - 1 
		From Workplace INNer JOIn inserted 
	    ON Workplace.id  = inserted.WorkplaceID
	End
GO

Insert Into Workplace(name, cnt) Values ('bjisk', 6)
Insert into Worker (name, WorkplaceID) Values ('Anna', 1)

select * from Workplace

go
select TRY_Cast('123456' as int)

select TRY_CONVERT(int, 123.6)
sele
go