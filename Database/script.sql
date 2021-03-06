USE [master]
GO
/****** Object:  Database [TheZoo]    Script Date: 12/16/2020 8:30:31 PM ******/
CREATE DATABASE [TheZoo]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'TheZoo', FILENAME = N'C:\TheZoo.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'TheZoo_log', FILENAME = N'C:\TheZoo_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [TheZoo] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [TheZoo].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [TheZoo] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [TheZoo] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [TheZoo] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [TheZoo] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [TheZoo] SET ARITHABORT OFF 
GO
ALTER DATABASE [TheZoo] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [TheZoo] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [TheZoo] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [TheZoo] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [TheZoo] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [TheZoo] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [TheZoo] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [TheZoo] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [TheZoo] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [TheZoo] SET  DISABLE_BROKER 
GO
ALTER DATABASE [TheZoo] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [TheZoo] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [TheZoo] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [TheZoo] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [TheZoo] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [TheZoo] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [TheZoo] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [TheZoo] SET RECOVERY FULL 
GO
ALTER DATABASE [TheZoo] SET  MULTI_USER 
GO
ALTER DATABASE [TheZoo] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [TheZoo] SET DB_CHAINING OFF 
GO
ALTER DATABASE [TheZoo] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [TheZoo] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [TheZoo] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'TheZoo', N'ON'
GO
ALTER DATABASE [TheZoo] SET QUERY_STORE = OFF
GO
USE [TheZoo]
GO
ALTER DATABASE SCOPED CONFIGURATION SET IDENTITY_CACHE = ON;
GO
ALTER DATABASE SCOPED CONFIGURATION SET LEGACY_CARDINALITY_ESTIMATION = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET LEGACY_CARDINALITY_ESTIMATION = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET MAXDOP = 0;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET MAXDOP = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET PARAMETER_SNIFFING = ON;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET PARAMETER_SNIFFING = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET QUERY_OPTIMIZER_HOTFIXES = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET QUERY_OPTIMIZER_HOTFIXES = PRIMARY;
GO
USE [TheZoo]
GO
/****** Object:  Table [dbo].[ChiTieu]    Script Date: 12/16/2020 8:30:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTieu](
	[MaCT] [int] IDENTITY(1,1) NOT NULL,
	[MaNV] [nchar](7) NOT NULL,
	[LoaiCT] [nvarchar](255) NOT NULL,
	[MaHD] [nchar](50) NULL,
	[NgayXuatHD] [datetime] NOT NULL,
	[NgayNhapHD] [datetime] NOT NULL,
	[SoTien] [float] NOT NULL,
	[GhiChu] [nvarchar](max) NOT NULL,
	[HinhHD] [nvarchar](max) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaCT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DongVat]    Script Date: 12/16/2020 8:30:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DongVat](
	[MaDV] [nchar](7) NOT NULL,
	[MaNV] [nchar](7) NOT NULL,
	[TenDV] [nvarchar](50) NOT NULL,
	[XuatSu] [nvarchar](50) NOT NULL,
	[GioiTinhDV] [bit] NULL,
	[DatDiem] [nvarchar](max) NULL,
	[SinhThai] [nvarchar](max) NULL,
	[SinhSan] [nvarchar](max) NULL,
	[TinhTrang] [nvarchar](max) NULL,
	[Hinh] [nvarchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaDV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoiNhuan]    Script Date: 12/16/2020 8:30:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoiNhuan](
	[MaVe] [int] IDENTITY(1,1) NOT NULL,
	[KhuVuc] [nvarchar](50) NOT NULL,
	[MaNV] [nchar](7) NOT NULL,
	[GiaVe] [float] NOT NULL,
	[LoaiVe] [bit] NOT NULL,
	[GioXuatVe] [date] NOT NULL,
	[SoLuong] [int] NOT NULL,
	[Tong] [float] NOT NULL,
	[GioTaoVe] [nvarchar](255) NOT NULL,
 CONSTRAINT [PK__LoiNhuan__2725100F4D4B2827] PRIMARY KEY CLUSTERED 
(
	[MaVe] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 12/16/2020 8:30:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNV] [nchar](7) NOT NULL,
	[TenNV] [nvarchar](50) NOT NULL,
	[NgaySinh] [date] NOT NULL,
	[GioiTinh] [bit] NOT NULL,
	[SoDT] [nchar](15) NOT NULL,
	[Email] [nvarchar](max) NOT NULL,
	[VaiTro] [nvarchar](50) NOT NULL,
	[Luong] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SucKhoe]    Script Date: 12/16/2020 8:30:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SucKhoe](
	[MaDV] [nchar](7) NOT NULL,
	[MaNV] [nchar](7) NOT NULL,
	[NhietDoCoThe] [float] NULL,
	[NhipTim] [float] NULL,
	[BieuHien] [nvarchar](50) NULL,
	[NgayKham] [datetime] NULL,
	[SinhSan] [nvarchar](255) NULL,
	[GhiChu] [nvarchar](255) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 12/16/2020 8:30:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[MaNV] [nchar](7) NOT NULL,
	[MatKhau] [nvarchar](50) NOT NULL,
	[VaiTro] [nvarchar](50) NOT NULL,
	[Email] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[ChiTieu] ON 

INSERT [dbo].[ChiTieu] ([MaCT], [MaNV], [LoaiCT], [MaHD], [NgayXuatHD], [NgayNhapHD], [SoTien], [GhiChu], [HinhHD]) VALUES (2, N'nv01   ', N'tiền điện', N'hd0123456789                                      ', CAST(N'2020-11-23T00:00:00.000' AS DateTime), CAST(N'2020-12-15T00:27:03.707' AS DateTime), 40000, N'', N'5ea38b2d-9cee-4fe9-80e9-ad68f705a033.jpg')
INSERT [dbo].[ChiTieu] ([MaCT], [MaNV], [LoaiCT], [MaHD], [NgayXuatHD], [NgayNhapHD], [SoTien], [GhiChu], [HinhHD]) VALUES (3, N'nv01   ', N'tiền nước', N'TC123456789                                       ', CAST(N'2020-11-25T00:00:00.000' AS DateTime), CAST(N'2020-12-15T00:31:29.070' AS DateTime), 6000000, N'', N'8c8hoadon4.png')
INSERT [dbo].[ChiTieu] ([MaCT], [MaNV], [LoaiCT], [MaHD], [NgayXuatHD], [NgayNhapHD], [SoTien], [GhiChu], [HinhHD]) VALUES (4, N'nv01   ', N'Thức ăn động vật', N'TA123456987                                       ', CAST(N'2020-11-25T00:00:00.000' AS DateTime), CAST(N'2020-12-15T00:33:23.327' AS DateTime), 15000000, N'5000000 thịt heo cho hổ.
5000000 thức ăn cho heo
2500000 thức ăn cho chim
2500000 thức cá sâu', N'images.jpg')
INSERT [dbo].[ChiTieu] ([MaCT], [MaNV], [LoaiCT], [MaHD], [NgayXuatHD], [NgayNhapHD], [SoTien], [GhiChu], [HinhHD]) VALUES (5, N'nv01   ', N'Thức ăn động vật', N'TA01236635                                        ', CAST(N'2020-10-11T00:00:00.000' AS DateTime), CAST(N'2020-12-15T00:45:15.987' AS DateTime), 6300000, N'', N'hdsd_nhieu_trang_1.png')
INSERT [dbo].[ChiTieu] ([MaCT], [MaNV], [LoaiCT], [MaHD], [NgayXuatHD], [NgayNhapHD], [SoTien], [GhiChu], [HinhHD]) VALUES (6, N'nv01   ', N'Thức ăn động vật', N'TA0222589                                         ', CAST(N'2020-11-18T00:00:00.000' AS DateTime), CAST(N'2020-12-15T00:45:54.020' AS DateTime), 500000, N'', N'39b5d2903344d11a8855.jpg')
SET IDENTITY_INSERT [dbo].[ChiTieu] OFF
INSERT [dbo].[DongVat] ([MaDV], [MaNV], [TenDV], [XuatSu], [GioiTinhDV], [DatDiem], [SinhThai], [SinhSan], [TinhTrang], [Hinh]) VALUES (N'ĐV01   ', N'nv01   ', N'Kỳ Nhông Xanh ', N'Trung và Nam Mỹ.', 0, N'-Hình dạng giống kỳ đà, thường có màu xanh. Có gai lưng từ sau gảy xuống cuối đuôi, có yếm ở hàm dưới.', N'-Rừng nguyên sinh, thứ sinh
 Thức ăn:  côn trùng, rau, quả chin mềm…', N'Trưởng thành vào năm thứ 3, đẻ từ 20-30 trứng, sau 3 tháng trứng nở.', N'Được xếp vào phụ lục II Công ước Cites.
', N'Picture1.png')
INSERT [dbo].[DongVat] ([MaDV], [MaNV], [TenDV], [XuatSu], [GioiTinhDV], [DatDiem], [SinhThai], [SinhSan], [TinhTrang], [Hinh]) VALUES (N'Đv02   ', N'nv01   ', N'Vượn Cáo', N'Chỉ có ở Madagasca.', 1, N'Cân nặng từ 2,3 đến 3,5kg. Có đuôi dài hơn thân, có các vòng đen và trắng xen kẻ nhau.', N'-Sống ở rừng ven song đến các vùng rừng cây bụi.
 Thức ăn:  Là loại ăn tạp.', N'Mang thay từ 4 đến 4,5 tháng. Mỗi lần sinh từ 1 đến 2 con.', N'', N'Picture2.png')
SET IDENTITY_INSERT [dbo].[LoiNhuan] ON 

INSERT [dbo].[LoiNhuan] ([MaVe], [KhuVuc], [MaNV], [GiaVe], [LoaiVe], [GioXuatVe], [SoLuong], [Tong], [GioTaoVe]) VALUES (1, N'Ve Vao Cong', N'nv02   ', 30000, 1, CAST(N'2020-12-14' AS Date), 2, 60000, N'14-12-2020 04-52-32 PM')
INSERT [dbo].[LoiNhuan] ([MaVe], [KhuVuc], [MaNV], [GiaVe], [LoaiVe], [GioXuatVe], [SoLuong], [Tong], [GioTaoVe]) VALUES (2, N'Ve Vao Cong', N'nv02   ', 50000, 0, CAST(N'2020-12-14' AS Date), 3, 90000, N'14-12-2020 04-52-35 PM')
INSERT [dbo].[LoiNhuan] ([MaVe], [KhuVuc], [MaNV], [GiaVe], [LoaiVe], [GioXuatVe], [SoLuong], [Tong], [GioTaoVe]) VALUES (3, N'Ve Vao Cong', N'nv02   ', 30000, 1, CAST(N'2020-12-14' AS Date), 2, 60000, N'14-12-2020 04-54-17 PM')
INSERT [dbo].[LoiNhuan] ([MaVe], [KhuVuc], [MaNV], [GiaVe], [LoaiVe], [GioXuatVe], [SoLuong], [Tong], [GioTaoVe]) VALUES (4, N'Ve Vao Cong', N'nv02   ', 50000, 0, CAST(N'2020-12-14' AS Date), 3, 150000, N'14-12-2020 04-54-25 PM')
INSERT [dbo].[LoiNhuan] ([MaVe], [KhuVuc], [MaNV], [GiaVe], [LoaiVe], [GioXuatVe], [SoLuong], [Tong], [GioTaoVe]) VALUES (5, N'Ve Tro Choi', N'nv02   ', 30000, 1, CAST(N'2020-12-14' AS Date), 4, 120000, N'14-12-2020 04-54-29 PM')
INSERT [dbo].[LoiNhuan] ([MaVe], [KhuVuc], [MaNV], [GiaVe], [LoaiVe], [GioXuatVe], [SoLuong], [Tong], [GioTaoVe]) VALUES (6, N'Ve Tro Choi', N'nv02   ', 50000, 0, CAST(N'2020-12-14' AS Date), 6, 300000, N'14-12-2020 04-54-34 PM')
INSERT [dbo].[LoiNhuan] ([MaVe], [KhuVuc], [MaNV], [GiaVe], [LoaiVe], [GioXuatVe], [SoLuong], [Tong], [GioTaoVe]) VALUES (7, N'Ve Tro Choi', N'nv02   ', 30000, 1, CAST(N'2020-12-14' AS Date), 2, 60000, N'14-12-2020 04-54-38 PM')
INSERT [dbo].[LoiNhuan] ([MaVe], [KhuVuc], [MaNV], [GiaVe], [LoaiVe], [GioXuatVe], [SoLuong], [Tong], [GioTaoVe]) VALUES (8, N'Ve Vao Cong', N'nv02   ', 50000, 0, CAST(N'2020-12-14' AS Date), 4, 120000, N'14-12-2020 04-54-46 PM')
INSERT [dbo].[LoiNhuan] ([MaVe], [KhuVuc], [MaNV], [GiaVe], [LoaiVe], [GioXuatVe], [SoLuong], [Tong], [GioTaoVe]) VALUES (1006, N'Ve Vao Cong', N'nv02   ', 50000, 0, CAST(N'2020-12-14' AS Date), 4, 120000, N'14-12-2020 04-54-46 PM')
INSERT [dbo].[LoiNhuan] ([MaVe], [KhuVuc], [MaNV], [GiaVe], [LoaiVe], [GioXuatVe], [SoLuong], [Tong], [GioTaoVe]) VALUES (1011, N'Ve Vao Cong', N'nv02   ', 30000, 1, CAST(N'2020-12-14' AS Date), 1, 30000, N'13-12-2020')
INSERT [dbo].[LoiNhuan] ([MaVe], [KhuVuc], [MaNV], [GiaVe], [LoaiVe], [GioXuatVe], [SoLuong], [Tong], [GioTaoVe]) VALUES (1012, N'Ve Vao Cong', N'nv02   ', 30000, 1, CAST(N'2020-12-16' AS Date), 2, 60000, N'16-12-2020 10-38-24 AM')
INSERT [dbo].[LoiNhuan] ([MaVe], [KhuVuc], [MaNV], [GiaVe], [LoaiVe], [GioXuatVe], [SoLuong], [Tong], [GioTaoVe]) VALUES (1013, N'Ve Vao Cong', N'nv02   ', 30000, 1, CAST(N'2020-12-16' AS Date), 3, 90000, N'16-12-2020 10-38-27 AM')
SET IDENTITY_INSERT [dbo].[LoiNhuan] OFF
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [NgaySinh], [GioiTinh], [SoDT], [Email], [VaiTro], [Luong]) VALUES (N'NV01   ', N'Nguyễn Hoàng Vinh', CAST(N'2001-01-23' AS Date), 1, N'0979486437     ', N'catbui23122001@gmail.com', N'Quản lý', 10000000)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [NgaySinh], [GioiTinh], [SoDT], [Email], [VaiTro], [Luong]) VALUES (N'NV02   ', N'Đỗ Cao Huy', CAST(N'2001-01-07' AS Date), 1, N'0949173572     ', N'dohuy4455@gmail.com', N'NV bán vé', 6000000)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [NgaySinh], [GioiTinh], [SoDT], [Email], [VaiTro], [Luong]) VALUES (N'NV03   ', N'Nguyễn Thị Kim Khánh', CAST(N'2001-01-31' AS Date), 0, N'0123456789     ', N'kimkhanh@gmail.com', N'NV Chăm sóc', 9000000)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [NgaySinh], [GioiTinh], [SoDT], [Email], [VaiTro], [Luong]) VALUES (N'nv04   ', N'Nguyễn Thị Hoàng Vinh', CAST(N'2001-01-23' AS Date), 0, N'09000009       ', N'hoangvinh2312@fpt.edu.vn', N'NV Chăm sóc', 2300000)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [NgaySinh], [GioiTinh], [SoDT], [Email], [VaiTro], [Luong]) VALUES (N'NV3    ', N'nguyen thi nhan vien ba', CAST(N'2001-01-31' AS Date), 1, N'01263870646    ', N'kimkhanh3101@gmail.com', N'NV Chăm sóc', 250000)
INSERT [dbo].[TaiKhoan] ([MaNV], [MatKhau], [VaiTro], [Email]) VALUES (N'nv01   ', N'3101', N'Quản lý', N'bankhanh3101@gmail.com')
INSERT [dbo].[TaiKhoan] ([MaNV], [MatKhau], [VaiTro], [Email]) VALUES (N'nv02   ', N'123', N'NV bán vé', N'khanhntkps12193@fpt.edu.vn')
INSERT [dbo].[TaiKhoan] ([MaNV], [MatKhau], [VaiTro], [Email]) VALUES (N'nv03   ', N'123', N'NV Chăm sóc', N'kimkhanh@gmail.com')
ALTER TABLE [dbo].[ChiTieu]  WITH CHECK ADD FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[DongVat]  WITH CHECK ADD FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[LoiNhuan]  WITH CHECK ADD  CONSTRAINT [FK__LoiNhuan__MaNV__4222D4EF] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[LoiNhuan] CHECK CONSTRAINT [FK__LoiNhuan__MaNV__4222D4EF]
GO
ALTER TABLE [dbo].[SucKhoe]  WITH CHECK ADD FOREIGN KEY([MaDV])
REFERENCES [dbo].[DongVat] ([MaDV])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[SucKhoe]  WITH CHECK ADD FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
ON UPDATE CASCADE
GO
/****** Object:  StoredProcedure [dbo].[sp_ChiTieuTheoThang]    Script Date: 12/16/2020 8:30:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create proc [dbo].[sp_ChiTieuTheoThang](@Thang int,@nam int)
as begin
	select LoaiCT,
	COUNT(LoaiCT) as'Số lượng',
	Sum(SoTien) as'Tổng Tiền' 
	from Chitieu 
	where MONTH(NgayNhapHD) = @Thang 
	and YEAR(NgayNhapHD) = @nam 
group by LoaiCT
end
GO
/****** Object:  StoredProcedure [dbo].[sp_ThuNhap]    Script Date: 12/16/2020 8:30:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create proc [dbo].[sp_ThuNhap](@KhuVuc nvarchar(255))
as begin
	select
		KhuVuc,
		GiaVe,
		LoaiVe,
		sum(SoLuong) as "Số Lượng",
		Sum(Tong) as"Tổng tiền"
		from LoiNhuan 
	where KhuVuc = @KhuVuc
	group By KhuVuc,GiaVe,LoaiVe
end
GO
/****** Object:  StoredProcedure [dbo].[sp_ThuNhapTheoNgay]    Script Date: 12/16/2020 8:30:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[sp_ThuNhapTheoNgay](@ngay nvarchar(255))
as begin
	select
		KhuVuc,
		sum(SoLuong) as "Số Lượng",
		Sum(Tong) as"Tổng tiền",
		GioXuatVe
		from LoiNhuan 
		where GioTaoVe like @ngay
	group By KhuVuc,GioXuatVe
end
GO
/****** Object:  StoredProcedure [dbo].[sp_TongDongVat]    Script Date: 12/16/2020 8:30:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
 Create proc [dbo].[sp_TongDongVat]
as begin
	Select COUNT(*) as'Động Vật' from DongVat
end
GO
/****** Object:  StoredProcedure [dbo].[sp_TongGioiTinh]    Script Date: 12/16/2020 8:30:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create proc [dbo].[sp_TongGioiTinh](@gioiTinh bit)
as begin
	select GioiTinh,count(*) as'Tổng Nhân Viên' from NhanVien where GioiTinh = @gioiTinh group by GioiTinh
end
GO
/****** Object:  StoredProcedure [dbo].[sp_TongGioiTinhDV]    Script Date: 12/16/2020 8:30:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create proc [dbo].[sp_TongGioiTinhDV](@gioiTinh bit)
as begin
	select GioiTinhDV,count(*) as'Tổng Động Vật' from DongVat where GioiTinhDV = @gioiTinh group by GioiTinhDV
end
GO
/****** Object:  StoredProcedure [dbo].[sp_TongNhanVien]    Script Date: 12/16/2020 8:30:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create proc [dbo].[sp_TongNhanVien]
as begin
	Select COUNT(*) as'Nhân Viên' from NhanVien
end
GO
/****** Object:  StoredProcedure [dbo].[sp_TongslVaiTro]    Script Date: 12/16/2020 8:30:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create proc [dbo].[sp_TongslVaiTro](@VaiTro nvarchar(255))
as begin
	select VaiTro, count(*) as 'Chuc vu' from NhanVien where VaiTro = @VaiTro group by VaiTro
end
GO
/****** Object:  StoredProcedure [dbo].[sp_tongTienChiTieu]    Script Date: 12/16/2020 8:30:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create proc [dbo].[sp_tongTienChiTieu](@Thang int,@nam int)
as begin
	select
	Sum(SoTien) as'Tổng Tiền' 
	from Chitieu 
	where MONTH(NgayNhapHD) = 12 
	and YEAR(NgayNhapHD) = 2020 
end
GO
USE [master]
GO
ALTER DATABASE [TheZoo] SET  READ_WRITE 
GO
