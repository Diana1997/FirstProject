Go
Select p.ProjectName, l.ProjectID 
FROM Project AS p LEft join ProjectLocation as l
ON p.ProjectID = l.ProjectID
GO



Select p.ProjectName,  C_Province.ProvinceName
FROM Project AS p LEft join ProjectLocation as l
ON p.ProjectID = l.ProjectID  Left join C_Province on l.ProvinceID = C_Province.ProvinceID

Select p.ProjectID From Project As p 
EXCEPT  
select l.ProjectID From ProjectLocation  l -- alias@ karox e grvel aranc as-i


select p.ProjectID, p.ProjectName, d.ProjectID From Project As p 
left join ProjectDonor As d on p.ProjectID = d.ProjectID Where  d.ProjectID is null

Select p.ProjectID From Project As p 
EXCEPT  
select d.ProjectID From ProjectDonor As d


select * from Project
select * from ProjectLocation
Delete from ProjectLocation where ProjectLocationID = 9 
select * from ProjectDonor
Delete from ProjectDonor where ProjectDonorID = 6


select ProjectID  as procejtLocation From ProjectLocation
union  --all
select ProjectID as projectDOnor from ProjectDonor



select p.ProjectName, c.CurrencyName, Donors.OrganisationName as DonorName
From Project  as p
Inner join C_Currency as c ON p.CurrencyID = c.CurrencyID
INner join (
	Select Project.ProjectName, C_Organisation.OrganisationName  From Project inner join ProjectDonor on Project.ProjectID = ProjectDonor.ProjectDonorID
	inner join C_Organisation on C_Organisation.OrganisationID = ProjectDonor.DonorID  ) as Donors on p.ProjectName = Donors.ProjectName

Select * From Project, C_Currency
select * from C_Currency