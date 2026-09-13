# List
mata_kuliah = ["Algoritma", "Matematika Diskrit", "Bahasa Inggris", "Pancasila"]

print(f"Mata kuliah pertama: {mata_kuliah[0]}")
print(f"Mata kuliah terakhir: {mata_kuliah[-1]}")
print(f"Jumlah mata kuliah: {len(mata_kuliah)}")

# Dictionary
kontak = {
    "Ibu": "081234567890",
    "Ayah": "081987654321",
    "Kakak": "081122334455"
}

kontak["Adik"] = "081223344556"

for nama, nomor in kontak.items():
    print(f"{nama}: {nomor}")

# Tuple
koordinat = (67, 212)
print(f"Koordinat X: {koordinat[0]}")
print(f"Koordinat Y: {koordinat[1]}")