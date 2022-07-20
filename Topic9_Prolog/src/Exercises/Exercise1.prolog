% Lets create a knowledge base that holds all marriages in the world! (not really, that's too hard)
% Our world consists of 6 people: alice, rafael, mp3, wav, not_adam, not_nexus
% Here's our current marital statuses:

marriedTo(alice, rafael).
marriedTo(mp3, wav).
marriedTo(not_adam, not_nexus).

% Now, if we were to ask Prolog the following:
% ?- marriedTo(alice, rafael).
% we'd get 'true', as expected
% And ?- marriedTo(mp3, not_nexus).
% would return 'false', as expected.
% However, doing ?- marriedTo(rafael, alice) returns 'false'
% In the real world, if alice is married to rafael, then rafael is also married to alice
% A way to solve this would be to duplicate all facts and invert the names in them
% However, that's innefficient. There is a way to infer marital status
% by using a single rule. Create it!

% TODO Create a single rule here

% ?- marriedTo(rafael, alice).
% true.
% ?- marriedTo(X, mp3).
% X = wav.