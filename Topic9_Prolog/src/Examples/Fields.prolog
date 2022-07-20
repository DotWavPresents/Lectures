:- use_module(library(clpfd)). % library needed for constraint programming

field(X, Y) :-
  X in 90..110, % 'X in 90..110' means X ∈ { 90,91,...,110 }
  Y in 48..53.

area(X, Y, Area) :-
  field(X, Y),
  Area #> 0,
  Area #= X*Y.


% ?- field(X,Y,Area).
% X in 90..110,
% X*Y#=Area,
% Y in 48..53,
% Area in 4320..5830

perimeter(X, Y, Perimeter) :-
    field(X, Y),
    Perimeter #> 0,
    Perimeter #= 2*X + 2*Y.

% ?- perimeter(X, Y, Perimeter).
% X in 90..110,
% Perimeter#=2*X+2*Y,
% Y in 48..53,
% Perimeter in 276..326,
% 2*_1204#=Perimeter,
% _1204 in 138..163