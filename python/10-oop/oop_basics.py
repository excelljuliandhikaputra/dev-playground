"""
Topic 10 - Object-Oriented Programming (OOP)
Topik 10 - Pemrograman Berorientasi Objek (OOP)
================================================
EN: Topics covered in this lesson file.
ID: Topik yang dibahas di file ini.

    1. Why classes?                         | Kenapa butuh class?
    2. class, __init__ and self             | class, __init__ dan self
    3. Methods                              | Method
    4. __str__: printing an object nicely   | __str__: mencetak objek dengan rapi
    5. Many objects, list of objects        | Banyak objek, list berisi objek
    6. Class vs instance attribute          | Atribut class vs atribut instance
    7. "_protected" attributes and rules    | Atribut "_protected" dan aturannya
    8. Inheritance and super()              | Pewarisan (inheritance) dan super()
    9. Method overriding                    | Menimpa method (overriding)
   10. Common mistakes, Python vs Java      | Kesalahan umum, Python vs Java

Run this file:  python oop_basics.py
"""


# ---------------------------------------------------------------------------
# 1. Why classes?
# EN: Until now, a "thing" with several values was stored in a dict.
#     It works, but the data and the actions on it live apart, and a typo
#     like book["page_read"] quietly creates a NEW key instead of an error.
#     A CLASS is a blueprint that keeps the data (ATTRIBUTES) and the
#     actions (METHODS) together. Every OBJECT made from the blueprint has
#     its own data.  class = the blueprint "Book",  object = one real book.
# ID: Sampai sekarang, "benda" dengan beberapa nilai disimpan di dict.
#     Itu bisa, tapi data dan aksinya terpisah, dan salah ketik seperti
#     book["page_read"] diam-diam membuat key BARU, bukan error.
#     CLASS adalah cetakan (blueprint) yang menyatukan data (ATRIBUT) dan
#     aksi (METHOD). Setiap OBJEK yang dibuat dari cetakan itu punya datanya
#     sendiri.  class = cetakan "Book",  objek = satu buku yang nyata.
# ---------------------------------------------------------------------------
book_dict = {"title": "Python Basics", "pages": 200, "pages_read": 0}
book_dict["pages_read"] += 50
print(f"{book_dict['title']}: {book_dict['pages_read']}/{book_dict['pages']}")
# Python Basics: 50/200


# ---------------------------------------------------------------------------
# 2. class, __init__ and self
# EN: - Class names use PascalCase: Book, BankAccount (same as Java).
#     - __init__ runs AUTOMATICALLY when you create an object. It sets the
#       starting attributes. (Two underscores on each side.)
#     - self means "this object". Python passes it for you: you write it in
#       the def line, but NOT when you call. (Java calls it `this`.)
#     - self.title = title  ->  "store the parameter title inside this object"
# ID: - Nama class memakai PascalCase: Book, BankAccount (sama seperti Java).
#     - __init__ jalan OTOMATIS saat objek dibuat. Tugasnya mengisi atribut
#       awal. (Dua garis bawah di kiri dan kanan.)
#     - self artinya "objek ini". Python mengisinya sendiri: ditulis di baris
#       def, tapi TIDAK ditulis saat memanggil. (Di Java namanya `this`.)
#     - self.title = title  ->  "simpan parameter title di dalam objek ini"
# ---------------------------------------------------------------------------
class Book:
    def __init__(self, title, pages):
        self.title = title          # attribute from a parameter / atribut dari parameter
        self.pages = pages
        self.pages_read = 0         # every new book starts at 0 / setiap buku baru mulai dari 0


my_book = Book("Python Basics", 200)    # create an object / membuat objek
print(my_book.title)                    # Python Basics
print(my_book.pages)                    # 200
print(my_book.pages_read)               # 0

my_book.pages_read = 30                 # attributes can be changed / atribut bisa diubah
print(my_book.pages_read)               # 30


# ---------------------------------------------------------------------------
# 3. Methods
# EN: A method is a function inside a class. Its first parameter is always
#     self, so it can read and change the object's attributes.
#     A method can call another method of the same object: self.progress()
#     (Here we write Book again with methods. In a real program you write
#      a class only once.)
# ID: Method adalah fungsi di dalam class. Parameter pertamanya selalu self,
#     jadi method bisa membaca dan mengubah atribut objeknya.
#     Method boleh memanggil method lain dari objek yang sama: self.progress()
#     (Di sini Book ditulis ulang beserta method-nya. Di program sungguhan,
#      sebuah class cukup ditulis sekali.)
# ---------------------------------------------------------------------------
class Book:
    def __init__(self, title, pages):
        self.title = title
        self.pages = pages
        self.pages_read = 0

    def read(self, amount):
        """
        EN: Read some pages, but never past the last page.
        ID: Membaca beberapa halaman, tapi tidak melewati halaman terakhir.
        """
        self.pages_read += amount
        if self.pages_read > self.pages:
            self.pages_read = self.pages

    def progress(self):
        """EN: Percent already read. / ID: Persen yang sudah dibaca."""
        return self.pages_read / self.pages * 100

    def is_finished(self):
        return self.progress() == 100


my_book = Book("Python Basics", 200)
my_book.read(50)                        # self = my_book, amount = 50
print(my_book.pages_read)               # 50
print(f"{my_book.progress():.1f}%")     # 25.0%
print(my_book.is_finished())            # False
my_book.read(500)
print(my_book.pages_read)               # 200
print(my_book.is_finished())            # True


# ---------------------------------------------------------------------------
# 4. __str__: printing an object nicely
# EN: print(object) normally shows something like
#     <__main__.Product object at 0x7f...>, which is not helpful.
#     Define __str__ and RETURN the text you want to see. print() and str()
#     use it automatically.
# ID: print(objek) biasanya menampilkan sesuatu seperti
#     <__main__.Product object at 0x7f...>, yang tidak membantu.
#     Buat method __str__ yang me-RETURN teks yang ingin ditampilkan.
#     print() dan str() memakainya secara otomatis.
# ---------------------------------------------------------------------------
class Product:
    def __init__(self, name, price):
        self.name = name
        self.price = price

    def __str__(self):
        return f"{self.name}: Rp {self.price}"


notebook = Product("Notebook", 15000)
print(notebook)                         # Notebook: Rp 15000
label = str(notebook)
print(label.upper())                    # NOTEBOOK: RP 15000


# ---------------------------------------------------------------------------
# 5. Many objects, list of objects
# EN: Every object keeps its OWN attributes. Objects can be stored in a
#     list and processed with a loop, just like numbers or dicts.
# ID: Setiap objek menyimpan atributnya SENDIRI. Objek bisa disimpan di
#     list lalu diolah dengan loop, sama seperti angka atau dict.
# ---------------------------------------------------------------------------
pen = Product("Pen", 5000)
bag = Product("Backpack", 120000)
print(pen.price, bag.price)             # 5000 120000 (separate data / data terpisah)

cart = [notebook, pen, bag]
total = 0
cheapest = cart[0]
for item in cart:
    print(f"- {item}")
    total += item.price
    if item.price < cheapest.price:
        cheapest = item
# - Notebook: Rp 15000
# - Pen: Rp 5000
# - Backpack: Rp 120000
print(f"Total: Rp {total}")             # Total: Rp 140000
print(f"Cheapest: {cheapest.name}")     # Cheapest: Pen


# ---------------------------------------------------------------------------
# 6. Class attribute vs instance attribute
# EN: An INSTANCE attribute (self.name) belongs to ONE object.
#     A CLASS attribute is written directly inside the class (not in a
#     method) and is SHARED by all objects. Change it through the class
#     name: LibraryCard.cards_made += 1
# ID: Atribut INSTANCE (self.name) milik SATU objek saja.
#     Atribut CLASS ditulis langsung di dalam class (bukan di method) dan
#     DIPAKAI BERSAMA oleh semua objek. Ubah lewat nama class-nya:
#     LibraryCard.cards_made += 1
# ---------------------------------------------------------------------------
class LibraryCard:
    campus = "UNAIR"        # class attribute: the same for every card / sama untuk semua kartu
    cards_made = 0          # class attribute used as a counter / dipakai sebagai penghitung

    def __init__(self, owner):
        self.owner = owner                  # instance attribute / atribut instance
        LibraryCard.cards_made += 1


card_a = LibraryCard("Excell")
card_b = LibraryCard("Ani")
print(card_a.owner, card_b.owner)       # Excell Ani
print(card_a.campus, card_b.campus)     # UNAIR UNAIR
print(LibraryCard.cards_made)           # 2

# self.cards_made += 1    -> WRONG inside __init__: it makes a NEW instance attribute
#                            on that one object, and LibraryCard.cards_made stays 0
#                            SALAH: membuat atribut instance BARU di objek itu saja,
#                            dan LibraryCard.cards_made tetap 0


# ---------------------------------------------------------------------------
# 7. "_protected" attributes and rules
# EN: Some data should only change by following rules (no negative balance).
#     Python has no `private` keyword. Instead, a name that starts with ONE
#     underscore, like _balance, means: "please don't touch this from outside
#     the class; use the methods". Methods check the rules and can return
#     True/False to say whether the action was accepted.
# ID: Ada data yang hanya boleh berubah sesuai aturan (saldo tidak boleh minus).
#     Python tidak punya kata kunci `private`. Sebagai gantinya, nama yang
#     diawali SATU garis bawah, seperti _balance, artinya: "tolong jangan
#     diubah dari luar class; pakai method-nya". Method mengecek aturan dan
#     bisa mengembalikan True/False sebagai tanda aksinya diterima atau tidak.
# ---------------------------------------------------------------------------
class Wallet:
    def __init__(self, owner):
        self.owner = owner
        self._balance = 0

    def get_balance(self):
        return self._balance

    def top_up(self, amount):
        if amount < 10000:              # minimum top-up / minimal isi saldo
            return False
        self._balance += amount
        return True

    def pay(self, amount):
        if amount > self._balance:      # not enough money / saldo tidak cukup
            return False
        self._balance -= amount
        return True


wallet = Wallet("Excell")
print(wallet.top_up(5000))              # False (below the minimum / di bawah minimal)
print(wallet.top_up(50000))             # True
print(wallet.pay(70000))                # False (not enough / tidak cukup)
print(wallet.pay(20000))                # True
print(wallet.get_balance())             # 30000

# wallet._balance = 1000000   -> Python allows it, but it breaks the rules on purpose.
#                                Python membolehkan, tapi itu sengaja melanggar aturan.


# ---------------------------------------------------------------------------
# 8. Inheritance and super()
# EN: A CHILD class can inherit everything from a PARENT class and add more:
#         class StudentMember(Member):
#     The child's __init__ calls super().__init__(...) so the parent sets up
#     its own attributes first, then the child adds its extra ones.
#     "A StudentMember IS A Member" -> good sign that inheritance fits.
# ID: Class ANAK bisa mewarisi semua isi class INDUK lalu menambah sendiri:
#         class StudentMember(Member):
#     __init__ milik anak memanggil super().__init__(...) supaya induk mengisi
#     atributnya dulu, baru anak menambah atribut tambahannya.
#     "StudentMember ADALAH Member" -> tanda bahwa inheritance cocok dipakai.
# ---------------------------------------------------------------------------
class Member:
    def __init__(self, name):
        self.name = name

    def borrow_limit(self):
        return 2

    def describe(self):
        return f"{self.name} can borrow {self.borrow_limit()} books"


class StudentMember(Member):
    def __init__(self, name, faculty):
        super().__init__(name)          # parent sets self.name / induk mengisi self.name
        self.faculty = faculty          # extra attribute / atribut tambahan


guest = Member("Budi")
student = StudentMember("Excell", "Vocational Studies")
print(student.name)                     # Excell  (set by the parent / diisi oleh induk)
print(student.faculty)                  # Vocational Studies
print(student.describe())               # Excell can borrow 2 books (inherited / diwarisi)


# ---------------------------------------------------------------------------
# 9. Method overriding
# EN: A child can write a method with the SAME NAME as the parent's. The
#     child's version replaces (overrides) it for objects of that child.
#     super().method() still lets you use the parent's version inside it.
#     Because the parent's describe() calls self.borrow_limit(), every
#     object automatically uses ITS OWN version. One loop, different results.
# ID: Anak boleh menulis method dengan NAMA YANG SAMA seperti milik induk.
#     Versi anak menggantikan (override) versi induk untuk objek anak itu.
#     super().method() tetap bisa dipakai untuk memanggil versi induk.
#     Karena describe() milik induk memanggil self.borrow_limit(), setiap objek
#     otomatis memakai versinya SENDIRI. Satu loop, hasilnya berbeda-beda.
# ---------------------------------------------------------------------------
class StaffMember(Member):
    def __init__(self, name, department):
        super().__init__(name)
        self.department = department

    def borrow_limit(self):             # overrides Member.borrow_limit
        return 5

    def describe(self):                 # overrides, but reuses the parent's text
        return super().describe() + f" ({self.department})"


class FreshmanMember(StudentMember):
    def borrow_limit(self):
        return 3


members = [guest, StaffMember("Sari", "Library"), FreshmanMember("Ani", "Science")]
for member in members:
    print(member.describe())
# Budi can borrow 2 books
# Sari can borrow 5 books (Library)
# Ani can borrow 3 books


# ---------------------------------------------------------------------------
# 10. Common mistakes, Python vs Java
# EN: The lines below are commented out because they are wrong.
# ID: Baris di bawah dijadikan komentar karena salah.
#
# def read(amount):            -> forgot self / lupa self:
#                                 TypeError: Book.read() takes 1 positional argument but 2 were given
#
# def __int__(self, title):    -> typo: __int__ instead of __init__ / salah ketik __int__
#                                 TypeError: Book() takes no arguments
#
# def __init__(self, title):
#     title = title            -> forgot self. : the value disappears when __init__ ends
#                                 lupa self. : nilainya hilang saat __init__ selesai
#
# print(my_book.progress)      -> forgot ( ): shows the method itself, not the result
#                                 lupa ( ): yang tampil method-nya, bukan hasilnya
#
# def __str__(self):
#     print(self.name)         -> __str__ must RETURN a string, not print it
#                                 __str__ harus me-RETURN string, bukan mencetaknya
#                                 TypeError: __str__ returned non-string
#
# class Student:
#     scores = []              -> a list as a CLASS attribute is SHARED by every student!
#                                 Create it in __init__: self.scores = []
#                                 list sebagai atribut CLASS dipakai BERSAMA semua mahasiswa!
#                                 Buat di __init__: self.scores = []
#
# Python vs Java:
#   Python                           Java
#   class Book:                      class Book { ... }
#   def __init__(self, title):       Book(String title) { this.title = title; }   (constructor)
#   self.title                       this.title
#   def __str__(self):               public String toString()
#   self._balance  (convention)      private double balance;  (checked by the compiler)
#   class Staff(Member):             class Staff extends Member
#   super().__init__(name)           super(name);
# ---------------------------------------------------------------------------
