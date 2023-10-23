# RMIProject

Le projet "Gestion des Machines et des Salles" est une application informatique conçue pour simplifier la gestion des machines et des salles au sein d'un environnement donné. Ce projet repose sur une interface graphique utilisateur (GUI) développée en utilisant la technologie Swing de Java, offrant ainsi aux utilisateurs une expérience conviviale et intuitive pour interagir avec le système. Grâce à cette interface graphique, les utilisateurs peuvent facilement ajouter, modifier, supprimer et visualiser des informations liées aux machines et aux salles. Que vous soyez responsable d'un laboratoire, d'une entreprise ou de tout autre environnement nécessitant la gestion de machines et de salles, cette application basée sur Swing simplifie et rationalise le processus tout en garantissant une navigation aisée et une utilisation efficace.
## Table des Matières

- [Tehnologie utilisée](#tehnologie-utilisée)
- [Fonctionnalités](#fonctionnalités)
- [Capture d'écran](#captures-décran)
- [Utilisation](#utilisation)
- [Installation](#installation)

##  Tehnologie utilisée
- Java.
- MySQL.
- Hibernate.
- RMI.
## Fonctionnalités

Le projet "Gestion des Machines et des Salles" offre plusieurs fonctionnalités utiles pour la gestion des machines et des salles. Voici quelques-unes des fonctionnalités clés :

1. **Ajout de Machines** : Permet d'ajouter de nouvelles machines en spécifiant leur référence, marque, prix et salle d'appartenance.

2. **Modification de Machines :** Vous pouvez mettre à jour les informations d'une machine existante, y compris sa référence, marque, prix et salle associée.

3. **Suppression de Machines :** Permet de supprimer une machine de la base de données.

4. **Liste des Machines :** Affiche la liste complète de toutes les machines existantes avec leurs détails.

5. **Filtrage par Salle :** Vous pouvez filtrer la liste des machines par salle, ce qui facilite la gestion des machines dans des emplacements spécifiques.

6. **Ajout de Salles :** En plus de la gestion des machines, le projet permet d'ajouter de nouvelles salles en spécifiant leur code.

7. **Modification de Salles :** Vous pouvez mettre à jour les informations d'une salle existante.

8. **Suppression de Salles :** Permet de supprimer une salle de la base de données.

9. **Liste des Salles :** Affiche la liste complète de toutes les salles existantes.

Ces fonctionnalités offrent un moyen convivial de gérer les machines et les salles dans votre environnement, en facilitant leur ajout, leur modification et leur suppression, tout en permettant de voir clairement quelles machines sont présentes dans chaque salle.
## Captures d'écran
interface de Gestion des Machines:
![image](https://github.com/Ghaziyassine/RMIProject/assets/114885285/c95f765a-0b45-4d5b-85e9-f5a76d5e6d11)
interface de Gestion des Salees :
![image](https://github.com/Ghaziyassine/RMIProject/assets/114885285/4d24a35e-04e3-4654-9ef9-7beed947e0d7)

##  Utilisation

### Accès à l'Application

- Assurez-vous que le projet est en cours d'exécution en suivant les étapes d'installation et de configuration du fichier README.
- Ouvrez votre navigateur web et accédez à l'application en utilisant l'URL suivante : [http://localhost:1099](http://localhost:1099) (ou l'URL spécifiée lors de la configuration du serveur,vous pouvez changer cette configuration dans le fichier configuration.properties).

### Ajout de Machines

- Sur la page d'accueil de l'application, repérez la section permettant d'ajouter une nouvelle machine.
- Remplissez les champs obligatoires, tels que la référence, la marque, le prix et la salle d'appartenance.
- Cliquez sur le bouton "Ajouter" pour enregistrer la machine.

### Modification de Machines

- Sur la liste des machines (accessible depuis le menu principal), localisez la machine que vous souhaitez modifier.
- Cliquez sur la machine, ce qui vous redirigera vers une page de modification.
- Vous pouvez maintenant mettre à jour les détails de la machine.
- Cliquez sur le bouton "Modifier" pour enregistrer les modifications.

### Suppression de Machines

- Sur la liste des machines, trouvez la machine que vous souhaitez supprimer.
- Cliquez sur le bouton "Supprimer" à côté de la machine sélectionnée.
- Vous serez invité à confirmer la suppression. Cliquez sur "OK" pour supprimer la machine.

### Liste des Machines

- Vous pouvez afficher la liste complète de toutes les machines existantes en accédant à la page de liste des machines depuis le menu principal.

### Filtrage par Salle

- Si vous souhaitez filtrer la liste des machines par salle, vous pouvez utiliser l'option "Filtrer par Salle" sur la page de liste des machines. Sélectionnez la salle de votre choix pour voir uniquement les machines qui y sont associées.

### Ajout de Salles

- En plus de la gestion des machines, l'application permet d'ajouter de nouvelles salles.
- Sur la page d'accueil de l'application, recherchez la section pour ajouter une nouvelle salle.
- Saisissez le code de la salle et cliquez sur le bouton "Ajouter" pour enregistrer la salle.

### Modification de Salles

- Pour modifier les informations d'une salle existante, accédez à la liste des salles depuis le menu principal.
- Cliquez sur la salle que vous souhaitez modifier, puis suivez les étapes de modification similaires à celles des machines.

### Suppression de Salles

- La suppression d'une salle se fait également depuis la liste des salles. Cliquez sur le bouton "Supprimer" à côté de la salle sélectionnée et confirmez la suppression.

Ces étapes vous guideront dans l'utilisation efficace de l'application pour gérer les machines et les salles. Explorez les fonctionnalités pour une expérience complète.


## Installation

Suivez ces étapes pour installer et configurer le projet "Gestion des Machines et des Salles" sur votre système :

### Prérequis

Assurez-vous d'avoir ces éléments installés sur votre système :

- Java Development Kit (JDK) 8 ou supérieur
- Maven
- Git

### Clonage du Projet

1. Ouvrez votre terminal ou invite de commandes.

2. Utilisez la commande `git` pour cloner le projet depuis GitHub :
   ```bash
   git clone https://github.com/Ghaziyassine/RMIProject.git

