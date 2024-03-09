*Jawaban Pertanyaan Praktikum03 GKV Lab D2*
NAMA : MUTHIA ZHAFIRA SAHNAH 
NIM : 24060122130071

1. Secara konsep, ada yang kurang tepat pada program Asersi2 diatas ? 
-Asersi digunakan untuk memastikan bahwa nilai jari2 lingkaran tidak boleh nol. namun dalam kasus ini, penggunaan asersi untuk memeriksa apakah nilai jari-jari lebih besar dari 0 sebelum membuat objek Lingkaran tidak sepenuhnya tepat. Sebaiknya, validasi input seperti ini harus dilakukan dengan menggunakan pernyataan if dan menghasilkan penanganan kesalahan yang sesuai, misalnya dengan melempar pengecualian (exception) jika input tidak sesuai.
Jadi, secara konsep, meskipun program tersebut mungkin berfungsi, penggunaan asersi untuk validasi input seperti ini tidak dianggap sebagai praktik terbaik. Lebih baik menggunakan pernyataan if dan penanganan kesalahan yang tepat.

2.*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
- ya pada saat cobaangka(10) dia dieksekusi karena 10 bukan 13 
*Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
-iya dieksekusi ketika terjadi eksepsi sataat mencoba angka 13 , dia akan mengeluarkan pesan dari file exception dan sekaligus yang didalam file yaitu hati2 memasukkan angka.