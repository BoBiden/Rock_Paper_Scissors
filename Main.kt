fun main() {
    println("Enter Rock, Paper, or Scissors")
    val pl1= readlnOrNull()
    println("Enter Rock, Paper, or Scissors")
    val pl2= readlnOrNull()
    if (pl1==pl2){
        println("Draw")}
    else when(pl1) {
        "Rock" -> when (pl2) {
            "Scissors" -> println("pl1 wins")
            "Paper" -> println("pl2 wins")
        }
        "Scissors"->when(pl2){
            "Rock"-> println("pl2 wins")
            "Paper"-> println("pl1 wins")
        }
        "Paper"->when(pl2){
            "Rock"-> println("pl1 wins")
            "Scissors"-> println("pl2 wins")
        }
    }
}