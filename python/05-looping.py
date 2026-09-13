print("=== MENU ===")
print("1. Fizzbuzz")
print("2. Tabel Perkalian")
print("3. Sensor Mahasiswa Aktif")

while True:
    pilihan = input("Pilih menu (1/2/3/): ")

    if pilihan == "1":
        # Fizzbuzz
        angkaMulai = int(input("Masukkan angka mulai: "))
        angkaSelesai = int(input("Masukkan angka selesi"))

        for i in range(angkaMulai, angkaSelesai):
            if i % 3 == 0 and i % 5 == 0:
                print("FizzBuzz")
            elif i % 3 == 0:
                print("Fizz")
            elif i % 5 == 0:
                print("Buzz")
            else:
                print(i)

    elif pilihan == "2":
        # Tabel Perkalian
        angka = int(input("Masukkan angka untuk tabel perkalian: "))
        print(f"Tabel Perkalian {angka}:")
        for i in range(1, 11):
            hasil = angka * i
            print(f"{angka} x {i} = {hasil}")

    elif pilihan == "3":
        # Sensor Mahasiswa Aktif
        print("=== Sensor Mahasiswa Aktif ===")
        print("Masukkan jumlah kehadiran mahasiswa untuk menentukan status aktif atau tidak.")
        print("Input angka 1 untuk hadir, 0 untuk tidak hadir.")
        print("Contoh input: 1,1,1,0,0,1,1,0,1 (tanpa spasi)")

        kehadiran = input("Masukkan jumlah kehadiran mahasiswa: ")
        kehadiran = kehadiran.split(",")
        kehadiran = [int(x) for x in kehadiran]
        total_hadir = 0

        for status in kehadiran:
            if status == 1:
                total_hadir += 1

        total_pertemuan = len(kehadiran)
        persentase_hadir = (total_hadir / total_pertemuan) * 100

        print(f"Hadir: {total_hadir} dari {total_pertemuan} pertemuan ({persentase_hadir:.2f}%)")

        if persentase_hadir < 75:
            print("PERINGATAN: Kehadiran di bawah syarat minimum 75% - Mahasiswa tidak aktif")
        else:
            print("Mahasiswa aktif - Kehadiran memenuhi syarat minimum 75%")

    else: 
        print("Pilihan tidak valid!")

    ulang = input("Apakah Anda ingin mengulangi? (y/n): ")
    if ulang != "y":
        break