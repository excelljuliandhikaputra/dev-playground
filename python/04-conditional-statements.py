print("=== MENU ===")
print("1. Cek Nilai Kelulusan")
print("2. Login Sederhana")
print("3. Kalkulator Grade")

while True:
    pilihan = input("Pilih menu (1/2/3): ")

    if pilihan == "1":
        # Cek Nilai Kelulusan
        nilai = int(input("Masukkan nilai: "))

        if nilai >= 65:
            print("Selamat, kamu lulus!")
        elif nilai >= 50:
            print("Remedial - nilai kurang sedikit")
        else:
            print("Tidak lulus - perlu belajar lebih keras")

    elif pilihan == "2":
        # Login Sederhana
        username = input("Username: ")
        password = input("Password: ")

        if username == "admin" and password == "1234":
            print("Login berhasil! Selamat datang, Admin.")
        elif username != "admin":
            print("Error: Username tidak ditemukan.")
        else:
            print("Error: Password salah.")

    elif pilihan == "3":
        # Kalkulator Grade
        nilai = float(input("Masukkan nilai akhir: "))

        if nilai >= 85:
            grade, bobot = "A", 4.0
        elif nilai >= 80:
            grade, bobot = "AB", 3.5
        elif nilai >= 75:
            grade, bobot = "B", 3.0
        elif nilai >= 70:
            grade, bobot = "BC", 2.5
        elif nilai >= 65:
            grade, bobot = "C", 2.0
        elif nilai >= 50:
            grade, bobot = "D", 1.0
        else:
            grade, bobot = "E", 0.0
        
        print(f"Grade: {grade}")
        print(f"Bobot: {bobot}")
        print(f"Status: {'Lulus' if bobot >= 2.0 else 'Tidak Lulus'}")

    else:
        print("Pilihan tidak valid!")

    ulang = input("Apakah Anda ingin mengulangi? (y/n): ")
    if ulang != "y":
        break