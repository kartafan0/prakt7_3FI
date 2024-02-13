fun main(){
    println("№5")
    println("Введите радиус цлиндра")
    var r = readln()!!.toDouble()
    println("Введите высоту цлиндра")
    var h = readln()!!.toDouble()
    when{
        (r < 0) -> println("не корректный радиус")
        (h < 0) -> println("не корректная высота")
        else -> {
            var v: Double = (r*r*3.14)*h
            println("Объём цилиндра = ${String.format("%.3f", v)}")
        }
    }
    println("№15")
    println("Введите 4-хзначное число")
    var num = readln()!!.toInt()
    var proiz = 1
    var numb = num
    while(numb!=0){
        var a = numb % 10
        proiz *= a
        numb /= 10
    }
    println("$proiz")
    println("№5")
    println("Введите радиус круга")
    r = readln()!!.toDouble()
    println("Введите x")
    var x = readln()!!.toDouble()
    println("Введите y")
    var y = readln()!!.toDouble()
    var dist: Double = 0.0
    when{
        (r>0) -> {
            dist = Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0))
        }
    }
    when{
        (dist > r) -> println("точка А($x,$y) находится вне круга")
        else -> println("точка А($x,$y) находится в круге")
    }
    println("№15")
    println("Введите k")
    var k = readln()!!.toDouble()
    println("Введите b")
    var b = readln()!!.toDouble()
    println("Введите c")
    var c = readln()!!.toDouble()
    println("Введите d")
    var d = readln()!!.toDouble()
    println("№20")
}