# YoRPG -- Team NYAH
### Roster: Hugo Jenkins + Boary; Anthony Sun + Corn; Nakib Abedin + Joker
---
## Protagonists:
### Fighter
- "This class hits harder, but when it goes down, it stays down."
- strength is increased
- specialize: Increases strength but reduces defense

### Tank
- "This class doesn't pack a punch but it sure can take one"
- health is increased, but strength is decreased
- specialize: attackRating decreases, defense increases

### Healer
- "This class isn't the most durable or hardest hitting, but it can heal itself at a cost"
- Health is increased slightly
- specialize: heals itself, but skips its attack.
---
## Monsters:
### Goblin
- "This little brat is quite weak, but it has a random chance to hit a little harder."
- Increases attackRating by up to 0.5.

### Troll
- "This beast ate one too many taco bell meals. It can take a beating on both the toilet and the battlefield."
- Health increased, defense increased.

### Dragon
- "This fiery beast is one you don't wanna mess with."
- strength is greatly increased.
---
## Version-to-Version Changes
### v0
- Added the Protagonist and Monster classes with all of the methods and variable which we knew we needed from the drived class
### v1
- Added the Character superclass and made the Protagonist and Monster classes subclasses of Character
### v2
- Added Protagonist subclasses: Fighter, Tank, and Healer
- Added Monster subclasses: Goblin, Troll, and Dragon
- Modified the driver class so that the player can choose their role
- Added a randomizer in the driver class to choose the type of Monster
### v3
- Added descriptions for each character when picking
- Implemented toString() methods to make referencing monsters easier
---
## Our Future Plans
### Additions
- Add more subclasses to create more variety in how you can play the game
- Add a multiplayer mode
