% parentOf(X, Y) means that X is the parent of Y
parentOf(amy, alice). % amy is the parent of alice
parentOf(alice, jennifer). % alice is the parent of jennifer

% grandparentOf(X, Y) means that X is the grandparent of Y
% For X to be the grandparent of Y, there must exist a Z such that X is the parent of Z and
% Z is the parent of Y
grandparentOf(X, Y) :- parentOf(X, Z), parentOf(Z, Y).

% ?- grandparentOf(amy, jennifer)
% true.