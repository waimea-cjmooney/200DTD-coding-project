# 200 DTD kotlin project

### Level 2 Programming Project by Corban Mooney

This project is assessed against [AS91896](https://www.nzqa.govt.nz/nqfdocs/ncea-resource/achievements/2019/as91896.pdf)

## Project Description

The project involves the programming of a two-player game.

Old Gold is a game played on a one-dimensional grid where the players move coins closer to the left.

### The game has the following features and/or rules:

- A player may only move a coin to the left.
- A player may not move a coin past another.
- A player may decide to take a coin if it is on the left-most space.
- If a player decides to take a coin, it will end that player's turn.

## Source Code

The project is written in [Kotlin](https://kotlinlang.org/)

The main source file is [Main.kt](src/Main.kt)


## Documentation

Evidence of testing can be found in [testing.md](testing.md)


## Running the Program

You can either clone this whole repo, open it using [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) and run from source; or you can run the compiled program:

1. Install the [Java runtime (JRE)](https://www.java.com/en/download/) installed to run the program.
2. Go to the [out/artifacts](out/artifacts) folder
3. Locate and download the compiled **JAR file** (e.g. FILENAME.jar)
4. Run the following command:
    ```bash
    java -jar FILENAME.jar
    ```
