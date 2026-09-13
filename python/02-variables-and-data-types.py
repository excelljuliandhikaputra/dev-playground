nama = "Excell"
nama_lengkap = "Excell Juliandhika Putra"
umur = 20
tahun_sekarang = 2026
ipk_target = 3.8
sudah_kuliah = False
tahun_lulus = tahun_sekarang + 4
umur_lulus = umur + 4
tahun_pensiun = tahun_sekarang + (60 - umur)


print(f"Nama: {nama}")
print(f"Umur: {umur} tahun")
print(f"Target IPK: {ipk_target}")
print(f"Sudah kuliah: {sudah_kuliah}")
print(f"Lulus kuliah tahun: {tahun_lulus}")
print(f"Umur saat lulus: {umur_lulus} tahun")
print(f"Pensiun tahun: {tahun_pensiun}")

print(nama_lengkap.upper())
print(nama_lengkap.lower())
print(f"Panjang nama: {len(nama_lengkap)} karakter")
print(f"Nama dibalik: {nama_lengkap[::-1]}")