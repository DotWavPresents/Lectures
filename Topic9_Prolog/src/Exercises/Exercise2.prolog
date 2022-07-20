% Building blocks!

% colorOf(X, Y) means that X's color is Y
colorOf(block1, green).
colorOf(block2, red).
colorOf(block3, yellow).
colorOf(block4, blue).
colorOf(block5, red).

% directlyOnTop(X, Y) means that X is directly on top of Y
directlyOnTop(block1, block2).
directlyOnTop(block2, block3).
directlyOnTop(block3, block4).
directlyOnTop(block4, block5).

% Since block 1 is on directly top of block 2, and block 2 is directly on top of block 3,
% therefore, block 1 is implicitly on top of block 3.
% In other words, block 1 is, by transitivity, on top of block 3
% Create a rule that represents this transitivity property

% TODO Create 1 or more rules here called onTopOf(X, Y),
% which means that X is on top of Y

% ?- onTopOf(block1, block3).
% true.
% ?- onTopOf(block1, block5).
% true.
% ?- onTopOf(block4, block2).
% false.
% ?- onTopOf(block2, block4).
% true.
% ?- onTopOf(X, block3).
% X = block2;
% X = block1.

% Create a rule that lets us ask the following questions:
% Is there a green block on top of a red block?
% Is there a red block on top of a red block?
% Is there a blue block on top of a yellow block?
% What blocks are on top of blue blocks?

% TODO Create a single rule here called colorOnTopOf(X, Y) where
% X is the color of the block on top and Y is the color of the block under X

% ?- colorOnTopOf(green, red).
% true.
% ?- colorOnTopOf(red, red).
% true.
% ?- colorOnTopOf(blue, yellow).
% false.
% ?- colorOnTopOf(X, blue).
% X = yellow;
% X = red;
% X = green.

