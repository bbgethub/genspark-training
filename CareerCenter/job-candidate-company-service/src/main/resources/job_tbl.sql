SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[job_tbl](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[tittle] [varbinary](50) NOT NULL,
	[description] [varchar](max) NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO