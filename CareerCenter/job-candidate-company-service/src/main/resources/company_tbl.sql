SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[company_tbl](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [varbinary](50) NOT NULL,
	[address] [varchar](max) NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
