import kotlin.random.Random

/**
 * ------------------------------------------------------------------------
 * PROJECT NAME HERE
 * Level 2 programming project
 *
 * by YOUR NAME HERE
 *
 * BRIEF PROJECT DESCRIPTION HERE
 * BRIEF PROJECT DESCRIPTION HERE
 * BRIEF PROJECT DESCRIPTION HERE
 * ------------------------------------------------------------------------
 */


/**
 * Program entry point
 */
fun main() {
    // Setup game list
    val game = BuildList()
    displayList(game)


    // Ask for player names
    print("Player 1 name: ")
    val player1 = readln()
    print("Player 2 name: ")
    val player2 = readln()

    var turn = 1


    // Game loop
    while(true) {

        // Player turns
        if (turn == 1){
            println("$player1's turn.")
        }else{
            println("$player2's turn.")
        }


        // Move coin



        // Take coin
        if (game.elementAt(1).toString() != " "){}
    }
    // Check who won
}

fun displayList(List: MutableList <String>) {
    print("┌")
    print("─┬".repeat(List.size-1))
    println("─┐")

    for (i in List) {
        print("│")
    }
}



fun BuildList(): MutableList<String> {
    // Place coins
    val list = mutableListOf<String>()

    // Place 15 empty spaces
    repeat(15){
        list.add( " " )
    }

    // Place silver coins
    repeat(4){
        list.add(Random.nextInt(1, list.size), "S")
    }

    // Place gold coin
    list.add(Random.nextInt(1, list.size), "G")

    return list
}

