package com.ammar.veterinariansapps

object VetData {

    private val vetPhoto = arrayOf(
            R.drawable.vet1,
            R.drawable.vet2,
            R.drawable.vet3,
            R.drawable.vet4,
            R.drawable.vet5,
            R.drawable.vet6,
            R.drawable.vet7,
            R.drawable.vet8,
            R.drawable.vet9,
            R.drawable.vet10,
            R.drawable.vet11,
            R.drawable.vet12
    )
    private val vetName = arrayOf(
            "RN Pet Care",
            "Jakarta Vet Cempaka Putih",
            "Pet Vet",
            "Jakarta Vet Cideng",
            "Practice Veterinarians Gunawan Rahardja & Partners",
            "Dokter Hewan Gloriouz Pet",
            "Praktek Dokter Hewan Piara Pulomas",
            "Paws Kartini",
            "Animal Clinic Jakarta",
            "Bintang Vet Clinic (Glory Petshop)",
            "R Pet Care Tanjung Duren",
            "My Vets Kemang",
    )
    private val vetCity = arrayOf(
            "Jakarta Timur",
            "Jakarta Pusat",
            "Jakarta Pusat",
            "Jakarta Pusat",
            "Jakarta Utara",
            "Jakarta Pusat",
            "Jakarta Timur",
            "Jakarta Pusat",
            "Jakarta Selatan",
            "Jakarta Barat",
            "Jakarta Barat",
            "Jakarta Selatan",

    )

    private val vetAddress = arrayOf(
            "Jl. Raya Cilangkap No.140, Cilangkap, Kec. Cipayung, Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta 13870",
            "Jl. Cempaka Putih Tengah XXX No.5a, RT.9/RW.7, Cemp. Putih Tim., Kec. Cemp. Putih, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10510",
            "Animal Clinic Indonesia, 10 PET+VET, Jl. K.H. Mas Mansyur No.8A, RW.6, Karet Tengsin, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10220",
            "Jl. Cideng Timur No.11 H, RT.5/RW.4, Petojo Utara, Kecamatan Gambir, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10130",
            "Jl. Raya Klp. Hybrida No.Blok QG-10/21, RT.4/RW.11, Klp. Gading Bar., Kec. Klp. Gading, Kota Jkt Utara, Daerah Khusus Ibukota Jakarta 14240",
            "Rukan Indra Sentra, Jl. Letjen Soeprapto No.60, RT.8/RW.3, Cemp. Putih Bar., Kec. Cemp. Putih, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10520",
            "Jl. Pulomas I No.46, RW.12, Kayu Putih, Kec. Pulo Gadung, Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta 13210",
            "Jalan Kartini III No. 28K2, RT.3/RW.5, Kartini, Kecamatan Sawah Besar, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10750",
            "Jl. Warung Buncit Raya No.23, RT.2/RW.7, Pejaten Bar., Kec. Ps. Minggu, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12510",
            "Jl. Tj. Duren Barat 1 No.19C, RT.6/RW.3, North Tanjung Duren, Grogol petamburan, West Jakarta City, Jakarta 11470",
            "R Pet Care, Jl. Tj. Duren Barat I, RT.14/RW.3, North Tanjung Duren, Grogol petamburan, West Jakarta City, Jakarta 11470",
            "Jl. Kemang Selatan VIII No.7A, RW.7, Cipete Sel., Kec. Cilandak, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12730",
    )

    private val vetOpenHours = arrayOf(
            "06.00",
            "09.00",
            "06.00",
            "09.00",
            "09.00",
            "09.00",
            "09.00",
            "09.00",
            "09.30",
            "11.00",
            "09.00",
            "09.00",
    )

    private val vetCloseHours = arrayOf(
            "06.00",
            "17.00",
            "22.00",
            "17.00",
            "17.00",
            "17.00",
            "21.00",
            "17.00",
            "16.00",
            "20.00",
            "22.00",
            "17.00"
    )

    private val vetPhone = arrayOf(
            "0813-8452-6422",
            "021-4241-880",
            "0857-7777-2900",
            "021-2263-1591",
            "021-4523-136",
            "0878-4288-6262",
            "021-2247-1573",
            "0813-1737-4556",
            "021-7902-371",
            "0811-1880-20",
            "-",
            "021-7668-241"
    )

    private val vetLinkMaps = arrayOf(
            "https://www.google.com/maps/place/RN+PET+CARE+(PETSHOP+%26+Praktek+Dokter+Hewan)+Cab.+CILANGKAP/@-6.2618615,106.8099309,12z/data=!4m19!1m13!4m12!1m4!2m2!1d106.8532384!2d-6.1857034!4e1!1m6!1m2!1s0x2e69edfdb0e1da0d:0xaafc2ef75848d1f8!2sveterinarian+near+me!2m2!1d106.8990109!2d-6.3380488!3m4!1s0x2e69edfdb0e1da0d:0xaafc2ef75848d1f8!8m2!3d-6.3380488!4d106.8990109",
            "https://www.google.com/maps/place/Jakarta+Vet+Cempaka+Putih/@-6.1777593,106.8538658,15z/data=!4m19!1m13!4m12!1m4!2m2!1d106.8532384!2d-6.1857034!4e1!1m6!1m2!1s0x2e69f503e4f90675:0x8b285d7d50280dd1!2sveterinarian+near+me!2m2!1d106.8714457!2d-6.170427!3m4!1s0x2e69f503e4f90675:0x8b285d7d50280dd1!8m2!3d-6.170427!4d106.8714457",
            "https://www.google.com/maps/place/Pet+Vet/@-6.2057092,106.8072667,13z/data=!4m19!1m13!4m12!1m4!2m2!1d106.8532384!2d-6.1857034!4e1!1m6!1m2!1s0x2e69f6a79804990b:0x9081b8d7050e3dc!2sveterinarian+near+me!2m2!1d106.8163832!2d-6.2053808!3m4!1s0x2e69f6a79804990b:0x9081b8d7050e3dc!8m2!3d-6.2053808!4d106.8163832",
            "https://www.google.com/maps/place/Jakarta+Vet+Cideng/@-6.1750344,106.8144517,14z/data=!4m19!1m13!4m12!1m4!2m2!1d106.8532384!2d-6.1857034!4e1!1m6!1m2!1s0x2e69f670d8b7ece5:0x86aae1ecc807ad5e!2sveterinarian+near+me!2m2!1d106.81085!2d-6.1641578!3m4!1s0x2e69f670d8b7ece5:0x86aae1ecc807ad5e!8m2!3d-6.1641578!4d106.81085",
            "https://www.google.com/maps/place/Practice+Veterinarians+Gunawan+Rahardja+%26+Partners/@-6.1662158,106.8422517,13z/data=!4m19!1m13!4m12!1m4!2m2!1d106.8532384!2d-6.1857034!4e1!1m6!1m2!1s0x2e69f5364c9a8875:0x5094e602ab9aa1cb!2sveterinarian+near+me!2m2!1d106.9069916!2d-6.1469499!3m4!1s0x2e69f5364c9a8875:0x5094e602ab9aa1cb!8m2!3d-6.1469499!4d106.9069916",
            "https://www.google.com/maps/place/Dokter+Hewan+Gloriouz+Pet/@-6.178589,106.8502908,15z/data=!4m19!1m13!4m12!1m4!2m2!1d106.8532384!2d-6.1857034!4e1!1m6!1m2!1s0x2e69f5aa640a4231:0x87cba8229587ee92!2sveterinarian+near+me!2m2!1d106.8642931!2d-6.1724334!3m4!1s0x2e69f5aa640a4231:0x87cba8229587ee92!8m2!3d-6.1724334!4d106.8642931",
            "https://www.google.com/maps/place/PRAKTEK+DOKTER+HEWAN+PIARA+PULOMAS/@-6.1856061,106.8489371,14z/data=!4m19!1m13!4m12!1m4!2m2!1d106.8532384!2d-6.1857034!4e1!1m6!1m2!1s0x2e69f4e2f9e43417:0x1911685484d8ef04!2sveterinarian+near+me!2m2!1d106.8816037!2d-6.1750592!3m4!1s0x2e69f4e2f9e43417:0x1911685484d8ef04!8m2!3d-6.1750592!4d106.8816037",
            "https://www.google.com/maps/place/Paws+Kartini/@-6.173883,106.8259004,14z/data=!4m19!1m13!4m12!1m4!2m2!1d106.8532384!2d-6.1857034!4e1!1m6!1m2!1s0x2e69f5247c47adb1:0x1ec779b2ba3a45ca!2sveterinarian+near+me!2m2!1d106.8341087!2d-6.1572115!3m4!1s0x2e69f5247c47adb1:0x1ec779b2ba3a45ca!8m2!3d-6.1572115!4d106.8341087",
            "https://www.google.com/maps/place/Animal+Clinic+Jakarta/@-6.2214064,106.8047117,13z/data=!4m19!1m13!4m12!1m4!2m2!1d106.8532384!2d-6.1857034!4e1!1m6!1m2!1s0x2e69f226d2c3e507:0x9372c0437ef63c5c!2sveterinarian+near+me!2m2!1d106.8299624!2d-6.2753054!3m4!1s0x2e69f226d2c3e507:0x9372c0437ef63c5c!8m2!3d-6.2753054!4d106.8299624",
            "https://www.google.com/maps/place/BINTANG+VET+CLINIC+(+GLORY+PETSHOP)/@-6.1790035,106.7812065,13z/data=!4m19!1m13!4m12!1m4!2m2!1d106.8532384!2d-6.1857034!4e1!1m6!1m2!1s0x2e69f73308e3da67:0x534b4b8606cd228d!2sveterinarian+near+me!2m2!1d106.7814831!2d-6.173684!3m4!1s0x2e69f73308e3da67:0x534b4b8606cd228d!8m2!3d-6.173684!4d106.7814831",
            "https://www.google.com/maps/place/R+PET+CARE+TANJUNG+DUREN/@-6.1790035,106.7812065,13z/data=!4m19!1m13!4m12!1m4!2m2!1d106.8532384!2d-6.1857034!4e1!1m6!1m2!1s0x2e69f71960943e37:0x4318b0cc2bf595e8!2sveterinarian+near+me!2m2!1d106.7803742!2d-6.1737487!3m4!1s0x2e69f71960943e37:0x4318b0cc2bf595e8!8m2!3d-6.1737487!4d106.7803742",
            "https://www.google.com/maps/place/My+Vets+Kemang/@-6.2266353,106.79212,13z/data=!4m19!1m13!4m12!1m4!2m2!1d106.8532384!2d-6.1857034!4e1!1m6!1m2!1s0x2e69f185da1c68db:0x7cdc4b1e4e4e0239!2sveterinarian+near+me!2m2!1d106.8116562!2d-6.2669986!3m4!1s0x2e69f185da1c68db:0x7cdc4b1e4e4e0239!8m2!3d-6.2669986!4d106.8116562"

    )

    val listVet: ArrayList<Vet>
    get() {
        val list = arrayListOf<Vet>()
        for(position in vetName.indices){
            val vet = Vet()
            vet.vetPhoto = vetPhoto[position]
            vet.vetName = vetName[position]
            vet.vetCity = vetCity[position]
            vet.vetAddress = vetAddress[position]
            vet.vetOpenHours = vetOpenHours[position]
            vet.vetCloseHours = vetCloseHours[position]
            vet.vetPhone = vetPhone[position]
            vet.vetLinkMaps = vetLinkMaps[position]
            list.add(vet)
        }
        return list
    }
}