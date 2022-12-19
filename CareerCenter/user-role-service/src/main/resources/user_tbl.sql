USE [tempdb]
GO

/****** Object:  Table [dbo].[user_tbl1]    Script Date: 12/16/2022 1:45:15 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[user_tbl](
	[id] [int]  NOT NULL,
	[name] [varchar](50) NOT NULL,
	[password] [varchar](50) NOT NULL,
	[role_id] [varchar](50) NOT NULL
) ON [PRIMARY]
GO


