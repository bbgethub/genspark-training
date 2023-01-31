USE [tempdb]
GO

/****** Object:  Table [dbo].[student]    Script Date: 1/30/2023 12:28:22 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[student](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[firstName] [nvarchar](50) NULL,
	[lastName] [nvarchar](50) NOT NULL,
	[addressId] [int] NOT NULL
) ON [PRIMARY]
GO
