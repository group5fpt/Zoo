Create Database TheZoo
go
Use TheZoo
go


Create table NhanVien(
	MaNV nchar(7) not null,
	TenNV nvarchar(50) not null,
	NgaySinh date not null,
	GioiTinh bit not null,
	SoDT nchar(15) not null,
	Email nvarchar(MAX) not null,
	VaiTro nvarchar(50) not null,
	Luong float not null,
	Primary key(MaNV)
);
Go


Create table TaiKhoan(
	MaNV nchar(7) not null,
	MatKhau nvarchar(50) not null,
	VaiTro nvarchar(50) not null,
	Email nvarchar(50) not null,
	Primary key(MaNV),
	FOREIGN KEY(MaNV) REFERENCES NhanVien(MaNV) ON DELETE NO ACTION ON UPDATE CASCADE
);
GO

Create table DongVat(
	MaDV nchar(7) not null,
	MaNV nchar(7) not null,
	TenDV nvarchar(50) not null,
	XuatSu nvarchar(50) not null,
	GioiTinhDV bit null,
	DatDiem nvarchar(Max) null,
	SinhThai nvarchar(Max) null,
	SinhSan nvarchar(Max) null,
	TinhTrang nvarchar(Max) null,
	Hinh nvarchar(Max) null,
	PRIMARY KEY(MaDV),
	FOREIGN KEY(MaNV) REFERENCES NhanVien(MaNV) ON DELETE NO ACTION ON UPDATE CASCADE
);
Go


Create table SucKhoe(
	MaDV nchar(7) not null,
	MaNV nchar(7) not null,
	NhietDoCoThe float null,
	NhipTim float null,
	BieuHien nvarchar(50) null,
	NgayKham datetime null,
	SinhSan nvarchar(255) null,
	GhiChu nvarchar(255) null,
	FOREIGN KEY(MaDV) REFERENCES DongVat(MaDV) ON DELETE NO ACTION ON UPDATE CASCADE,
	FOREIGN KEY(MaNV) REFERENCES NhanVien(MaNV)
);
GO

Create table LoiNhuan(
	MaVe int IDENTITY(1,1) NOT NULL,
	KhuVuc nvarchar(50) not null,
	MaNV nchar(7) not null,
	GiaVe float not null,
	LoaiVe bit not null,
	GioXuatVe datetime not null,
	SoLuong int not null,
	Tong float not null,
	GioTaoVe nvarchar(255) not null,
	Primary key (MaVe),
	FOREIGN KEY(MaNV) REFERENCES NhanVien(MaNV) ON DELETE NO ACTION ON UPDATE CASCADE
);
Go

Create table ChiTieu(
	MaCT int IDENTITY(1,1) NOT NULL,
	MaNV nchar(7) not null,
	LoaiCT nvarchar(255) not null,
	MaHD nchar(50) null,
	NgayXuatHD datetime not null,
	NgayNhapHD datetime not null,
	SoTien float not null,
	GhiChu nvarchar(max) not null,
	HinhHD nvarchar(max) not null,
	Primary key(MaCT),
	FOREIGN KEY(MaNV) REFERENCES NhanVien(MaNV) ON DELETE NO ACTION ON UPDATE CASCADE
);
Go