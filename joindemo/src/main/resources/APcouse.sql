USE [tempdb]
GO

/****** Object:  Table [dbo].[APcourse]    Script Date: 1/31/2023 9:12:26 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[APcourse](
	[id] [int] NOT NULL,
	[name] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO