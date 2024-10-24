import kotlin.random.Random

/**
 * ------------------------------------------------------------------------
 * OLD GOLD
 * Level 2 programming project
 *
 * by Corban Mooney
 *
 * A short one dimensional game made using a single list to store the
 * game state
 * ------------------------------------------------------------------------
 */


/**
 * Program entry point
 */
fun main() {
    // Setup game list
    val game = buildList()


    // Ask for player names
    print("Player 1 name: ".red())
    val player1 = readln()
    print("Player 2 name: ".cyan())
    val player2 = readln()

    var turn = 1
    var tookCoin: Int


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

            var movedCoin = 0
            var moveTo = 0

            while (movedCoin <= moveTo) {
                print("Which coin would you like to move? (See number below coin): ")
                movedCoin = readln().toInt() - 1
                print("Where would you like to move the coin? (See number below space): ")
                moveTo = readln().toInt() - 1

                // Check if invalid (trying to move right, moving to a spot already full, moving an empty spot, or moving something not within the game list.)
                if ((movedCoin <= moveTo) || (game.elementAt(moveTo) != " ") || (game.elementAt(movedCoin) == " ") || (movedCoin > 19) || (movedCoin < 0)) {
                    println("Invalid Move".red())
                    movedCoin = 0
                    moveTo = 0
                } else {
                    // Check if moving through a coin
                    for ( i in moveTo..<movedCoin) {
                        if (game.elementAt(i) != " ") {
                            println("Invalid Move".red())
                            movedCoin = 0
                            moveTo = 0
                            break
                        }
                    }
                }
            }

            game[moveTo] = game.elementAt(movedCoin)
            game[movedCoin] = " "

            displayList(game)


            // Take coin
            if (moveTo == 0) {
                if (game.elementAt(0).toString() != " ") {
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
        turn = if (turn == 1) 2 else 1
    }
    // Check who won when we break

    if (turn == 1) println("$player1 won!".red())
    if (turn == 2) println("$player2 won!".cyan())

}




fun displayList(list: MutableList <String>) {
    print("┌")
    print("─────┬".repeat(list.size-1))
    println("─────┐")

    for (item in list) {
        print("│ ")
        if (item == "G"){
            print("%-4s".format(item).yellow())
        }else {
            print("%-4s".format(item).grey())
        }
    }
    println("│")

    print("├")
    print("─────┼".repeat(list.size-1))
    println("─────┤")

    for (index in list.indices) {
        print("│")
        print(" %-4s".format(index + 1).grey())
    }
    println("│")

    print("└")
    print("─────┴".repeat(list.size-1))
    println("─────┘")
}



fun buildList(): MutableList<String> {
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

