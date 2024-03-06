# TeachMeSkills_C27_Lesson_9_HW
Homework for the ninth lesson

Task 1.
We created three classes: triangle, circle and rectangle. These classes contain fields: side, height, radius. Created an abstract class "figure" to implement the function of calculating the area and perimeter of each of the figures, as well as the sum of the perimeters of all figures. For the "Figure" class the sealed modifier was used.
Created a runner class that contains an array that displays information about each figure and all calculations.

Task 2.
This is a program that multiplies two matrices.
the program has three classes: a runner, for running the program, a utils class, which stores a static method for displaying the matrix on the screen.
The method takes a two-dimensional array as input.
And the last class "Matrix Multiplication" contains a method with the prescribed logic for multiplying matrices

Task 3.
This is a program that allows you to transfer money from one card to another. The card selection is carried out through the console using the scanner method. The program provides for a commission when transferring money, as well as transfers in foreign currency. The program also provides transfer limits depending on the type of card.
We have a client class, which contains the necessary information about him: name, address, country, date of birth, as well as the number of cards (implemented through an array).
There is an abstract class Card, which stores common data for all cards. The "Card" class is extended by other classes: BelCard, MasterCard, VisaCard.
A separate class has been written for creating and storing customer cards. Interfaces for storing constants have been created (CommissionConst,
Currency Code
CurrencyExchange
LimitConst).

The Transfer class contains two methods. One allows the user to select a card for transfer, the second is necessary directly for making transfers. The program also provides various checks and validations.
