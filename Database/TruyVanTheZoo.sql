--1
Create proc sp_ThuNhap(@KhuVuc nvarchar(255))
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

--2
Create proc sp_ThuNhapTheoNgay(@ngay nvarchar(255))
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



--3
Create proc sp_TongNhanVien
as begin
	Select COUNT(*) as'Nhân Viên' from NhanVien
end

 --4
 Create proc sp_TongDongVat
as begin
	Select COUNT(*) as'Động Vật' from DongVat
end


--5
Create proc sp_TongGioiTinh(@gioiTinh bit)
as begin
	select GioiTinh,count(*) as'Tổng Nhân Viên' from NhanVien where GioiTinh = @gioiTinh group by GioiTinh
end

--6
Create proc sp_TongGioiTinhDV(@gioiTinh bit)
as begin
	select GioiTinhDV,count(*) as'Tổng Động Vật' from DongVat where GioiTinhDV = @gioiTinh group by GioiTinhDV
end

--7
Create proc sp_TongslVaiTro(@VaiTro nvarchar(255))
as begin
	select VaiTro, count(*) as 'Chuc vu' from NhanVien where VaiTro = @VaiTro group by VaiTro
end



--8
Create proc [dbo].[sp_tongTienChiTieu](@Thang int,@nam int)
as begin
	select
	Sum(SoTien) as'Tổng Tiền' 
	from Chitieu 
	where MONTH(NgayNhapHD) = 12 
	and YEAR(NgayNhapHD) = 2020 
end


--9
Create proc [dbo].[sp_ChiTieuTheoThang](@Thang int,@nam int)
as begin
	select LoaiCT,
	COUNT(LoaiCT) as'Số lượng',
	Sum(SoTien) as'Tổng Tiền' 
	from Chitieu 
	where MONTH(NgayNhapHD) = @Thang 
	and YEAR(NgayNhapHD) = @nam 
group by LoaiCT
