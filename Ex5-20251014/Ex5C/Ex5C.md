Quels patterns?



Composite car arbre. Composite : Group. Leaf : Valeur. Operation : demande(Traitement traitement)



Visitor. 

* Client : Traitement
* Visitor : Traitement 
* Concrete Visitor : Listeur, ListeurNom ,Totaliseur 
* Element : Partie
* ConcreteElement : Groupe, Valeur  
* visit(ConcreteElement) : traiteValeur(Valeur) traiteGroupe(Groupe)
* accept(Visitor) : demande(Traitement)
