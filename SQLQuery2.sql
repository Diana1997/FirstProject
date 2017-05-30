USE [Chili]
GO

SELECT [RegionID]
      ,[name]
  FROM [dbo].[C_Region]
  WHERE name LIke 'A%_'
GO


