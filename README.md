# java-racingcar-precourse

# Features

- [ ] implement car
    - [ ] randomly move or stop
    - [ ] set name
    - [ ] print status
- [ ] implement game
    - [ ] set cars
    - [ ] move cars
    - [ ] find winners
- [ ] implement cli
    - [ ] parse user input
    - [ ] print status and result
    - [ ] handle exceptions

## Spec

- A set of cars either move or stop a given number of times.
- Each car has a name. The name should be displayed while showing each progresssion.
- Car names are separated by commas (,) and can have a maximum length of 5 characters.
- The user can determine how many times the car will progress.
- Car moves if the random number between 0 to 9 is greater than or equal to 4.
- The winner is displayed at the end of the game, and there can be multiple winners.
- If there is more than one winner, display the winners' names seperated by commas (,).
- Throw an IllegalArgumentException and exit application if the user provides invalid input.
