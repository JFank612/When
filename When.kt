fun main(args: Array<String>) {

    print("Enter a number between 1 and 10:")
    var guess = readLine()!!.toInt()
    var numberString = "x"

    when(guess){
            1 -> numberString = "in Spanish is Uno"
            2 -> numberString = "in German is Zwei"
            3 -> numberString = "in Polish is Trzy"
            4 -> numberString = "in Croatian is Cetiri"
            5 -> numberString = "in Dutch is Vijf"
            6 -> numberString = "in Swahili is Sita"
            7 -> numberString = "in French is Sept"
            8 -> numberString = "in Turkish is Sekiz"
            9 -> numberString = "in Italian is Nove"
            10 -> numberString = "in Swedish is Tio"
            else -> numberString = "Out of Range"

    }
        println("$guess $numberString")
}