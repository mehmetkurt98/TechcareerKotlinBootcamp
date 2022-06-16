package com.mehmetkurt.techcareerhomework.odevler

class Odev2 {
    fun soru1(derece:Double) : Double{
        var dereceToFahreneit=derece*1.8+32
        return dereceToFahreneit
    }
    fun soru2(uzunKenar:Int,kısaKenar:Int) :Int{
        var dikdörtgenCevre=(uzunKenar+kısaKenar)*2
        return dikdörtgenCevre

    }
    fun soru3(sayi:Int):Int{
        var faktoriyel=1
        var i = 1

        while(sayi>=i){
            faktoriyel=faktoriyel*i
            i++
        }
        return faktoriyel

    }

    fun soru4(kelime:String,harf:Char):Int{
        var adet=0
        kelime.forEach {
            if (it == harf) {
                adet += 1
            }
        }

        return adet
    }
    fun soru5(kenarSayisi:Int) :Int{
        var icAcı=(kenarSayisi-2)*180
        return icAcı

    }
    fun soru6(gunSayısı:Int) :Int{
        var ucret=0
        var topCalismaSuresi=gunSayısı*8
        if(topCalismaSuresi>160){
            ucret=1600+(topCalismaSuresi-160)*20
        }
        else{
            ucret=10*topCalismaSuresi
        }
        return ucret
    }
    fun soru7(kota:Int):Int{
        var ucret=0
        if(kota<=50){
            ucret=kota*2
        }
        else{
            ucret=100+(kota-50)*4
        }
        return ucret
    }




}