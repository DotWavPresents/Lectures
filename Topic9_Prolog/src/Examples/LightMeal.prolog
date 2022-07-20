:- use_module(library(clpfd)). % library needed for constraint programming

% food types with concrete ingredients and how much they fill our stomach
meat(steak, 5). % steak fills up out stomach with 5 units of food. So, if our stomach's capacity was 10, we'd be 50% full
meat(pork, 7).
fish(sole, 2).
fish(tuna, 4).
dessert(fruit, 2).
dessert(icecream, 6).
main_course(M, I) :- meat(M, I).
main_course(M, I) :- fish(M, I).
starter(salad, 1).
starter(soup, 6).

% We want light meals to be composed of a starter, a main course, and a dessert.
% Having the '#>' constrant isn't necessary in this case, but it's usually used
% when we want to restrict variables to positive numbers
light_meal(S,M,D) :-
	I #> 0, J #> 0, K #> 0, I + J + K #=< 10,
	starter(S, I), main_course(M, J), dessert(D, K).
