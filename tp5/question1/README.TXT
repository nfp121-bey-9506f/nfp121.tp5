Questions à se poser : 
Que se passe-t-il si on utilise this.add(...) dans cette méthode ? l'utilisation de this.add() dans la methode add,
fait appel a cette methode une deuxieme fois puis troisieme fois puis quatrieme fois....
c'est a dire le processeur ne fini pas le travail (cas de boucle infinie)

Et this.contains() ? contains est une methode heritee de la classe AbstractCollection
c'est a dire on peut utiliser cette methode au lieu de table.contains 

Que déclenche la méthode addAll de la super-classe ? fait l'union de deux ensembles
