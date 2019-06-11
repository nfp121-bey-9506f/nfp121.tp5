Questions à se poser : 
Que se passe-t-il si on utilise this.add(...) dans cette méthode ? l'utilisation de this.add() dans la methode add,
fait appel a cette methode une deuxieme fois puis troisieme fois puis quatrieme fois....
c'est a dire le processeur ne fini pas le travail (cas de boucle infinie)

Et this.contains() ? "this" est une reference de la class Ensemble, contains est une methode de la classe Vector, 
c'est a dire this.contains n'est pas une expression valide lors de la compilation car la class Ensemble ne contient pas cette methode 

Que déclenche la méthode addAll de la super-classe ?
