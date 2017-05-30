use Chili
Go
DROp table Donor
Alter Table Selected_Donor
	Drop Constraint FK_Selected_Donor_Donor
Alter Table ProjectDonor
	Add Constraint FK_ProjectDonor_C_Organisation Foreign Key(DonorID) References C_Organisation(OrganisationID)
Alter Table ProjectDonor
	Add  ProjectDonorID int not null identity
Alter Table ProjectDonor
	Add Constraint PK_ProjectDonor Primary key(ProjectDonorID)

INSERT INTO C_Currency(currency) VaLues  (N'JPY (¥)'),(N'GBP (£)'),(N'AUD ($)'),(N'CAD ($)'),(N'CHF (Fr)'),(N'CNY (¥)'),(N'SEK (kr)')
DELETE C_Currency Where CurrencyID = 2
UPDATE C_Currency SET currency = N'ՀՀ դրամ' WHere CurrencyID = 2
GO
Alter table C_District 
	Add Constraint UC_District  UNIQUE(name)
Go
Alter table C_Organisation
	Add Constraint UC_Organisation UNIQUE(name)
Go
Alter table C_Province
	Add Constraint UC_Province UNIQUE(name)
Go
Alter table C_Region
	Add Constraint UC_Region UNIQUE(name)
Go
Alter table C_Sector
	Add Constraint UC_Sector UNIQUE(name)
Go
Alter table C_Subsector
	Add Constraint UC_Subsector UNIQUE(name)
Go
--Insert into ProjectContact
Alter Table ProjectContact
	Drop constraint FK_Contact_Project
Go
Alter Table ProjectContact
	Add constraint FK_ProjectContact_Project Foreign Key(ProjectID) References Project(ProjectID)
use master 
Drop Database  Chili_12