fun main(){
    val discountStandart = 100 // стандартная скидка
    val discountPercent = 0.5 // скидка процентом
    val discountMelomans = 0.1
    val melomans = arrayListOf<String>("Zukh","ilyo", "Muza")
    var musicPrice = 10F

    fun buying(name:String, quantity:Int){
        musicPrice = musicPrice * quantity
        if (musicPrice > 0 && musicPrice <= 1000){
            println("k оплате: ${musicPrice}")
        }else if (musicPrice >= 1001 && musicPrice <= 10_000){
            musicPrice -= 100
            println("k оплате: ${musicPrice}, Специальная скидка: ${discountStandart} руб.")
        }else if (musicPrice >= 10_001){
            var discount = ((musicPrice * discountPercent).toFloat()) / 100
            musicPrice = musicPrice - discount
            if (name in melomans){
                var discountForMelomans = (musicPrice * discountMelomans).toFloat() / 100
                var musicPriceForMelomans = musicPrice - discount
                discount = discount + discountForMelomans
                println("k оплате: ${musicPriceForMelomans}, Специальная скидка: ${discount} руб.")
            }else{
                println("k оплате: ${musicPrice}, Специальная скидка: ${discount} руб.")
            }
        }else println("Минимальная музыка: 1")
    }
    buying("Tima", 1_000_000)
}