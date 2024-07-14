# Home Assignment: Scratch Game #


## Application Specification ##

- Application compiled used JDK >= 1.8
- the project managed by Maven
- Using JACKSON library for serialize/deserialize JSON
- Using JUNIT 4 library for unit test
-
## Description ##

the application will generate a matrix of symbols (for example 3x3) based on probabilities on the configuration file and based on winning combintations user either will win or lost.

Input format:

```
    java -jar <jar-file> --config <config json file> --betting-amount <a betting amount>
    Example :
    java -jar scratch-game-project-0.0.1-SNAPSHOT-jar-with-dependencies.jar --config config.json --betting-amount 100
```

Output format:

```json
{
    "matrix": [
        ["A", "A", "B"],
        ["A", "+1000", "B"],
        ["A", "A", "B"]
    ],
    "reward": 6600,
    "applied_winning_combinations": {
        "A": ["same_symbol_5_times", "same_symbols_vertically"],
        "B": ["same_symbol_3_times", "same_symbols_vertically"]
    },
    "applied_bonus_symbol": "+1000"
}

```
Test Cases:

```
    there is four test cases provided which is cover as follow
    1. win case with bonus reward
    2. win case without bonus reward
    3. lost case with bonus reward 
    4. lost case without bonus reward
```