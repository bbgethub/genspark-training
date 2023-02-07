USE [tempdb]
GO

/****** Object:  Table [dbo].[grade]    Script Date: 2/6/2023 3:04:13 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[grade](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[student_id] [int] NOT NULL,
	[course_id] [int] NOT NULL,
	[grade_level] [nvarchar](50) NULL
) ON [PRIMARY]
GO