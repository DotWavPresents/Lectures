:- use_module(library(clpfd)). % library needed for constraint programming

% Create a predicate called factorial(X, Y), which means that the factorial of X is Y
% Remember: a factorial in math is represented as a '!'
% 3! = 3 * 2 * 1 = 6
% 5! = 5 * 4 * 3 * 2 * 1 = 120
% 0! = 1, by definition

% Tips: The negation of #= is #\=

% TODO Complete the following incomplete predicate
factorial(0, 1). % The factorial of 0 is 1, by definition
factorial(Number, Factorial) :-
        Number #> 0,
        NextNumber #= Number - 1.
        % TODO Incomplete. Hint 1: You'll need a few more restrictions
        % Hint 2: You will need to use recursion. Remember Functional Programming?

% ?- factorial(0, X).
% X = 0.
% ?- factorial(3, X).
% X = 6.
% ?- factorial(5, X).
% X = 120.
% ?- factorial(10, X).
% X = 3628800.
% ?- factorial(X, 6).
% X = 3.