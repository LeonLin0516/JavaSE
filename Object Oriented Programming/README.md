###### Feature#1: Encapsulation
- under same file: private, default, protected, public
- udner same package: default, protected, public
- under different package but is a subclass: protected, public
- under different package but not a subclass: public

###### Feature#2: Inheritence

###### Feature#3: Polymorphism
- superclass can points to subclass
- use ovewritten methods from the subclass
- only able to use methods that are shared
- compile time: method implementation in superclass (virtual method invocation)
- run time: method implementation in subclass
- precondition:
  1. inherience relationship
  2. overwritten methods
- attributes do not get overriden. Attributes for the superclass
- instanceof: class cascade