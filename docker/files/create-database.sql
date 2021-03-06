USE [master]
GO

IF DB_ID('testerum-reports') IS NOT NULL
  set noexec on               -- prevent creation when already exists

CREATE DATABASE [testerum-reports]
GO

USE [testerum-reports];
GO