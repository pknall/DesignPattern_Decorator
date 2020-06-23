#Coffee Shop
### A Decorator Pattern example
This application shows an example of a Decorator Design Pattern by simulating a coffee order from a Coffe Shop.
A full description of the implementation can be found [here](https://www.youtube.com/watch?v=GCraGHx6gso).

This is a weak example of a Decorator Pattern.  The addons, extras or flavors are not "beverages", which does not
make sense since the addons are not (is-a) Beverages.  Also, the decorators are too alike.  A better
implementation may be a collection.  Also, the difference in cost is not a change in behavior.  If the 
operation performed in the "cost()" method were varied, that would be an example of a difference in behavior.

A Better example may be the Input Stream from the Java API.  For example, you can take a File Input Stream and 
decorate it with a Buffered Input Stream or a Line Number Input Stream...which makes more sense since a Buffered
Input Steam is a File Input Stream, and a Line Input Stream is a File Input Stream.
