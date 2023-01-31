USE [tempdb]
GO

/****** Object:  Table [dbo].[Students_Courses]    Script Date: 1/31/2023 9:21:15 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Students_Courses](
	[student_id] [int] NOT NULL,
	[course_id] [int] NOT NULL
) ON [PRIMARY]
GO