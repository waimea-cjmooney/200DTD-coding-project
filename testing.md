# Test Plan and Evidence / Results of Testing

## Game Description

The project involves the programming of a two-player game.

Old Gold is a game played on a one-dimensional grid where the players move coins closer to the left.

### Game Features and Rules

The game has the following features and/or rules:

- A player may only move a coin to the left.
- A player may not move a coin past another.
- A player may decide to take a coin if it is on the left-most space.
- If a player decides to take a coin, it will end that player's turn.

---

## Test Plan

The following game features / functionality and player actions will need to be tested:

- Moving a coin to the left
- Moving a coin to the right (Not allowed)
- Moving a coin onto itself (Not allowed)
- Moving a coin onto another (Not allowed)
- Moving a coin further than the grid allows (Not allowed)
- Moving an empty space (Not allowed)
- Moving a coin through/over another coin

The following tests will be run against the completed game. The tests should result in the expected outcomes shown.

## Evidence / Results of Testing

### Moving a coin "G" to the left.

https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/cjmooney_waimea_school_nz/ESuhPyqJxqNGrn2_SA4-g1UBxHCRgJJsYCldTu7V-X5Rpw?e=L94G1a&nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZy1MaW5rIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXcifX0%3D

After moving the coin, the coin moved from space 11 to space 8.


### Moving a coin "G" to the right

https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/cjmooney_waimea_school_nz/EfqrNaBlLsBHn2CRGGyxsf4BRWK_bSuxIuAJRCqMMng9zQ?e=FKz99r

After attempting to move a coin to the right, the player is prompted to try another move.


### Moving a coin onto itself

https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/cjmooney_waimea_school_nz/EdC9JoLkq4xIvsfwWsE44h4B_TAaJGFVOGH5UC6YcN79bQ?e=7bUfiv

After attempting to move a coin onto the same space, the player is prompted to try another move.


### Moving a coin onto another

https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/cjmooney_waimea_school_nz/Eef8jgUvHVxNtQK80N931oEBwysKaKNV50v0r6sErfiRiQ?e=w3x7tK

After attempting to move a coin onto an already occupied space, the player is prompted to try another move.


### Moving a coin further than the grid allows

https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/cjmooney_waimea_school_nz/EawQblqZmOJDp7aTOC2xjeEBCv9RxI4HDrR5qwEZKKdS-Q?e=t2PRgc

After attempting to move a coin to non-existent space, the player is prompted to try another move.


### Moving an empty space

https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/cjmooney_waimea_school_nz/EYZYl_BZLV5PmRTGQGsT5WEBYpK-VJjk5ZANIifyEaosuQ?e=gbStya

After attempting to move an empty space, the player is prompted to try another space.


### Moving a coin past another

https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/cjmooney_waimea_school_nz/EbphrOwqqkxJizV7fyadXkIBFnIaHuOSchnQzPao9fDV5A?e=WH9VZx

After attempting to move a coin past another, the player is prompted to try another space.
