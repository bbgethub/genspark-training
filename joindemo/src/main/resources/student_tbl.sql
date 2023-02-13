USE [tempdb]
GO

/****** Object:  Table [dbo].[student]    Script Date: 1/30/2023 12:28:22 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[student](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[first_name] [nvarchar](50) NULL,
	[last_name] [nvarchar](50) NOT NULL,
	[email] [nvarchar](50) NULL,
	[address_id] [int] NOT NULL
) ON [PRIMARY]
GO
