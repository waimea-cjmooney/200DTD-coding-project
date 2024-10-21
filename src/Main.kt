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


    // Ask for player names
    print("Player 1 name: ".red())
    val player1 = readln()
    print("Player 2 name: ".cyan())
    val player2 = readln()

    var turn = 1
    var tookCoin = 0


    // Game loop
    while (true) {

        displayList(game)

        // Player turns
        if (turn == 1) {
            println("$player1's turn.".red())
        } else {
            println("$player2's turn.".cyan())
        }


        // Take coin
        tookCoin = 0
        if (game.elementAt(0).toString() != " ") {
            println("Take coin on the left? [Y]/[N]".red())
            if (readln().first().uppercase() == "Y") {
                // If taken coin is Gold then Stop game loop
                if (game.elementAt(0).toString() == "G") {
                    break
                } else {
                    game[0] = " "
                    displayList(game)
                }
                tookCoin = 1
            }
        }

        // Move coin
        if (tookCoin != 1) {
            print("Which coin would you like to move? (See number below coin): ")
            val movedCoin = readln().toInt() - 1
            print("Where would you like to move the coin? (See number below space): ")
            val moveTo = readln().toInt() - 1

            game[moveTo] = game.elementAt(movedCoin)
            game[movedCoin] = " "

            // Take coin
            if (moveTo == 0) {
                if (game.elementAt(0).toString() != " ") {
                    displayList(game)
                    println("Take coin on the left? [Y]/[N]".red())
                    if (readln().first().uppercase() == "Y") {
                        if (game.elementAt(0).toString() == "G") {
                            break
                        } else {
                            game[0] = " "
                        }
                    }
                }
            }
        }
        // Switch turns
        if (turn == 1) turn = 2 else turn = 1
    }
    // Check who won

    if (turn == 1) println("$player1 won!".red())
    if (turn == 2) println("$player2 won!".cyan())

}




fun displayList(List: MutableList <String>) {
    print("┌")
    print("─────┬".repeat(List.size-1))
    println("─────┐")

    for (item in List) {
        print("│ ")
        if (item == "G"){
            print("%-4s".format(item).yellow())
        }else {
            print("%-4s".format(item).grey())
        }
    }
    println("│")

    print("├")
    print("─────┼".repeat(List.size-1))
    println("─────┤")

    for (index in List.indices) {
        print("│")
        print(" %-4s".format(index + 1).grey())
    }
    println("│")

    print("└")
    print("─────┴".repeat(List.size-1))
    println("─────┘")
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

