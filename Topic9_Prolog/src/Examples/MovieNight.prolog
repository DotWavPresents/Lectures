% age(X, Y) means that the age of X is Y
age(robert, 16). % age of robert is 16
age(amy, 18).

% minimumAge(X, Y) means that the minimum age required to watch movie X is Y
minimumAge(scary, 15).
minimumAge(sexual, 18).

% canWatch(X, Y) means that X can watch movie Y
canWatch(X, Y) :- minimumAge(Y, MinAge), age(X, Age), Age >= MinAge.

% ?- canWatch(amy, sexual).
% true.
% ?- canWatch(robert, sexual).
% false.
% ?- canWatch(X, scary).
% X = robert;
% X = amy.

% Small exercise: How do you ask Prolog for all movie types that robert can watch?