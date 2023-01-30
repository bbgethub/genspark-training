USE [tempdb]
GO

/****** Object:  Table [dbo].[address]    Script Date: 1/30/2023 1:41:45 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[address](
	[id] [int] NOT NULL,
	[street] [nvarchar](max) NOT NULL,
	[city] [nvarchar](50) NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
